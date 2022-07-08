/* Type of a vertex in a tiling
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-15, Georg Fischer: extracted from Tiler.java
 */
package org.teherba.tile;
import org.teherba.tile.Position;
import org.teherba.tile.Vertex;
import java.io.Serializable;

/**
 * This class represents some type of a {@link Vertex} in a tiling.
 * @author Georg Fischer
 */
public class VertexType implements Serializable {
  public final static String CVSID = "@(#) $Id: Vertex.java $";

  int    index;       // sequential number of type, starting at 0
  String stdNotation; // e.g. "3.4.6.4;4.6.12" - all involved vertex types with increasing polygons
  String vertexId;    // e.g. "12.6.4" - decreasing polygon edge numbers at the moment
  int    edgeNo;      // number of edges; the following arrays are indexed by iedge=0..edgeNo-1
  int[]  polys;       // number of corners of the regular (3,4,6,8, or 12) polygons (shapes)
                          // which are arranged clockwise (for SVG, counter-clockwise by Galebach) around this vertex type;
                          // first edge goes from (x,y)=(0,0) to (1,0); the shape is to the left of the edge
  int[]  sweeps;      // positive angles from iedge to iedge+1 for (iedge=0..edgeNo) mod edgeNo
  int[]  pxTinds;     // VertexType indices of proxy vertices
  int[]  pxRotas;     // how many degrees must the proxy vertices be rotated, from Galebach
  int[]  pxEdges;     // which edge of the proxy is connected - not used yet
  int[]  pxOrients;   // whether the proxy vertex is oriented normally (+1) or flipped (-1)
  String galId;       // e.g. "Gal.2.1.1"
  String name;        // for example "A" for normal or "a" (lowercase) for flipped version
  String aSeqNo;      // OEIS A-number of the coordination sequence
  String sequence;    // list of terms of the coordination sequence (standard is 50 terms)
  int    tilingNo;    // sequential tiling number in BG's list

  /** Debugging mode: 0=none, 1=some, 2=more */
  public static int sDebug;

  /**
   * Empty constructor
   */
  VertexType() {
    index       = 0;
    stdNotation = "stdnot";
    vertexId    = "";
    edgeNo      = 0;
    polys       = new int[0];
    sweeps      = new int[0];
    pxTinds     = new int[0];
    pxRotas     = new int[0];
    pxEdges     = new int[0];
    pxOrients   = new int[0];
    galId       = "Gal.0.0.0";
    name        = "Z";
    aSeqNo      = "";
    sequence    = "";
    tilingNo    = 0;
  } // VertexType()

  /**
   * Modify an existing {@link VertexType} and set the parameters of the angle notation
   * @param aSeqNo OEIS A-number of the sequence
   * @param galId Galebach's identification of a vertex type: "Gal.u.t.v"
   * @param stdNotation all involved vertex types with increasing polygons
   * @param vertexId clockwise dot-separated list of
   *     the polygons followed by the list of types and angles
   * @param taRotList clockwise semicolon-separated list of
   *     vertex type names and angles (and apostrophe if flipped)
   * @param sequence a list of initial terms of the coordination sequence
   * @param tilingNo sequential tiling number in BG's list
   */
  public void decodeNotation(final String aSeqNo, final String galId, final String stdNotation, final String vertexId
      , final String taRotList, final String sequence, final int tilingNo) {
    // for example: A265035 tab Gal.2.1.1 tab 3.4.6.4; 4.6.12 tab 12.6.4 tabA 180'; A 120'; B 90 tab 1,3,6,9,11,14,17,21,25,28,30,32,35,39,43,46,48,50,53,57,61,64,66,68,71,75,79,82,84,86,89,93,97,100,102,104,107,111,115,118,120,122,125,129,133,136,138,140,143,147
    // this.index and this.name are filled in VertexTypeArray.add()
    this.stdNotation = stdNotation;
    this.vertexId = vertexId;
    final String[] corners = vertexId.split("\\.");
    final String[] parts   = taRotList.split("[\\;\\,]\\s*");
    this.aSeqNo = aSeqNo;
    this.galId  = galId;
    this.sequence = sequence;
    this.tilingNo = tilingNo;
    edgeNo      = parts.length;
    polys       = new int[edgeNo];
    sweeps      = new int[edgeNo];
    pxTinds     = new int[edgeNo];
    pxRotas     = new int[edgeNo];
    pxOrients   = new int[edgeNo];
    pxEdges     = new int[edgeNo];
    for (int iedge = 0; iedge < edgeNo; iedge ++) {
      // parts[iedge] has the form: "Ucletter [angle] +- [edge]", that is "A270-", "A270-1" or "A-1"
      String part  = parts[iedge];
      int signPos = part.indexOf('+');
      if (signPos >= 0) {
        pxOrients [iedge] = +1; // "+" => same     orientation
      } else {
        pxOrients [iedge] = -1; // "-" => opposite orientation
        signPos   = part.indexOf('-');
        if (signPos < 0) { // no "-"
          System.err.println("# assertion 9: no sign found, galId=" + galId + ", taRotList=" + taRotList);
          signPos = part.length() - 1;
        }
      }
      polys       [iedge] = 0;
      pxTinds     [iedge] = part.charAt(0) - 'A'; // A -> 0
      pxRotas     [iedge] = -1; // undefined so far
      pxEdges     [iedge] = -1; // undefined so far
      final String sangle = part.substring(1, signPos);
      final String sedge  = part.substring(signPos + 1);
      try {
        polys     [iedge] = Integer.parseInt(corners[iedge]);
        if (sangle.length() > 0) {
          pxRotas [iedge] = Integer.parseInt(sangle); // 0..359
        }
        if (sedge .length() > 0) {
          pxEdges [iedge] = Integer.parseInt(sedge) - 1; // internal edge no >= 0, external edge nos start at 1
        }
      } catch (Exception exc) {
        System.err.println("# ** assertion 4: descriptor for \"" + galId + "\" bad");
      }
    } // for iedge
    for (int iedge = 0; iedge < edgeNo; iedge ++) { // increasing
      sweeps[iedge] = iedge == 0 ? 0 : sweeps[iedge - 1] + Position.mRegularAngles[polys[iedge - 1]];
    } // for iedge
  } // decodeNotation

  /**
   * Gets the terms of the sequence.
   * @return an int array with the parsed terms
   */
  public int[] getSequence() {
    final String[] parts = sequence.split("\\,");
    final int termNo = parts.length;
    int[] terms = new int[termNo];
    for (int iterm = 0; iterm < termNo; iterm ++) {
      try {
        terms[iterm] = Integer.parseInt(parts[iterm]);
      } catch (Exception exc) {
      }
    } // for iterm
    return terms;
  } // getSequence

  /**
   * Join an array of integers
   * @param delim delimiter
   * @param vector integer array
   * @return a String of the form "[elem1,elem2.elem3]"
   */
  private static String join(final String delim, final int[] vector) {
    StringBuffer result = new StringBuffer(128);
    result.append('[');
    for (int ind = 0; ind < vector.length; ind ++) {
      if (ind > 0) {
        result.append(delim);
      }
      result.append(String.valueOf(vector[ind]));
    } // for
    result.append(']');
    return result.toString();
  } // join

  /**
   * Returns a String representation of <em>this</em> VertexTypeArray
   * @return a tab-separated line for each {@link VertexType} with the fields
   * of the long call to VertexTypeArray.decodeNotation
   */
  public String toString() {
    StringBuffer result = new StringBuffer(1024);
    result.append(aSeqNo);
    result.append("\t");
    result.append(galId);
    result.append("\t");
    result.append(stdNotation);
    result.append("\t");
    result.append(vertexId);
    result.append("\t");
    for (int iedge = 0; iedge < edgeNo; iedge ++) {
      if (iedge > 0) {
        result.append(",");
      }
      result.append((char) (pxTinds[iedge] + 'A'));
      if (pxRotas[iedge] >= 0) {
        result.append(String.valueOf(pxRotas[iedge]));
      }
      result.append(pxOrients[iedge] < 0 ? '-' : '+');
      if (pxEdges[iedge] >= 0) {
        result.append(String.valueOf(pxEdges[iedge] + 1)); // external edge no
      }
    } // for iedge
    result.append("\t");
    result.append(sequence);
    result.append("\t");
    result.append(String.valueOf(tilingNo));
    return result.toString();
  } // toString()

  /**
   * Returns a representation of the VertexType
   * @return JSON for all properties
   */
  public String toJSON() {
    String result
        = "{ \"i\": "         + index
        + ", \"name\": \""    + name  + "\""
        + ", \"stdnot\": \""  + stdNotation + "\""
        + ", \"vid\": \""     + vertexId + "\""
        + ", \"polys\": "     + join(",", polys)
        + ", \"sweeps\": "    + join(",", sweeps)
        + ", \"pxTinds\": "   + join(",", pxTinds)
        + ", \"pxRotas\": "   + join(",", pxRotas)
        + ", \"pxOrients\": " + join(",", pxOrients)
        + ", \"pxEdges\": "   + join(",", pxEdges)
        + ", \"galId\": \""   + galId + "\""
        + ", \"tiling\": "    + tilingNo 
        + " }\n";
    return result;
  } // VertexType.toJSON

} // class VertexType
