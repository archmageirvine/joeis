package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400543 Number of equivalence classes of Boolean functions of n variables under cyclic permutations and independent complementations of variables.
 * @author Sean A. Irvine
 */
public class A400543 extends Sequence1 {

  private long mN = 0;

  private long c1(final long n, final long d) {
    return Integers.SINGLETON.sumdiv(d, r -> Functions.PHI.z(r).shiftLeft(n / r)).divide(d).longValueExact();
  }

  private long c2(final long n, final long d) {
    return Integers.SINGLETON.sumdiv(d, r -> (r & 1) == 0 ? Z.ZERO : Functions.PHI.z(r).shiftLeft(n / r)).divide(2 * d).longValueExact();
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Functions.PHI.z(d).multiply(Z.ONE.shiftLeft(c1(mN, d) - mN / d).add(Z.ONE.shiftLeft(mN / d).subtract(1).shiftLeft(c2(mN, d) - mN / d)))).divide(mN);
  }
}
