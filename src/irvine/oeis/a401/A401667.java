package irvine.oeis.a401;

import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A401667.
 * @author Sean A. Irvine
 */
public class A401667 extends Sequence1 {

  // After Igor Zhuk

  private long mN = 4;

  private static long powMod(long a, final long e, final long p) {
    a = Math.floorMod(a, p);
    return LongUtils.modPow(a, e, p);
  }

  private static long f(final long c, final long p, final long inv6) {
    final long t = c * c - 7;
    return Math.floorMod(c * Math.floorMod(t, p), p) * inv6 % p;
  }

  private static boolean is(final long p) {
    if (p < 5 || !Predicates.PRIME.is(p)) {
      return false;
    }
    final long h = p >> 1;
    if (p > 5) {
      if (powMod(13, h, p) == 1) {
        return false;
      }
      if (powMod(19, h, p) == 1 && powMod(-5, h, p) == 1) {
        return false;
      }
    }
    // Inverse of 6 modulo p.
    final long inv6 = p % 6 == 1 ? (5L * p + 1) / 6 : (p + 1L) / 6;
    // 0 = unvisited, 1 = currently on a path, 2 = finished.
    final LongDynamicByteArray st = new LongDynamicByteArray();
    st.set(0, (byte) 2);
    st.set(1, (byte) 2);
    st.set(p - 1, (byte) 2);
    for (long x = 2; x <= (p >> 1); ++x) {
      if (st.get(x) == 2) {
        continue;
      }
      long c = x;
      while (st.get(c) == 0) {
        st.set(c, (byte) 1);
        c = f(c, p, inv6);
      }
      if (st.get(c) == 1) {
        return false;
      }
      c = x;
      while (st.get(c) == 1) {
        st.set(c, (byte) 2);
        st.set(p - c, (byte) 2);
        c = f(c, p, inv6);
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
