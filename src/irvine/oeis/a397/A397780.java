package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A397780 Lexicographically earliest numbers k such that the decimal digits of k and k^2 taken together form a set where each distinct digit d appears at least d times, and this set of digits has not appeared in any previous term.
 * @author Sean A. Irvine
 */
public class A397780 extends Sequence0 {

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
