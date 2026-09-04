package irvine.oeis.a399;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399457 allocated for Nathan Nichols.
 * @author Sean A. Irvine
 */
public class A399457 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 3;

  private boolean is(final Z a, final long k) {
    for (final Z p : Jaguar.factor(k).toZArray()) {
      if (!a.mod(p).isZero()) {
        return true;
      }
    }
    return false;
  }

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
    while (mUsed.remove(mLeastUnused) || !Predicates.SQUARE_FREE.is(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.contains(k) && Functions.GCD.l(mA, k) == 1 && Functions.GCD.l(mB, k) > 1 && Predicates.SQUARE_FREE.is(k) && is(mB, k)) {
        mA = mB;
        mB = Z.valueOf(k);
        mUsed.add(k);
        return mB;
      }
      ++k;
    }
  }
}

