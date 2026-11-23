package irvine.oeis.a398;

import irvine.math.turing.Antihydra;
import irvine.oeis.FilterNumberSequence;

/**
 * A398746 Even numbers k such that the Antihydra iteration starting from k halts (conjectural).
 * @author Sean A. Irvine
 */
public class A398746 extends FilterNumberSequence {

  private static final int HEURISTIC = 10000;

  /** Construct the sequence. */
  public A398746() {
    super(1, 0, 2, k -> Antihydra.haltingTime(k, HEURISTIC) != 0);
  }
}
