package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.MultiplicativeSequence;

/**
 * A396701 a(n) = Sum_{d|n} tau_3(d) * sigma(n/d).
 * @author Sean A. Irvine
 */
public class A396701 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A396701() {
    super(1, (p, e) -> Integers.SINGLETON.sum(0, e, k -> Binomial.binomial(e - k + 3, e - k).multiply(p.pow(k))));
  }
}
