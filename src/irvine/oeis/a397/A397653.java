package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397653 Number of equivalence classes of n X n binary matrices under cyclic permutations and complementations of rows and columns.
 * @author Sean A. Irvine
 */
public class A397653 extends Sequence1 {

  private long mN = 0;

  private Z k(final long n, final long d, final long e) {
    final long g = Functions.GCD.l(d, e);
    if (((d / g) & 1) == 0 && ((e / g) & 1) == 1) {
      return Z.ONE.shiftLeft(2 * n - n / d - 1);
    }
    if (((d / g) & 1) == 1 && ((e / g) & 1) == 0) {
      return Z.ONE.shiftLeft(2 * n - n / e - 1);
    }
    return Z.ONE.shiftLeft(2 * n - n / d - n / e);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z[] div = Jaguar.factor(mN).divisors();
    for (final Z d : div) {
      for (final Z e : div) {
        final Z lcm = Functions.LCM.z(d, e);
        sum = sum.add(Functions.PHI.z(d).multiply(Functions.PHI.z(e)).multiply(k(mN, d.longValue(), e.longValue())).shiftLeft(mN * mN / lcm.longValueExact()));
      }
    }
    return sum.shiftRight(2 * mN - 1).divide(mN * mN);
  }
}
