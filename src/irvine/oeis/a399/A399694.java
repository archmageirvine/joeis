package irvine.oeis.a399;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398442.
 * @author Sean A. Irvine
 */
public class A399694 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    long k = 2;
    while (true) {
      ++k;
      if (Functions.GCD.l(mA, k) == 1 && Functions.GCD.l(mB, k) != 1 && !mUsed.contains(k) && Functions.OMEGA.i(k) == 2) {
        for (final Z p : Jaguar.factor(k).toZArray()) {
          if (!mB.mod(p).isZero()) {
            mUsed.add(k);
            mA = mB;
            mB = Z.valueOf(k);
            return mB;
          }
        }
      }
    }
  }
}
