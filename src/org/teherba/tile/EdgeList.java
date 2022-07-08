/* Store for vertices
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-29, Georg Fischer: copied from VertexList
 */
package org.teherba.tile;
import org.teherba.tile.Edge;
import java.util.ArrayList;

/**
 * This class provides an expandable array which allows
 * access to all {@link Edge}s by their index.
 * @author Georg Fischer
 */
public class EdgeList {
  public final static String CVSID = "@(#) $Id: EdgeList.java $";

  /** Allocated vertices */
  private ArrayList<Edge> mEdges;

  /**
   * Empty Constructor.
   */
  public EdgeList() {
    mEdges = new ArrayList<Edge>(1024);
  } // Constructor()

  /**
   * Number of stored {@link Edge}es
   * @return the size of the internal ArrayList
   */
  public int size() {
    return mEdges.size();
  } // size

  /**
   * Stores an {@link Edge} at the next free element.
   * @param edge store this Edge
   * @return index where the Edge was stored
   */
  public int add(final Edge edge) {
    final int result = mEdges.size();
    edge.index = result;
    mEdges.add(edge);
    return result;
  } // add

  /**
   * Gets a {@link Edge} specified by its index.
   * @param index sequential number (0 is reserved)
   * @return the Edge with that index
   */
  public Edge get(final int index) {
    return mEdges.get(index);
  } // get

  /**
   * Returns a JSON representation of <em>this</em> EdgeList
   * @return JSON for all vertices in linear order
   */
  public String toJSON() {
    String result  = "{ \"size\": " + mEdges.size() + "\n" +  ", \"mEdges\":\n";
    for (int ind = 0; ind < mEdges.size(); ind ++) {
      result += (ind == 0 ? "  [ " : "  , ") + mEdges.get(ind).toJSON();
    } // for vertices
    result += "  ]\n}\n";
    return result;
  } // toJSON

} // class EdgeList

