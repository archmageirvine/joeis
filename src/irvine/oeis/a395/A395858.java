package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a057.A057547;

/**
 * A395858 Least number of positive primitive Dyck numbers (A057547) that sum to 2n.
 * @author Sean A. Irvine
 */
public class A395858 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A057547());
  private long mN = 0;
  private long mMin = 0;
  private long mK = 0;

  private void search(final long n, final long k, final long cnt) {
    if (n == 0) {
      mMin = cnt;
      return;
    }
    if (cnt >= mMin) {
      return;
    }
    for (long j = k; j >= 0; --j) {
      final long t = n - mA.a(j).longValueExact();
      if (t >= 0) {
        search(t, j, cnt + 1);
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mMin = mN;
    if (mA.a(mK).compareTo(mN) <= 0) {
      ++mK;
    }
    search(mN, mK, 0);
    return Z.valueOf(mMin);
  }
}
