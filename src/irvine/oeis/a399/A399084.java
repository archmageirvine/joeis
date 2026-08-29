package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399084 a(0) = 0; a(1) = 1; thereafter a(n) = a(n-1) - 1 if that is not already in the sequence, otherwise a(n) = a(n-1) + floor(sqrt(a(n-1))).
 * @author Sean A. Irvine
 */
public class A399084 extends Sequence0 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mPrev = 1;
  private long mLeastUnused = 0;

  @Override
  public Z next() {
    if (mLeastUnused <= 1) {
      return Z.valueOf(mLeastUnused++);
    }
    if (mPrev - 1 >= mLeastUnused && mUsed.add(mPrev - 1)) {
      return Z.valueOf(--mPrev);
    }
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    mPrev += Functions.SQRT.l(mPrev);
    mUsed.add(mPrev);
    return Z.valueOf(mPrev);
  }
}

