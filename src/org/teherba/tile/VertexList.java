/* Store for vertices
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-16, Georg Fischer: extracted from TilingSequence.java
 */
package org.teherba.tile;
import org.teherba.tile.Vertex;
import java.util.ArrayList;

/**
 * This class provides an expandable array which allows
 * access to all {@link Vertex}es by their index.
 * @author Georg Fischer
 */
public class VertexList {
  public final static String CVSID = "@(#) $Id: VertexList.java $";

  /** Allocated vertices */
  private ArrayList<Vertex> mVertices;

  /**
   * Empty Constructor.
   */
  public VertexList() {
    mVertices = new ArrayList<Vertex>(1024);
  } // Constructor()

  /**
   * Number of stored {@link Vertex}es
   * @return the size of the internal ArrayList
   */
  public int size() {
    return mVertices.size();
  } // size

  /**
   * Stores a {@link Vertex} at the next free element.
   * @param vertex store this Vertex
   * @return index where the Vertex was stored
   */
  public int add(final Vertex vertex) {
    final int result = mVertices.size();
    vertex.index = result;
    mVertices.add(vertex);
    return result;
  } // add

  /**
   * Gets a {@link Vertex} specified by its index.
   * @param index sequential number (0 is reserved)
   * @return the Vertex with that index
   */
  public Vertex get(final int index) {
    return mVertices.get(index);
  } // get

  /**
   * Returns a JSON representation of <em>this</em> VertexList
   * @return JSON for all vertices in linear order
   */
  public String toJSON() {
    String result  = "{ \"size\": " + mVertices.size() + "\n" +  ", \"mVertices\":\n";
    for (int ind = 0; ind < mVertices.size(); ind ++) {
      result += (ind == 0 ? "  [ " : "  , ") + mVertices.get(ind).toJSON();
    } // for vertices
    result += "  ]\n}\n";
    return result;
  } // toJSON

} // class VertexList
