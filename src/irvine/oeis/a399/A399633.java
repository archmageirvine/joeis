package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399633 allocated for Eric Fox.
 * @author Sean A. Irvine
 */
public class A399633 extends CachedSequence {

  /** Construct the sequence. */
  public A399633() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ZERO;
      }
      long k = 0;
      while (true) {
        ++k;
        long cnt = 0;
        long mnum = -n;
        long mden = 1;
        for (long j = n - 1; j > 0; --j) {
          final long jmnum = self.a(j).longValueExact() - k;
          final long jmden = n - j;
          if (jmnum * mden >= mnum * jmden) {
            mnum = jmnum;
            mden = jmden;
            if (++cnt > k) {
              break;
            }
          }
        }
        if (cnt == k) {
          return Z.valueOf(k);
        }
      }
    });
  }
}
