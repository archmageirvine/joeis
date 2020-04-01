package jmason.poly;

import java.util.List;

/**
 * Defines a generator to list the sons of a polyomino.
 * @author Sean A. Irvine
 */
interface ChildGenerator {
  List<Polyomino> listSons(final Polyomino polyomino, final int addOnlyToColour);
}
