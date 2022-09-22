/* Store for vertex types
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-16, Georg Fischer: extracted from Tiling.java
 */
package org.teherba.tile;

/**
 * This class provides an array of fixed size
 * containing all {@link VertexType}s which is accessible by the index.
 * @author Georg Fischer
 */
public class VertexTypeArray {

  /** Debugging mode: 0=none, 1=some, 2=more */
  protected static int sDebug;

  /** Allocated vertices */
  private final VertexType[] mVertexTypes; // [0], [1] are reserved

  /** First free index */
  private int mTAFree;

  /**
   * Empty Constructor - not used
   */
  public VertexTypeArray() {
    mVertexTypes = new VertexType[2];
    mTAFree = 0;
  } // Constructor()

  /**
   * Constructor with number of {@link VertexType}s.
   * The VertexTypes should subsequently be filled with {@link #decodeNotation}.
   * @param noTypes number of types to be stored
   */
  public VertexTypeArray(final int noTypes) {
    mVertexTypes = new VertexType[noTypes];
    for (int index = 0; index < noTypes; index ++) {
      mVertexTypes[index] = new VertexType(); // preset because of pxTinds
    } // for mTAFree
    mTAFree = 0; // incremented by decodeNotation
  } // Constructor(int)

  /**
   * Completes and adds an existing {@link VertexType} to the array
   * @param vtype the VertexType to be added
   * @return index of the resulting VertexType
   */
  public int add(final VertexType vtype) {
    vtype.index = mTAFree; // complete index and name
    vtype.name  = "ABCDEFGHIJKLMNOPQ".substring(vtype.index, vtype.index + 1);
    mVertexTypes[mTAFree ++] = vtype;
    return vtype.index;
  } // add

  /**
   * Modify an existing {@link VertexType} and set the parameters of the angle notation
   * @param aSeqNo OEIS A-number of the sequence
   * @param galId Galebach's id "Gal.u.t.v"
   * @param stdNotation all involved vertex types with increasing polygons
   * @param vertexId clockwise dot-separated list of the polygons followed by the list of types and angles
   * @param taRotList clockwise comma-separated list of vertex type names and angles (and apostrophe if flipped)
   * @param sequence list of initial terms of the coordination sequence
   * @param tilingNo sequential tiling number in BG's list
   */
  public void decodeNotation(final String aSeqNo, final String galId, final String stdNotation, final String vertexId
      , final String taRotList, final String sequence, final int tilingNo) {
    mVertexTypes[mTAFree].decodeNotation(aSeqNo, galId, stdNotation, vertexId, taRotList, sequence, tilingNo);
    mVertexTypes[mTAFree].name = Character.toString((char) ('A' + mTAFree));
    mTAFree ++;
  } // decodeNotation(String^5)

  /**
   * Modify an existing {@link VertexType} and set the parameters of the angle notation
   * @param param a pair of Strings <code>"vertexId;taRotList"</code>,
   * where <code>vertexId</code> is a clockwise dot-separated list of the polygons followed by the list of types and angles,
   * and <code>taRotList</code> is a clockwise comma-separated list of vertex type names and angles (and apostrophe if flipped)
   * <code>aSeqno</code>, <code>galId</code> and sequence are set to dummy values.
   */
  public void decodeNotation(final String param) {
    final String[] pair = param.split(";");
    decodeNotation("A000000", "Gal.u.t.v.", "stdnot", pair[0], pair[1], "1", 0); // ... vertexId, taRotList, seq, tilingNo
  } // decodeNotation(String)

  /**
   * Completes all {@link VertexType}s, that is - if necessary -
   * computes proxy edges from proxy angles and vice versa.
   */
  public void complete() {
    for (int index = 0; index < mTAFree; index ++) {
      final VertexType foType = get(index);
      for (int iedge = 0; iedge < foType.edgeNo; iedge ++) {
      /* start test code //
        if (sDebug >= 4) {
          System.out.println("# complete(" + index + ", iedge=" + iedge + ") - " + foType.name);
        }
      // end   test code */
        final VertexType pxType = this.get(foType.pxTinds[iedge]);
        int pxRota = foType.pxRotas[iedge];
        int pxEdge = foType.pxEdges[iedge];
        if (false) {
        } else if (pxRota < 0 && pxEdge >= 0) { // compute angle from edge
          pxRota            = Vertex.normAngle(180
                + foType.sweeps   [iedge] - pxType.sweeps[pxEdge]
                * foType.pxOrients[iedge]
          //    * pxType.pxOrients[pxEdge]
                );
          foType.pxRotas[iedge] = pxRota;
        } else if (pxEdge < 0 && pxRota >= 0) { // compute edge  from angle
          int kedge = 0;
          boolean busy = true;
          while (busy && kedge < pxType.edgeNo) { // search for matching angle
            final int kRota = Vertex.normAngle(180
                + foType.sweeps   [iedge] - pxType.sweeps[kedge ]
                * foType.pxOrients[iedge]
            //  * pxType.pxOrients[kedge ]
                );
            if (pxRota == kRota ) { // found
              busy = false;
            } else {
            /* start test code //
              if (sDebug >= 3) {
                System.out.println("#     complete(kedge=" + kedge + "): pxRota=" + pxRota + " <> kRota=" + kRota);
              }
            // end   test code */
              kedge ++;
            }
          } // while busy and searching
          if (! busy) { // found
            pxEdge = kedge;
          /* start test code //
            if (sDebug >= 3) {
              System.out.println(  "#     complete(kedge=" + kedge + "): found");
            }
          // end   test code */
          } else { // not found
          /* start test code //
            if (sDebug >= 3) {
              System.out.println("# complete(kedge=" + kedge + "): pxRota=" + pxRota + " not found");
            }
          // end   test code */
          }
          foType.pxEdges[iedge] = pxEdge;
        }
      } // for iedge
    } // for index
  } // complete

  /**
   * Gets a {@link VertexType} specified by its index.
   * @param index sequential number
   * @return the VertexType with that index
   */
  public VertexType get(final int index) {
    return mVertexTypes[index];
  } // get

  /**
   * Number of stored {@link VertexType}s
   * @return length of the array
   */
  public int size() {
    return mTAFree;
  } // size

  /**
   * Returns a String representation of <em>this</em> VertexTypeArray
   * @return a tab-separated line for each {@link VertexType} with the fields
   * of the long call to {@link #decodeNotation}
   */
  public String toString() {
    StringBuffer result = new StringBuffer(1024);
    for (int ind = 0; ind < size(); ind ++) {
      result.append(get(ind).toString());
      result.append("\n");
    } // for ind
    return result.toString();
  } // toString

  /**
   * Returns a JSON representation of <em>this</em> VertexTypeArray
   * @return JSON for all vertices in linear order
   */
  public String toJSON() {
    String result  = "{ \"mTAFree\": " + mTAFree + "\n" + ", \"mVertexTypes\":\n";
    for (int ind = 0; ind < size(); ind ++) {
      result += (ind == 0 ? "  [ " : "  , ") + get(ind).toJSON();
    } // for types
    result += "  ]\n}\n";
    return result;
  } // toJSON

} // class VertexTypeArray
