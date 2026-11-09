package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A401171 Nonprime numbers k, such that 2*u*k + 2 = u*sigma(k) + tau(k), where u is an integer.
 * @author Sean A. Irvine
 */
public class A401171 extends FilterSequence {

  /** Construct the sequence. */
  public A401171() {
    super(1, new A018252(), n -> {
      final Z s0 = Functions.SIGMA0.z(n);
      final Z s1 = Functions.SIGMA1.z(n);
      final Z t = n.multiply2().subtract(s1);
      return t.divide(Functions.GCD.z(t, s0.subtract(2))).abs().isOne();
    });
  }
}

