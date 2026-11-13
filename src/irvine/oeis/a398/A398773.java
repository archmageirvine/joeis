package irvine.oeis.a398;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398773 Half the number of changes in the stable cyclic row words of the Gosper-Lafitte triangle.
 * @author Sean A. Irvine
 */
public class A398773 extends Sequence0 {

  // After M. Jeremie Lafitte (Levitas)

  private long mN = -1;

  private final Map<Long, Integer> mCache = new HashMap<>();

  private int b(final long n, final long j) {
    if (n == 0) {
      return 1;
    }
    final long key = (n << 32) ^ j;
    final Integer cached = mCache.get(key);
    if (cached != null) {
      return cached;
    }
    final int t = (int) ((n / 2 + j / 2 + n % 2 + j % 2) % 3);
    final int res = (b(n / 2, j / 2) + (t != 0 ? 1 : 0)) % 2;
    mCache.put(key, res);
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mCache.clear();
    final long h = Long.highestOneBit(mN);
    long j = mN;
    final int f = b(mN, mN);
    int p = f;
    int s = 0;
    j = (j - 1) & mN;
    while (j >= h) {
      final int q = b(mN, j);
      if (p != q) {
        ++s;
      }
      p = q;
      j = (j - 1) & mN;
    }
    if (p != f) {
      ++s;
    }
    return Z.valueOf(s / 2);
  }
}
