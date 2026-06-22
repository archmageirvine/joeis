package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006519;
import irvine.oeis.a085.A085587;

/**
 * A396572 Number of distinct states before repetition for a circular array of n distinct elements under repeated adjacent XOR operations.
 * @author Sean A. Irvine
 */
public class A396572 extends Combiner {

  /** Construct the sequence. */
  public A396572() {
    super(1, new A006519(), new A085587(), ADD);
  }
}

