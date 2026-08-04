package irvine.oeis.a397;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A397810 allocated for Russ Curry.
 * @author Sean A. Irvine
 */
public class A397810 extends Sequence1 {

  private final LongDynamicLongArray mCube = new LongDynamicLongArray();
  private long mMaxCube = 1;
  private long mX = 0;
  private final TreeSet<Long> mPending = new TreeSet<>();
  {
    mCube.set(0, 0);
    mCube.set(1, 1);
  }

  private void ensureCube(final long n) {
    while (mMaxCube < n) {
      ++mMaxCube;
      mCube.set(mMaxCube, mMaxCube * mMaxCube * mMaxCube);
    }
  }

  private static boolean isA147857(final long n) {
    if (n == 0) {
      return true;
    }
    for (final Z dz : Jaguar.factor(n).divisors()) {
      final long d = dz.longValueExact();
      final long u = n / d - d;
      if ((u & 1) == 0) {
        final long t = u / 2;
        if (t > 0 && Predicates.SQUARE.is(t) && Predicates.SQUARE.is(t + d)) {
          return true;
        }
      }
    }
    return false;
  }

  private void generateNextRow() {
    ++mX;
    ensureCube(mX);
    final long x3 = mCube.get(mX);
    for (long y = 1; y <= mX; ++y) {
      ensureCube(y);
      final long v = x3 + mCube.get(y);
      if (isA147857(v)) {
        mPending.add(v);
      }
    }
  }

  @Override
  public Z next() {
    while (mPending.isEmpty()) {
      generateNextRow();
    }

    while (true) {
      ensureCube(mX + 1);
      if (mCube.get(mX + 1) + 1 > mPending.first()) {
        return Z.valueOf(mPending.pollFirst());
      }
      generateNextRow();
    }
  }
}
