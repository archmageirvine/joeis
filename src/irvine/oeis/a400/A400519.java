package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400519 Number of equivalence classes of n X n binary matrices under cyclic permutations of rows and columns and complementation of all entries.
 * @author Sean A. Irvine
 */
public class A400519 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z[] div = Jaguar.factor(mN).divisors();
    for (final Z d : div) {
      for (final Z e : div) {
        final Z lcm = Functions.LCM.z(d, e);
        sum = sum.add(Functions.PHI.z(d).multiply(Functions.PHI.z(e)).multiply(lcm.isEven() ? 2 : 1).shiftLeft(mN * mN / lcm.longValueExact()));
      }
    }
    return sum.divide(2 * mN * mN);
  }
}
