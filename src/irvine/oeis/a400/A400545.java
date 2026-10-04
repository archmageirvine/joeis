package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A400545 extends Sequence1 {

  private long mN = 0;

  private long c(final long n, final long q) {
    return Integers.SINGLETON.sumdiv(q, d -> Functions.PHI.z(d).shiftLeft(n / d)).divide(q).longValueExact();
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, q -> Functions.MOBIUS.z(q).shiftLeft(c(mN, q))).divide(mN);
  }
}

