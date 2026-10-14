package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400892 allocated for David L. Condrey.
 * @author Sean A. Irvine
 */
public class A400892 extends Sequence1 {

  private long mN = 0;

  private long f(final long m, long x) {
    long w = 0;
    for (long t = 0; t < 2 * m; ++t) {
      w |= (x & ~t & 1) << (t >>> 1);
      x = ((2 * x) | (t & 1)) ^ (x | (x >>> 1));
    }
    return w;
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> res = new HashSet<>();
    for (long x = 0; x < 1L << (2 * mN); ++x) {
      res.add(f(mN, x));
    }
    return Z.valueOf(res.size());
  }
}
