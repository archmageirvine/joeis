package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399348 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A399348 extends Sequence1 {

  private long mBest = -1;
  private long mN = 0;

  private long count(final long n) {
    long m = 0;
    long c = 0;
    while (Predicates.PRIME.is(Math.abs((3 * m + 3) * m - n))) {
      ++c;
      ++m;
    }
    return c;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long cnt = count(mN);
      if (cnt > mBest) {
        mBest = cnt;
        return Z.valueOf(mN);
      }
    }
  }
}
