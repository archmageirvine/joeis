package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.MultiplicativeSequence;

/**
 * A396702 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A396702 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A396702() {
    super(1, (p, e) -> Integers.SINGLETON.sum(0, e, k -> Binomial.binomial(e - k + 4, e - k).multiply(p.pow(k))));
  }
}
