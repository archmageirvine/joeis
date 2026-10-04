package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400518 Number of equivalence classes of n X n binary matrices under cyclic permutations of rows and complementations of columns.
 * @author Sean A. Irvine
 */
public class A400518 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(Functions.PHI.z(d).shiftLeft(mN * mN / d.longValue() + (d.isOdd() ? 0 : mN)));
    }
    return sum.shiftRight(mN).divide(mN);
  }
}

