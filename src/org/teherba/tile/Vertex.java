/* Node in a tiling
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-15, Georg Fischer: extracted from Tiler.java
 */
package org.teherba.tile;

import java.io.Serializable;

/**
 * This class represents a vertex in a tiling.
 * A vertex is a node where 3 to 6 (for uniform tilings) edges meet.
 * @author Georg Fischer
 */
public class Vertex implements Serializable {

  /** Debugging mode: 0=none, 1=some, 2=more */
  public static int sDebug;

  public int index;        // in mVertices
  public VertexType vtype; // general properties for the vertex
  public int orient;       // 1 for normal (clockwise), -1 for opposite (counter-clockwise) orientation
  public int distance;     // length of shortest path to origin, for coloring
  public int rotate;       // the vertex type was rotated clockwise by so many degrees
  public Position expos;   // exact Position of the Vertex
  public int[] pxInds;     // array of neighbouring vertices at the end of the edges

  /**
   * Empty constructor, not used
   */
  public Vertex() {
    index = -1;
  } // Vertex()

  /**
   * Constructor with a {@link VertexType}.
   * @param vtype type of vertex with general properties,
  */
  public Vertex(final VertexType vtype) {
    this.vtype = vtype;
    orient     = 1; // assume normal orientation
    distance   = -1; // unknown so far
    rotate     = 0;
    expos      = new Position();
    pxInds     = new int[vtype.edgeNo];
    for (int iedge = 0; iedge < vtype.edgeNo; iedge ++) {
      pxInds[iedge] = -1; // proxy vertex indices are unknown so far
    }
   } // Vertex(VertexType)

  /**
   * Constructor with a {@link VertexType} and an orientation.
   * @param vtype type of vertex with general properties
   * @param orient = +1 for normal (clockwise), -1 for opposite (counter-clockwise) orientation
   */
  public Vertex(final VertexType vtype, final int orient) {
    this(vtype);
    this.orient = orient;
  } // Vertex(VertexType,int)

  /**
   * Gets the type of <em>this</em> Vertex
   * @return a {@link VertexType}
   */
  public VertexType getType() {
    return vtype;
  } // getType

  /**
   * Gets the name (via the {@link VertexType}) of <em>this</em> Vertex
   * @return uppercase letter (for normal orientation) or lowercase letter (for opposite orientation)
   */
  public String getName() {
    return orient == 1 ? vtype.name : vtype.name.toLowerCase();
  } // getName

  /**
   * Returns a representation of the proxies
   * @return JSON array with indices of the proxies
   */
  private String getProxyList() {
    StringBuilder result = new StringBuilder(128);
    for (int iedge = 0; iedge < vtype.edgeNo; iedge ++) {
      result.append(',');
      result.append(pxInds[iedge]);
    } // for iedge
    return result.substring(1);
  } // getProxyList

  /**
   * Returns a JSON representation of the Vertex
   * @return JSON for all properties
   */
  public String toJSON() {
    return "{ \"i\": "       + String.format("%4d", index)
    + ", \"type\": "    + String.format("%2d", vtype.index)
    + ", \"name\": "    + getName()
    + ", \"orient\": "  + String.format("%3d", orient)
    + ", \"rot\": "     + String.format("%3d", rotate)
    + ", \"pxInds\": [" + getProxyList() + "]"
    + ", \"pos\": \""   + expos.toString()  + "\""
    + ", \"dist\": \""  + distance + "\""
    + " }\n";
  } // toJSON

  /**
   * Returns a representation of the Vertex
   * @return the more important properties in human readable form
   */
  public String toString() {
    return index + getName() + " @" + rotate + expos + "->" + getProxyList();
  } // toString

  /**
   * Normalizes an angle
   * @param angle in degrees, maybe negative or &gt;= 360
   * @return non-negative degrees mod 360
   */
  protected static int normAngle(int angle) {
    while (angle < 0) {
      angle += 360;
    }
    return angle % 360;
  } // normAngle

  /**
   * Normalizes an edge.
   * @param iedge, zero based, maybe negative or &gt;= <code>edgeNo</code>
   * @return integer between 0 and <code>edgeNo - 1</code>.
   */
  protected int normEdge(int iedge) {
    while (iedge < 0) {
      iedge += vtype.edgeNo;
    }
    return iedge % vtype.edgeNo;
  } // normEdge

  /**
   * Gets the absolute angle where an edge from <em>this</em> {@link Vertex}
   * (which is already rotated) is pointing to.
   * This is the only place where the orientation of the Vertex is relevant.
   * The orientation is implemented by a proper access to <em>sweeps</em>.
   * @param iedge number of the edge, 0 based
   * @return degrees [0..360) where the edge points to,
   * relative to a right horizontal edge from (x,y)=(0,0) to (x,y)=(0,1),
   * turning clockwise := positive (downwards, because of SVG's y axis)
   */
  protected int getAngle(final int iedge) {
    final int result = normAngle(rotate + orient * vtype.sweeps[iedge]);
  /* start test code //
    if (sDebug >= 2) {
        System.out.println("#         getAngle(iedge "         + iedge + ")." + index + getName() + "@" + rotate + expos
            + ", focus.orient " + orient + ", => " + result);
    }
  // end   test code */
    return result;
  } // getAngle

  /**
   * Searches for the focus in the array <code>pxInds</code> of a proxy
   * @param proxy a neighbour of the focus Vertex
   * @return the index where the focus is stored in the proxy,
   * or -1 if it was not found
   */
  protected int findProxyEdge(final Vertex proxy) {
    int result = -1; // assume: not found
    boolean busy = true;
    int kedge = 0;
    while (busy && kedge < proxy.vtype.edgeNo) {
      if (index == proxy.pxInds[kedge]) { // found
        busy = false;
        result = kedge;
      } else {
        kedge ++;
      }
    } // while busy
    return result;
  } // findProxyEdge

} // class Vertex

