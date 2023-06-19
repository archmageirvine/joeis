/* Properties and methods for a uniform tiling and its coordination sequences
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-15, Georg Fischer: extracted from Tiler.java
 */
package org.teherba.tile;
import java.io.Serializable;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * This class generates coordination sequences for k-uniform tilings
 * in the OEIS as specified by Brian Galebach.
 * A uniform tiling is built from a subset of the regular polygons
 * triangle, square, hexagon and dodecagon (other regular polygons like
 * the pentagon cannot be used). All edges are of unit length.
 * At the corners one of the 11 Archimedean vertex types occur,
 * maybe in reverse (flipped) orientation.
 * A coordination sequence enumerates the number of vertices
 * which have a certain minimal distance to the base vertex.
 *
 * @author Georg Fischer
 */
public class TilingSequence extends AbstractSequence implements Serializable {

  /** Debugging mode: 0=none, 1=some, 2=more */
  public static int sDebug;

  /** Whether to care about back links (default: false) */
  public static boolean sBackLink;

  /** index of the first sequence element */
  protected int mOffset;

  /** Possible {@link VertexType}s in this tiling */
  public VertexTypeArray mTypeArray;

  /** Allocated edges */
  public EdgeList mEdgeList;

  /** Whether to store edges */
  public boolean mStoreEdges;

  /** Allocated vertices */
  public VertexList mVertexList;

  /** Positions to vertices */
  public PositionMap mPosMap;

  /** Index of the base {@link Vertex} for the coordination sequence */
  public int mBaseIndex;

  /** Queue for vertices which must be investigated for next shell */
  private LinkedList<Integer> mQueue;

  /** Distance of the current shell to the base vertex */
  private int mDistance;

  /** How many vertices were added for current shell */
  private int mShellCount;

  /**
   * Empty Constructor - not used.
   */
  public TilingSequence() {
    super(0);
  } // Constructor

  /**
   * Constructor from {@link VertexTypeArray}.
   * Initializes the data structures of <em>this</em> TilingSequence.
   * @param offset index of first sequence element
   * @param typeArray array of {@link VertexType}s for this TilingSequence
   */
  public TilingSequence(final int offset, final VertexTypeArray typeArray) {
    super(offset);
    configure(offset, typeArray);
  } // Constructor(int,VertexTypeArray)

  /**
   * Constructor from pairs of Strings.
   * Initializes the data structures of <em>this</em> TilingSequence.
   * @param offset index of first sequence element
   * @param pairs String array of semicolon-separated pairs <code>"vertexId;taRotList"</code>
   */
  public TilingSequence(final int offset, String[] pairs) {
    super(offset);
    final int vertexTypeNo = pairs.length;
    VertexTypeArray typeArray = new VertexTypeArray(vertexTypeNo);
    for (final String pair : pairs) {
      typeArray.decodeNotation(pair);
    } // for ipair
    configure(offset, typeArray);
  } // Constructor(int,String[])

  /**
   * Configures the data structures of <em>this</em> {@link TilingSequence},
   * and sets the first {@link VertexType} as base vertex.
   * @param offset index of first sequence element
   * @param typeArray array of VertexType for this TilingSequence
   */
  protected void configure(final int offset, final VertexTypeArray typeArray) {
    mStoreEdges = false;
    mOffset = offset;
    sBackLink = false;
    mDistance = 0;
    mShellCount = 0;
    Vertex.sDebug = sDebug;
    VertexType.sDebug = sDebug;
    VertexTypeArray.sDebug = sDebug;
    mTypeArray = typeArray;
    mTypeArray.complete();
  } // configure(VertexTypeArray)

  /**
   * Defines the initial set of vertices, and initializes the tiling's dynamic data structures.
   * @param mode defines the set of vertices for the initial shell:
   * <ul>
   * <li>0 = one base vertex</li>
   * <li>1 = polygon defined by the base vertex and the edge - the polygon is to the right of the edge</li>
   * <li>2 = all polygons around the base vertex (evaluated by the caller)</li>
   * <li>3 = the base vertex and the proxy at the end of the edge</li>
   * <li>4 = all pairs base vertex, proxy (evaluated by the caller)</li>
   * </ul>
   * @param baseIndex {@link VertexType} index of the first {@link Vertex}
   * @param baseEdge number of an edge of the vertex with {@link VertexType} index <code>baseIndex</code>.
   * This edge defines a polygon for modes 1,2. For modes 3,4, the proxy at the end of the edge is the second base vertex.
   * the polygon is to the right of the edge viewed in the direction of the proxy
   * at the end of the edge.<br>
   * All vertices belonging to this polygon constitute the first shell
   * (with offset 1), so these "loose" coordination sequences start with either
   * 3, 4, 6 or 12.<br>
   * Both <code>baseIndex</code> and <code>baseEdge</code> start at 0 internally!
   * @return number of queued vertices: 1, 2 or corner number.
   */
  public int defineBaseSet(final int mode, final int baseIndex, final int baseEdge) {
    mBaseIndex  = baseIndex;
    mPosMap     = new PositionMap();
    mVertexList = new VertexList();
    if (mStoreEdges) {
      mEdgeList = new EdgeList();
    }
    mQueue      = new LinkedList<Integer>();
    int ifocus  = addVertex(new Vertex(mTypeArray.get(baseIndex)));
    mQueue.add(ifocus);
    if (mode > 0) {
      final int distance = 1;
      Vertex focus = mVertexList.get(0);
      focus.distance = distance;
      int iedge = baseEdge;
      int cornerRange = focus.vtype.polys[baseEdge]; // number of corners of the polygon to the right of the edge
      if (mode == 3 || mode == 4) { // only the pair of the first edge
        cornerRange = 2;
      }
      for (int ipoly = 1; ipoly < cornerRange; ipoly ++) { // enqueue the first or all corners of the polygon
        final Vertex proxy = attach(focus, iedge);
        final int iproxy = proxy.index;
        mQueue.add(iproxy);
        if (mStoreEdges) {
          mEdgeList.add(new Edge(ifocus, iproxy, iedge, mDistance));
          mEdgeList.add(new Edge(iproxy, ifocus, iedge, mDistance));
        }
        iedge = focus.vtype.pxEdges[iedge] - proxy.orient;
        if (iedge < 0) { // walk around the polygon
          iedge += proxy.vtype.edgeNo;
        } else if (iedge >= proxy.vtype.edgeNo) {
          iedge = 0;
        }
        focus = proxy;
        ifocus = focus.index;
        focus.distance = distance;
      } // for ipoly
    } // mode > 0
    mShellCount = mQueue.size();
  /* start test code //
    if (sDebug >= 1) {
        System.out.println(toJSON());
    }
  // end   test code */
    return mShellCount;
  } // defineBaseSet(int,int,int)

  /**
   * Defines the initial set of vertices, and initializes the tiling's dynamic data structures 
   * - convenience method.
   * @param baseIndex {@link VertexType} index of a single {@link Vertex}
   * <code>baseIndex</code> starts at 0 internally!
   * @return number of queued vertices: 1.
   */
  public int defineBaseSet(final int baseIndex) {
    return defineBaseSet(0, baseIndex, 0);
  } // defineBaseSet(int)
  
  /**
   * Gets a {@link VertexType}
   * @param index of the VertexType, 0=A, 1=B and so on.
   * @return a number &gt;= 0,
   */
  public VertexType getVertexType(final int index) {
    return mTypeArray.get(index);
  } // getVertexType(int)

  /**
   * Adds an existing {@link Vertex} to the array of known vertices, and to the HashMap for {@link Position}s of vertices
   * @param vertex existing Vertex
   * @return index of added Vertex in {@link #mVertexList}
   */
  public int addVertex(final Vertex vertex) {
    final int result = mVertexList.add(vertex);
    mPosMap.put(vertex);
    return result;
  } // addVertex(Vertex)

  /**
   * Returns a JSON representation of the tiling
   * @return JSON for all major data structures
   */
  public String toJSON() {
    return mTypeArray .toJSON()
        +  mVertexList.toJSON()
        +  mEdgeList  .toJSON()
        +  mPosMap    .toJSON()
        +  "\n, mBaseIndex: " + mBaseIndex;
  } // toJSON()

  /**
   * Creates a successor {@link Vertex} of the focus and connects the successor back to the focus
   * @param focus the Vertex which gets the new proxy (successor)
   * @param iedge attach the proxy at this edge of the focus
   * @return proxy vertex, either already existing or new created.
   */
  public Vertex attach(final Vertex focus, final int iedge) {
    final VertexType foType = focus.vtype;
    final int pxAngle       = // focus.getAngle(iedge); // points to the proxy
        Vertex.normAngle(focus.rotate + focus.orient * foType.sweeps[iedge]);
    final Position proxyPos = focus.expos.moveUnit(pxAngle);
    int iproxy              = mPosMap.get(proxyPos); // future result
    final int pxEdge        = foType.pxEdges[iedge];
    Vertex proxy = null;
    if (iproxy >= 0) { // found old
      proxy  = mVertexList.get(iproxy);
    } else { // iproxy < 0: not found, create new
      proxy              = new Vertex(mTypeArray.get(foType.pxTinds[iedge]), focus.orient * foType.pxOrients[iedge]); // create a new Vertex
      proxy.expos        = focus.expos.moveUnit(pxAngle);
      final int pxRota   = focus.orient * foType.pxRotas[iedge];
      proxy.rotate       = Vertex.normAngle(focus.rotate + pxRota);
    /* start test code //
      if (sDebug >= 2) {
        System.out.println("#     createProxy(iedge " + iedge + "proxyPos " + proxyPos.toString()
            + ")." + focus.index + focus.getName() + "@" + focus.rotate + focus.expos
            + " -> pxType " + proxy.vtype.index + ", pxRota " + pxRota + ", pxAngle " + pxAngle
            + " => " + proxy.toString());
      }
    // end   test code */
      iproxy = addVertex(proxy);
      proxy  = mVertexList.get(iproxy);
    } // not found
    focus.pxInds[iedge] = iproxy; // attach it - link forward to the proxy
  /* start test code //
    final int trialEdge = proxy.normEdge(pxEdge);
    int backLink = proxy.pxInds[trialEdge];
    if (sBackLink &&
        backLink != focus.index) { // correct the link back to the focus
      if (backLink >= 0) { // was set previously, but differently
        final int foundEdge = focus.findProxyEdge(proxy);
        if (sDebug >= 1) {
          System.out.println("# assertion 10: dist=" + focus.distance + " focus " + focus.getName() + focus.index
              + "\texpected in proxy " + proxy.getName() + proxy.index + ".vtInds[" + trialEdge + "] "
              + "\tbut found in [" + foundEdge + "]");
        } else {
          System.out.println("# assertion 10: dist=" + focus.distance + " focus " + focus.getName() + focus.index
              + "\texpected in proxy " + proxy.getName() + proxy.index + ".vtInds[" + trialEdge + "] "
              + "\tbut found in [" + foundEdge + "]");
        }
        if (foundEdge >= 0) {
          // proxy.pxInds[foundEdge] = focus.index;
        }
      } else { // backLink < 0
        proxy.pxInds[trialEdge] = focus.index;
      }
    } // else backLink is ok
  // end   test code */
    return proxy;
  } // attach(Vertex,int)

  /**
   * Gets the next term of the sequence.
   * Creates and connects all vertices of the next shell, and returns their count.
   * @return the next term of the sequence
   */
  // @Override
  public Z next() {
    final Z result = Z.valueOf(mShellCount); // return previous shell count
    mShellCount = 0; // start to count vertices in next shell
    int mustProcess = mQueue.size();
    while (mustProcess > 0 && mQueue.size() > 0) { // mQueue not empty
      final int ifocus = mQueue.poll(); // index of next vertex to be processed
      mustProcess --;
      final Vertex focus = mVertexList.get(ifocus);
      focus.distance = mDistance;
      for (int iedge = 0; iedge < focus.vtype.edgeNo; iedge ++) {
        if (focus.pxInds[iedge] < 0) { // proxy for this edge not yet determined
          final Vertex proxy = attach(focus, iedge);
          if (mStoreEdges) {
            mEdgeList.add(new Edge(ifocus, proxy.index, iedge, mDistance));
          }
          if (proxy.distance < 0) { // is not yet in the set of shells
            proxy.distance = mDistance;
            mQueue.add(proxy.index);
            mShellCount ++;
          }
        } // proxy not yet determined
      } // for iedge
    } // while portion not exhausted and mQueue not empty
    mDistance ++;
    return result;
  } // next()

  /**
   * Expands and prints the sequence(s) for <em>this</em> tiling.
   * @param mode defines the set of vertices for the initial shell:
   * <ul>
   * <li>0 = one base vertex</li>
   * <li>1 = polygon defined by the base vertex and the edge - the polygon is to the right</li>
   * <li>2 = all polygons around the base vertex</li>
   * <li>3 = the base vertex and the proxy at the end of the edge</li>
   * <li>4 = all pairs base vertex, proxy</li>
   * </ul>
   * @param galId identification of the tiling, for example "Gal.2.1"
   * @param baseIndex index of the {@link VertexType} (zero-based)
   * @param baseEdge  index of the edge in the base vertex which defines the central polygon (zero-based),
   * @param maxDistance number of terms to be generated
   */
  public void printSequences(final int mode, final String galId
      , final int baseIndex, final int baseEdge, final int maxDistance) {
  /* start test code //
    final VertexType baseType = mTypeArray.get(baseIndex);
    if (mode == 0) { // normal coordination sequence
      defineBaseSet(mode, baseIndex, 0);
      System.out.print(galId + "\t-1\t" + baseType.vertexId + "\t");
      for (int index = 0; index < maxDistance; index ++) {
        System.out.print((index == 0 ? "" : ",") + next());
      } // for index
      System.out.println();
    } else { // centered sequence(s)
      int minEdge = 0; 
      int maxEdge = baseType.polys.length - 1; 
      // ok for modes 2,4: all edges
      if (mode == 1 || mode == 3) { // specific edge
        minEdge = baseEdge;
        maxEdge = baseEdge;
      } // specific edge
      for (int iedge = minEdge; iedge <= maxEdge; iedge ++) {
        defineBaseSet(mode, baseIndex, iedge);
        System.out.print(galId + "\t" + String.valueOf(iedge + 1) + "\t" + baseType.vertexId + "\t");
        for (int index = 0; index < maxDistance; index ++) {
          System.out.print((index == 0 ? "" : ",") + next());
        } // for index
        System.out.println();
      } // for iedge
    } // baseEdge >= -1
  // end   test code */
  } // printSequences
  
  /**
   * Main method, computes one specific sequence 
   * for a base vertex and optional base edge in 
   * the specified tiling
   * @param args command line arguments
   */
  public static void main(String[] args) {
  /* start test code //
    final long startTime  = System.currentTimeMillis();
    String gal        = "Gal.2.1";
    String definition = "12.6.4;A180-,A120-,B90+~~6.4.3.4;A270+,A210-,B120+,B240+"; // Gal.2.1
    int baseIndex     =  0;
    int baseEdge      = -1; // not specified
    int maxDistance   = 16;
    int mode          =  0;
    try {
      int iarg = 0;
      while (iarg < args.length) { // consume all arguments
        String opt       = args[iarg ++];
        if (false) {
        } else if (opt.equals     ("-dist")  ) {
          maxDistance           = Integer.parseInt(args[iarg ++]);
        } else if (opt.equals     ("-d")     ) {
          TilingSequence.sDebug = Integer.parseInt(args[iarg ++]);
        } else if (opt.startsWith ("-def")   ) {
          definition            = args[iarg ++];
        } else if (opt.startsWith ("-e")     ) {
          baseEdge              = Integer.parseInt(args[iarg ++]) - 1; // start at 0 internally
        } else if (opt.equals     ("-gal")   ) {
          gal                   = args[iarg ++];
        } else if (opt.equals     ("-id")    ) {
          baseIndex             = Integer.parseInt(args[iarg ++]) - 1; // start at 0 internally
        } else if (opt.startsWith ("-m")     ) {
          mode                  = Integer.parseInt(args[iarg ++]); 
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } // while args
    } catch (Exception exc) {
      // log.error(exc.getMessage(), exc);
      System.err.println(exc.getMessage());
      exc.printStackTrace();
    }
    final TilingSequence mTiling = new TilingSequence(mode == 0 ? 0 : 1, definition.split("~~")); // offset, pairs
    mTiling.printSequences(mode, gal + "." + String.valueOf(baseIndex + 1), baseIndex, baseEdge, maxDistance);
    System.err.println("# elapsed: " + String.valueOf(System.currentTimeMillis() - startTime) + " ms");
  // end   test code */
  } // main

} // class TilingSequence
