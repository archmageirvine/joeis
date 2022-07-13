/* Maps Positions to indices of vertices 
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-21: store Integer again
 * 2020-05-16, Georg Fischer: extracted from Tiling.java
 */
package org.teherba.tile;
import org.teherba.tile.Position;
import org.teherba.tile.Vertex;
import java.util.HashMap;
import java.util.Iterator;

/**
 * This class provides a store for mappings from an exact {@link Position} 
 * to the index of a {@link Vertex}.
 * @author Georg Fischer
 */
public class PositionMap {
  public final static String CVSID = "@(#) $Id: PositionMap.java $";
  
  /**
   * Maps exact {@link Position}s of vertices to the {@link Vertex} at that position
   */
  private HashMap<String, Integer> mPositionHash;

  /** 
   * Empty Constructor.
   */
  public PositionMap() {
    mPositionHash = new HashMap<String, Integer>(1024);
  } // Constructor()
  
  /**
   * Number of stored {@link Position}s
   * @return the size of the internal HashMap
   */
  public int size() {
    return mPositionHash.size();
  } // size

  /**
   * Stores a {@link Vertex} at some {@link Position}.
   * @param vertex the Vertex to be stored
   */
  public void put(final Vertex vertex) {
    mPositionHash.put(vertex.expos.toString(), Integer.valueOf(vertex.index));
  } // put

  /**
   * Gets the index of the {@link Vertex} at some {@link Position}.
   * @param expos the Position where the Vertex is expected
   * @return the index of the Vertex at expos, or -1 if the position is empty
   */
  public int get(final Position expos) {
    final Integer value = mPositionHash.get(expos.toString());
    return value == null ? -1 : value.intValue();
  } // get
 
  /**
   * Returns a JSON representation of the tiling
   * @return JSON for this PositionMap
   */
  public String toJSON() {
    String result  = "{ \"size\": " + mPositionHash.size() + ", \"mPositionHash\": \n";
    final Iterator<String> piter = mPositionHash.keySet().iterator();
    while (piter.hasNext()) {
      final String pos = piter.next();
      final int ind = mPositionHash.get(pos);
      result += (ind == 0 ? "  [ " : "  , ") + "{ \"pos\": \"" + pos + ", index: " + ind + " }\n";
    } // while piter
    result += "  ]\n}\n";
    return result;
  } // toJSON

} // class PositionMap

