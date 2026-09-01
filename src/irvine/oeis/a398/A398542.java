package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398542 Number of 1324-avoiding L-griddings with n points.
 * @author Sean A. Irvine
 */
public class A398542 extends Sequence0 {

  // Small 132-avoiders are retained because they are needed by U(m,k).
  private final List<List<Perm>> mAv132 = new ArrayList<>();
  // Cached d-vectors for the small permutations used by U.
  private final Map<Perm, long[]> mDvec = new HashMap<>();
  // U(m,k) = sum_{b in S(m)} d(b,k).
  private final Map<Long, Long> mU = new HashMap<>();

  /*
   * F(m,r) = sum_{b in S(m)} sum_{i=2}^{r-2} d(b,i)d(b^(-1),r-i).
   * Only coefficients which have actually been requested are stored.
   */
  private final List<long[]> mF = new ArrayList<>();

  private int mN = -1;

  /**
   * A permutation.
   */
  private static final class Perm {

    private final int[] mA;
    private final int mHash;

    Perm(final int[] a) {
      mA = a.clone();

      int h = 1;
      for (final int x : mA) {
        h = 31 * h + x;
      }
      mHash = h;
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Perm)) {
        return false;
      }
      final int[] b = ((Perm) obj).mA;
      if (b.length != mA.length) {
        return false;
      }
      for (int k = 0; k < mA.length; ++k) {
        if (mA[k] != b[k]) {
          return false;
        }
      }
      return true;
    }
  }

  /**
   * Generate and retain the 132-avoiders of size m.
   * This is used only for the relatively small m occurring in U.
   */
  private List<Perm> av132(final int m) {
    while (mAv132.size() <= m) {
      mAv132.add(null);
    }
    final List<Perm> old = mAv132.get(m);
    if (old != null) {
      return old;
    }
    final List<Perm> result = new ArrayList<>();
    if (m == 0) {
      result.add(new Perm(new int[0]));
    } else {
      for (int a = 0; a < m; ++a) {
        final int r = m - 1 - a;
        for (final Perm al : av132(a)) {
          for (final Perm be : av132(r)) {
            final int[] p = new int[m];
            for (int i = 0; i < a; ++i) {
              p[i] = al.mA[i] + r;
            }
            p[a] = m;
            System.arraycopy(be.mA, 0, p, a + 1, r);
            result.add(new Perm(p));
          }
        }
      }
    }
    mAv132.set(m, result);
    return result;
  }


  /**
   * Callback used by the streaming 132-avoider generator.
   */
  @FunctionalInterface
  private interface PermConsumer {
    void accept(int[] p);
  }

  /**
   * Generate all 132-avoiders of size m, without retaining them.
   * The same int[] is reused throughout the traversal.
   * If p has size m and its maximum m occurs at position a, then
   *   p = (alpha+r, m, beta)
   * where r=m-1-a, alpha is a 132-avoider of size a and beta
   * is a 132-avoider of size r.
   */
  private static void forEachAv132(final int m, final PermConsumer consumer) {
    final int[] p = new int[m];
    generateAv132(m, p, 0, consumer);
  }

  /**
   * Recursive implementation of forEachAv132.
   * The range [offset, offset+m) is filled, leaving all other entries untouched.
   */
  private static void generateAv132(final int m, final int[] p, final int offset, final PermConsumer consumer) {
    if (m == 0) {
      consumer.accept(p);
      return;
    }

    for (int a = 0; a < m; ++a) {
      final int r = m - 1 - a;
      /*
       * Generate alpha in the left range.
       * Once alpha has been generated, shift its entries by r.
       */
      final int aa = a;
      generateAv132(a, p, offset, q -> {
        for (int i = 0; i < aa; ++i) {
          p[offset + i] += r;
        }
        p[offset + aa] = m;
        // Generate beta directly in the disjoint right range.
        generateAv132(r, p, offset + aa + 1, qq -> consumer.accept(p));
        // Restore alpha so that the next recursive branch starts with the same representation.
        for (int i = 0; i < aa; ++i) {
          p[offset + i] -= r;
        }
      });
    }
  }

  private static int[] inverse(final int[] b) {
    final int m = b.length;
    final int[] c = new int[m];
    for (int i = 0; i < m; ++i) {
      c[b[i] - 1] = i + 1;
    }
    return c;
  }

  /**
   * Lexicographic comparison of a streamed permutation with its inverse.
   * Avoids constructing the inverse when the comparison itself can
   * already determine that the permutation is the wrong half.
   */
  private static int compareWithInverse(final int[] b) {
    final int m = b.length;
    /*
     * We need b[i] compared with inv(b)[i].
     * inv(b)[i] is the position at which value i+1 occurs.
     */
    final int[] pos = new int[m];
    for (int i = 0; i < m; ++i) {
      pos[b[i] - 1] = i + 1;
    }
    for (int i = 0; i < m; ++i) {
      if (b[i] != pos[i]) {
        return Integer.compare(pos[i], b[i]);
      }
    }
    return 0;
  }

  /*
   * Compute d(b,k), for k=0..kmax, for a streamed int[] permutation.
   */
  private static long[] dvec(final int[] b, final int kmax) {
    final int m = b.length;
    final int[] dead = new int[m + 1];
    int pm = m + 2;
    for (int g = 0; g <= m; ++g) {
      if (g != 0) {
        pm = Math.min(pm, b[g - 1]);
      }
      int dh = m + 2;
      for (int h = g + 1; h <= m; ++h) {
        if (b[h - 1] > pm) {
          dh = h;
          break;
        }
      }
      dead[g] = dh;
    }

    final int k1 = m + 2;
    final long k2 = (long) k1 * k1;
    final long k3 = k2 * (m + 3L);
    final Map<Long, Long> memo = new HashMap<>();
    class N {
      long get(final int glo, final int ghi,  final int cap, final int k) {
        if (k == 0) {
          return 1;
        }
        if (glo > ghi || glo >= cap) {
          return 0;
        }
        final int hi = Math.min(ghi, cap - 1);
        if (k == 1) {
          return hi - glo + 1L;
        }
        final long key = glo + (long) ghi * k1 + (long) cap * k2 + (long) k * k3;
        final Long old = memo.get(key);
        if (old != null) {
          return old;
        }
        long v = 0;
        if (k == 2) {
          for (int g = glo; g <= hi; ++g) {
            final int cp = Math.min(dead[g], cap);
            v += g - glo + 1L;
            if (g < cp) {
              v += Math.min(ghi, cp - 1) - g + 1L;
            }
          }
        } else {
          for (int g = glo; g <= hi; ++g) {
            final int capb = Math.min(dead[g], cap);
            for (int a = 0; a < k; ++a) {
              final long left = get(glo, g, cap, a);
              if (left != 0) {
                v += left * get(g, ghi, capb, k - 1 - a);
              }
            }
          }
        }
        memo.put(key, v);
        return v;
      }
    }

    final N n = new N();
    final long[] result = new long[kmax + 1];
    for (int k = 0; k <= kmax; ++k) {
      result[k] = n.get(0, m, m + 2, k);
    }
    return result;
  }

  /*
   * Cached dvec for a retained small permutation.
   */
  private long[] dvec(final Perm b, final int kmax) {
    final long[] old = mDvec.get(b);
    if (old != null && old.length > kmax) {
      return old;
    }
    final long[] result = dvec(b.mA, kmax);
    mDvec.put(b, result);
    return result;
  }

  private static long key(final int x, final int y) {
    return ((long) x << 32) | (y & 0xffffffffL);
  }

  /**
   * U(m,k) = sum_{b in S(m)} d(b,k).
   * By symmetry U(m,k)=U(k,m), so only the smaller argument
   * needs explicit Catalan enumeration.
   */
  private long u(final int m, final int k) {
    final long key = key(m, k);

    final Long old = mU.get(key);
    if (old != null) {
      return old;
    }
    if (m > k) {
      final long result = u(k, m);
      mU.put(key, result);
      return result;
    }

    long result = 0;
    for (final Perm b : av132(m)) {
      result += dvec(b, k)[k];
    }
    mU.put(key, result);
    mU.put(key(k, m), result);
    return result;
  }


  /*
   * Ensure storage for F(m,*).
   */
  private long[] fArray(final int m, final int r) {
    while (mF.size() <= m) {
      mF.add(null);
    }
    long[] f = mF.get(m);
    if (f == null) {
      f = new long[r + 1];
      mF.set(m, f);
    } else if (f.length <= r) {
      final long[] nf = new long[r + 1];
      System.arraycopy(f, 0, nf, 0, f.length);
      f = nf;
      mF.set(m, f);
    }
    return f;
  }


  /**
   * Compute the main contribution F(m,r), streaming through S(m).
   * F(m,r) = sum_{b in S(m)} sum_{i=2}^{r-2} d(b,i)d(b^-1,r-i).
   */
  private long f(final int m, final int r) {
    final long[] f = fArray(m, r);

    /*
     * A zero value is ambiguous because the actual coefficient can
     * be zero. We therefore use r+1 as the fact that it has been
     * computed only implicitly here. Since f is called monotonically
     * in r by computeNext(), this is sufficient to simply recompute
     * only when r is the new largest requested coefficient.
     *
     * The current incremental caller guarantees that.
     */
    final int kmax = r - 2;

    final long[] sum = new long[1];
    forEachAv132(m, b -> {
      /*
       * Only one member of each {b,b^-1} pair.
       * compareWithInverse() returns:
       *   < 0 if inv(b) < b
       *   = 0 if inv(b) = b
       *   > 0 if inv(b) > b.
       */
      final int cmp = compareWithInverse(b);
      if (cmp < 0) {
        return;
      }
      final long w = cmp == 0 ? 1 : 2;
      final int[] c = inverse(b);
      final long[] db = dvec(b, kmax);
      final long[] dc = dvec(c, kmax);
      long s = 0;
      for (int i = 2; i <= r - 2; ++i) {
        s += db[i] * dc[r - i];
      }
      sum[0] += w * s;
    });
    f[r] = sum[0];
    return sum[0];
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ZERO;
    // Boundary contributions
    for (int m = 0; m <= mN; ++m) {
      final int d = mN - m;
      // i = 0
      result = result.add(u(m, d));
      // i = 1
      if (d >= 1) {
        result = result.add((long) (m + 1) * u(m, d - 1));
      }
      // j = 0
      if (d >= 2) {
        result = result.add(u(m, d));
        // j = 1
        if (d >= 3) {
          result = result.add((long) (m + 1) * u(m, d - 1));
        }
      }
    }

    // Main contributions
    for (int m = 0; m <= mN - 4; ++m) {
      result = result.add(f(m, mN - m));
    }
    return result;
  }
}
