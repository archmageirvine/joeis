package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A396889 allocated for Yuanhao Ding.
 * @author Sean A. Irvine
 */
public class A396889 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int[] a) {
    for (int k = 1; k <= mN; ++k) {
      long v = 0;
      Z t = Z.ZERO;
      for (final int c : a) {
        t = t.multiply(k).add(c);
      }
      t = t.multiply(k).add(1);
      if (!t.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final Bumper bumper = BumperFactory.range(0, mN);
    int[] a = new int[mN];
    long cnt = 0;
    do {
      if (is(a)) {
        ++cnt;
      }
    } while (bumper.bump(a));
    return Z.valueOf(cnt);
  }
}
