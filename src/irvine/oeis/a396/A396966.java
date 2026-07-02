package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396966 allocated for Jakob Stemberger.
 * @author Sean A. Irvine
 */
public class A396966 extends Sequence1 {

  // After Jakob Stemberger

  private int mN = 0;

  private static int v2(long n) {
    n = Math.abs(n);
    int k = 0;
    while (n != 0 && (n & 1) == 0) {
      n >>= 1;
      ++k;
    }
    return k;
  }

  private static boolean isObstruction(final long r, final int l) {
    if ((r & 1) == 0) {
      return false;
    }
    final int v = v2(r - 1);
    if (v <= 0 || v >= l) {
      return false;
    }

    long aK = r;
    long bK = 1L << l;
    long aI = (r - 1) >> v;
    long bI = 1L << (l - v);

    final Z s = Z.ONE.shiftLeft(v);
    Q c = new Q(1, s);
    Q d = c.negate();

    while (true) {
      final long aK3 = 3 * aK - 1;
      final int vK = v2(aK3);
      final int vbK = v2(bK);

      final long aI3 = 3 * aI - 1;
      final int vI = v2(aI3);
      final int vbI = v2(bI);

      if (vK >= vbK || vI >= vbI) {
        return d.multiply(3).add(c).isOne();
      }

      final Q c0 = c;
      final Z s1 = Z.ONE.shiftLeft(vI);
      c = c0.multiply(new Q(Z.ONE.shiftLeft(vK), s1));
      d = d.multiply(3).add(c0).subtract(Q.ONE).divide(s1);

      aK = aK3 >> vK;
      bK = (3 * bK) >> vK;
      aI = aI3 >> vI;
      bI = (3 * bI) >> vI;
    }
  }

  @Override
  public Z next() {
    if (++mN < 5) {
      return Z.ZERO;
    }
    long cnt = 0;
    final long limit = 1L << mN;
    for (long r = 1; r < limit; r += 2) {
      if (isObstruction(r, mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
