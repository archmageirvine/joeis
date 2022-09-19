/* Directed edge between two vertices in a tiling
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-29, Georg Fischer: copied from Vertex.java
 */
package org.teherba.tile;
import java.io.Serializable;

/**
 * This class represents a directed edge from a focus {@link Vertex} to one of its proxy vertices.
 * @author Georg Fischer
 */
public class Edge implements Serializable {

  public int index;        // in the edge list
  public int ifocus;       // index of the focus vertex in the vertex list
  public int iproxy;       // index of the proxy vertex in the vertex list
  public int iedge;        // index of the edge in the focus (zero based)
  public int distance;     // distance from the base set, for coloring

  /**
   * Empty constructor, not used.
   */
  public Edge() {
    index = -1;
  } // Edge()

  /**
   * Constructor with a pair of vertices. The edge points from the focus to the proxy.
   * @param ifocus  index of the focus vertex in the vertex list
   * @param iproxy  index of the proxy vertex in the vertex list
   * @param iedge   index of the edge in the focus (zero based)
   * @param distance distance from the base set, for coloring
  */
  public Edge(final int ifocus, final int iproxy, final int iedge, final int distance) {
    index = -1; // the index is filled by EdgeList.add()
    this.ifocus   = ifocus;
    this.iproxy   = iproxy;
    this.iedge    = iedge;
    this.distance = distance;
   } // Edge(int,int,int)

  /**
   * Returns a JSON representation of the Edge
   * @return JSON for all properties
   */
  public String toJSON() {
    final String result
        = "{ \"i\": "       + String.format("%4d", index)
        + ", \"ifocus\": "  + String.format("%2d", ifocus)
        + ", \"iproxy\": "  + String.format("%2d", iproxy)
        + ", \"iedge\": "   + String.format("%2d", iedge)
        + ", \"dist\":   "  + String.format("%2d", distance)
        + " }\n";
    return result;
  } // toJSON

  /**
   * Returns a human readable representation of the Edge
   * @return <code>"ifocus-&gt;iproxy"</code>
   */
  public String toString() {
    return ifocus + "->" + iproxy;
  } // toString

} // class Edge

