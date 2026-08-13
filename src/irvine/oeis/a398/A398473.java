package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a126.A126241;

/**
 * A398473 allocated for Kazunobu Hikawa.
 * @author Sean A. Irvine
 */
public class A398473 extends Sequence1 {

  private final DirectSequence mDrop = new A126241();
  private long mLim = 2;

  @Override
  public Z next() {
    long m = mLim | 1;
    mLim *= 2;
    long max = 0;
    while (m < mLim) {
      final long cnt = mDrop.a(m).longValue();
      if (cnt > max) {
        max = cnt;
      }
      m += 2;
    }
    return Z.valueOf(max);
  }
}
