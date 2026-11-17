package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401910 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A401910 extends Sequence1 {

  private long mN = 0;

  private Z g(final long t) {
    return t > 0 ? Z.valueOf(t / 2).multiply((t + 1) / 2) : Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> s = new HashSet<>();
    for (long d = 1; d < mN; ++d) {
      for (long xa = 0; xa < mN; ++xa) {
        for (long xb = Math.max(0, xa - d); xb < Math.min(mN, xa + d + 1); ++xb) {
          final long e = Math.abs(xb - xa);
          s.add(Z.valueOf(d + e + 1).multiply(d - e + 1).add(1).divide2().subtract(g(d - xa - xb)).subtract(g(xa + xb + d - 2 * (mN - 1))));
        }
      }
    }
    return Z.valueOf(s.size());
  }
}
