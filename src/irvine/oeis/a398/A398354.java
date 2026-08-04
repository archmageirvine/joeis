package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398354 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A398354 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;
  private long[] mRow = {};

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      ++mN;
      final HashSet<Long> s = new HashSet<>();
      for (long k = 1; k <= mN; ++k) {
        for (long j = 1; j <= k; ++j) {
          s.add(j * k);
        }
      }
      mRow = new long[mN];
      for (final long v : s) {
        ++mRow[(int) (v % mN)];
      }
    }
    return Z.valueOf(mRow[mM]);
  }
}

