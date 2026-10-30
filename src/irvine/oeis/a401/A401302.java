package irvine.oeis.a401;

import irvine.oeis.MultiplicativeSequence;

/**
 * A401302 Completely multiplicative with a(p) = Phi_p(p) = (p^p-1)/(p-1) for prime p.
 * @author Sean A. Irvine
 */
public class A401302 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A401302() {
    super(1, (p, e) -> p.pow(p).subtract(1).divide(p.subtract(1)).pow(e));
  }
}
