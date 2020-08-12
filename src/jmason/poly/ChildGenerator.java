package jmason.poly;

import java.util.List;

/**
 * Defines a generator to list the sons of a polyomino.
 * @author Sean A. Irvine
 */
public interface ChildGenerator {

  /**
   * Method to generate the immediate descendants of a polyomino.
   * @param polyomino the  polyomino
   * @param addOnlyToColour colour control
   * @return children
   */
  List<Polyomino> listSons(final Polyomino polyomino, final int addOnlyToColour);
}
