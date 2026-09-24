package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398229 allocated for David Niedbala Giraudin.
 * @author Sean A. Irvine
 */
public class A398229 extends Sequence0 {

  // After David Niedbala Giraudin

  private List<Long> mPrev2 = Collections.singletonList(pack(1, 0));
  private List<Long> mPrev1;
  private int mN = 0;


  /*
   * Multiplication of polynomials over GF(2), represented by coefficient bits.
   */
  private static int mul(int a, int p) {
    int r = 0;
    while (a != 0) {
      if ((a & 1) != 0) {
        r ^= p;
      }
      a >>>= 1;
      p <<= 1;
    }
    return r;
  }

  private static long pack(final int p, final int q) {
    return ((long) q << 32) | (p & 0xffffffffL);
  }

  private static int unpackP(final long pair) {
    return (int) pair;
  }

  private static int unpackQ(final long pair) {
    return (int) (pair >>> 32);
  }

  @Override
  public Z next() {
    ++mN;
    final List<Long> current = new ArrayList<>();
    if (mN == 1) {
      // All possibilities come from lv[0]
      for (int a = 2; a <= 3; ++a) {
        current.add(pack(mul(a, 1), 1));
      }
    } else {
      // a = 2,3: k = 1, hence use lv[mN-1]
      for (final long pair : mPrev1) {
        final int p = unpackP(pair);
        final int q = unpackQ(pair);
        current.add(pack(mul(2, p) ^ q, p));
        current.add(pack(mul(3, p) ^ q, p));
      }
      // a = 4,5,6,7: k = 2, hence use lv[mN-2]
      for (final long pair : mPrev2) {
        final int p = unpackP(pair);
        final int q = unpackQ(pair);
        for (int a = 4; a <= 7; ++a) {
          current.add(pack(mul(a, p) ^ q, p));
        }
      }
      // Advance the two-level window.
      mPrev2 = mPrev1;
    }
    mPrev1 = current;
    // Count occurrences of each p.
    final Map<Integer, Integer> counts = new HashMap<>();
    for (final long pair : current) {
      counts.merge(unpackP(pair), 1, Integer::sum);
    }
    // Sum of squares of the multiplicities.
    Z result = Z.ZERO;
    for (final int count : counts.values()) {
      result = result.add((long) count * count);
    }
    return result;
  }
}
