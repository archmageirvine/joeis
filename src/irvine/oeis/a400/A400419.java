package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001865;

/**
 * A400419 Number of endofunctions on [n] whose connected components have the same size.
 * @author Gregory Morse
 */
public class A400419 extends Sequence0 {
  private final A001865 mConnected = new A001865();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z fac = Functions.FACTORIAL.z(mN);
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int k = d.intValueExact();
      final int c = mN / k;
      final Z partitions = fac.divide(Functions.FACTORIAL.z(k).pow(c).multiply(Functions.FACTORIAL.z(c)));
      sum = sum.add(partitions.multiply(mConnected.a(k).pow(c)));
    }
    return sum;
  }
}
