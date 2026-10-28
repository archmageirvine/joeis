package irvine.oeis.a401;

import irvine.oeis.MultiplicativeSequence;

/**
 * A401302 allocated for Iurii Kirpichev.
 * @author Sean A. Irvine
 */
public class A401302 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A401302() {
    super(1, (p, e) -> p.pow(p).subtract(1).divide(p.subtract(1)).pow(e));
  }
}
