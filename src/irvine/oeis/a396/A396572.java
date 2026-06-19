package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006519;
import irvine.oeis.a085.A085587;

/**
 * A396572 allocated for Gary Sims.
 * @author Sean A. Irvine
 */
public class A396572 extends Combiner {

  /** Construct the sequence. */
  public A396572() {
    super(1, new A006519().skip(2), new A085587().skip(2), ADD);
  }
}

