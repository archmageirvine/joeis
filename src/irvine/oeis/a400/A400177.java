package irvine.oeis.a400;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A399323.
 * @author Sean A. Irvine
 */
public class A400177 extends Sequence3 {

  private long mN = 3;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      if (Functions.GCD.l(mN, mM) == 1) {
        final long t = LongUtils.modInverse(mM, mN);
        final long u = LongUtils.modInverse(-mM, mN);
        if (t < u) {
          return Z.valueOf(mM);
        }
      }
    }
  }
}

