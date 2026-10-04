package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A397971 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0
      ? Z.ONE
      : Integers.SINGLETON.sumdiv(mN, d -> Functions.PHI.z(mN / d).shiftLeft(d * (1L << mN))).divide(mN);
  }
}

