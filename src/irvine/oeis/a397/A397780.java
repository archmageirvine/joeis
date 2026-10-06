package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A397780 allocated for Dmytro Voievoda.
 * @author Sean A. Irvine
 */
public class A397780 extends Sequence1 {

  private final HashSet<Integer> mSeen = new HashSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    if (mSeen.size() == 1023) {
      return null;
    }
    while (true) {
      final int[] cnt0 = ZUtils.digitCounts(++mN);
      final int[] cnt1 = ZUtils.digitCounts(Z.valueOf(mN).square());
      int syn = 0;
      boolean ok = true;
      for (int k = 0; k < cnt0.length; ++k) {
        cnt0[k] += cnt1[k];
        if (cnt0[k] > 0) {
          if (cnt0[k] < k) {
            ok = false;
          }
          syn |= 1 << k;
        }
      }
      if (ok && mSeen.add(syn)) {
        return Z.valueOf(mN);
      }
    }
  }
}
