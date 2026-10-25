package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400685 allocated for Felix Huber.
 * @author Felix Huber
 * @author Sean A. Irvine (Java port)
 */
public class A400685 extends Sequence0 {

  private int mN = -1;

  private static Z z(final int n) {
    return Z.valueOf(n);
  }

  private static void inc(final Z[][] a, final int i, final int j, final Z v) {
    a[i][j] = a[i][j].add(v);
  }

  private static void inc(final Z[][][] a, final int i, final int j, final int h, final Z v) {
    a[i][j][h] = a[i][j][h].add(v);
  }

  private static Z[][] newMatrix(final int rows, final int cols) {
    final Z[][] a = new Z[rows][cols];
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < cols; ++j) {
        a[i][j] = Z.ZERO;
      }
    }
    return a;
  }

  private static Z[][][] newCube(final int rows, final int cols, final int depth) {
    final Z[][][] a = new Z[rows][cols][depth];
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < cols; ++j) {
        for (int h = 0; h < depth; ++h) {
          a[i][j][h] = Z.ZERO;
        }
      }
    }
    return a;
  }

  private static Z[][] copy(final Z[][] a) {
    final Z[][] b = new Z[a.length][];
    for (int i = 0; i < a.length; ++i) {
      b[i] = a[i].clone();
    }
    return b;
  }

  private static Z[][][] copy(final Z[][][] a) {
    final Z[][][] b = new Z[a.length][][];
    for (int i = 0; i < a.length; ++i) {
      b[i] = new Z[a[i].length][];
      for (int j = 0; j < a[i].length; ++j) {
        b[i][j] = a[i][j].clone();
      }
    }
    return b;
  }

  private static Z[][] t(final int[] l, final int k) {
    final int d = k * l.length;
    int h = 0;
    for (final int a : l) {
      h = Math.max(h, Math.abs(a));
    }
    Z[][] p = newMatrix(k + 1, 2 * d + 1);
    p[0][d] = Z.ONE;
    for (final int a : l) {
      final Z[][] q = copy(p);
      for (int j = 0; j < k; ++j) {
        for (int s = -j * h; s <= j * h; ++s) {
          final Z value = p[j][s + d];
          if (!value.isZero()) {
            for (int c = 1; c <= k - j; ++c) {
              inc(q, j + c, s + a * c + d, value);
              inc(q, j + c, s - a * c + d, value);
            }
          }
        }
      }
      p = q;
    }
    return p;
  }

  private static Z b(final int n) {
    final int k = 2 * n;
    final int d = k * n;
    final int[][] x = {{1, 2}, {1, 4}, {3, 2}, {3, 0}, {0, 4}};
    Z[][][] p = newCube(k + 1, 2 * d + 1, 5);
    p[0][d][0] = Z.ONE;
    for (int a = 1 - n; a <= n - 1; ++a) {
      final Z[][][] q = copy(p);
      for (int j = 0; j < k; ++j) {
        for (int s = -d; s <= d; ++s) {
          for (int h = 0; h <= 4; ++h) {
            final Z value = p[j][s + d][h];
            if (!value.isZero()) {
              for (final int e : new int[] {1, -1}) {
                final int v = x[h][(1 - e) / 2];
                if (v > 0) {
                  for (int c = 1; c <= k - j; ++c) {
                    inc(q, j + c, s + e * a * c + d, v, value);
                  }
                }
              }
            }
          }
        }
      }
      p = q;
    }
    Z result = Z.ZERO;
    for (int h = 0; h <= 4; ++h) {
      result = result.add(p[k][d][h]);
    }
    return result;
  }

  private static Z m(final int n, final Z[][] p) {
    final int k = 2 * n;
    Z r = p[k][k * (2 * n - 1)];
    final int[] l = new int[Math.max(0, n - 1)];
    for (int i = 0; i < l.length; ++i) {
      l[i] = i + 1;
    }
    final Z[][] g = t(l, n);
    Z f = g[n][n * l.length];
    for (int i = 0; i <= n; ++i) {
      f = f.add(Binomial.binomial(n, i).multiply(Binomial.binomial(2L * n - i - 1, n - i)));
    }
    r = r.subtract(b(n));
    f = f.subtract(Binomial.binomial(2L * n - 1, n).multiply(2));
    return r.add(f);
  }

  private static final class Entry {
    private final int mA;
    private final int mB;
    private final int mC;
    private Z mWeight;

    private Entry(final int aa, final int bb, final int cc, final Z ww) {
      mA = aa;
      mB = bb;
      mC = cc;
      mWeight = ww;
    }
  }

  private static String key(final int a, final int b, final int c) {
    return a + "," + b + "," + c;
  }

  private static List<Entry> l(final int k) {
    final Map<String, Entry> w = new HashMap<>();
    for (final int s : new int[] {1, -1}) {
      for (int a = 1; a <= k; ++a) {
        final int xx = -s * a;
        for (final int r : new int[] {1, -1}) {
          for (int bb = 1; bb <= k - a; ++bb) {
            final int y = r * bb;
            final int u = k - a - bb;

            for (final int e : new int[] {0, 1, -1}) {
              final int cmin = e == 0 ? 0 : 1;
              final int cmax = e == 0 ? 0 : u;
              for (int c = cmin; c <= cmax; ++c) {
                final int j = Math.min(xx, xx - e * c);
                final int h = Math.max(xx, xx - e * c);
                if (h >= Math.min(0, y) && j <= Math.max(0, y)) {
                  continue;
                }

                for (final int f : new int[] {0, 1, -1}) {
                  final int gmin = f == 0 ? 0 : 1;
                  final int gmax = f == 0 ? 0 : u - c;
                  for (int gg = gmin; gg <= gmax; ++gg) {
                    final int pp = Math.min(y, y + f * gg);
                    final int qq = Math.max(y, y + f * gg);
                    if (qq >= Math.min(xx, 0) && pp <= Math.max(xx, 0)) {
                      continue;
                    }

                    final int aa = a + bb + c + gg;
                    final int bbb = s * a + f * gg;
                    final int cc = r * bb + e * c;
                    final String key = key(aa, bbb, cc);
                    final Entry old = w.get(key);
                    if (old == null) {
                      w.put(key, new Entry(aa, bbb, cc, Z.ONE));
                    } else {
                      old.mWeight = old.mWeight.add(Z.ONE);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return new ArrayList<>(w.values());
  }

  private static Z o(final int n, final Z[][] p) {
    final int k = 2 * n - 2;
    if (k < 2) {
      return Z.ZERO;
    }

    final List<Entry> entries = l(k);
    final int d = 2 * n * (2 * n - 1);
    Z result = Z.ZERO;

    for (int y = 2; y <= 2 * n - 1; ++y) {
      final int a = y - 1 - n;
      final int b = y - n;
      final int[] ss = {a, -a, b, -b};

      final int[][] subsets = new int[16][3];
      for (int mask = 0; mask < 16; ++mask) {
        int parity = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 4; ++i) {
          if (((mask >> i) & 1) != 0) {
            ++parity;
            ++count;
            sum += ss[i];
          }
        }
        subsets[mask][0] = (parity & 1) == 0 ? 1 : -1;
        subsets[mask][1] = count;
        subsets[mask][2] = sum;
      }

      for (final Entry entry : entries) {
        final int zz = -(b * entry.mB + a * entry.mC);
        for (final int[] subset : subsets) {
          int j = k - entry.mA - subset[1];
          int mult = 1;
          while (j >= 0) {
            final int gg = zz - subset[2];
            if (Math.abs(gg) <= d) {
              result = result.add(entry.mWeight
                .multiply(subset[0])
                .multiply(mult)
                .multiply(p[j][gg + d]));
            }
            j -= 2;
            ++mult;
          }
        }
      }
    }
    return result;
  }

  private static int w(final int m, final int r, final int[] e, final int[] h) {
    int a = 1;
    int b = 1;
    for (int i = 0; i < r / 2; ++i) {
      if (h[i] + h[r - 1 - i] != m) {
        return 1;
      }
      if (e[i] != -e[r - 1 - i]) {
        a = 0;
      }
      if (e[i] != e[r - 1 - i]) {
        b = 0;
      }
    }
    return 1 + a + b;
  }

  private static Z d(final int n, final int r, final int[] e, final int[] h,
                     final int i, final int ll, final int y, final int f,
                     final int x, final Z[] v, final Z[] p) {
    final int m = 2 * n;
    Z result = Z.ZERO;

    final int j;
    final int k;
    if (i == r) {
      j = n - e[i - 1] * f;
      k = j;
    } else {
      final int ss = (r - i) * (n - 1);
      j = Math.max(Math.max(1, n - ss - e[i - 1] * f),
        (int) Math.ceil((ll + y + r - m) / 2.0));
      k = Math.min(m - 1, n + ss - e[i - 1] * f);
    }

    for (int tt = j; tt <= k; ++tt) {
      final int u = ll + Math.abs(tt - y);
      if (i == r && (tt < 1 || tt >= m || u + m - tt != 2 * m - r)) {
        continue;
      }

      final Z zz = tt >= y ? p[tt + 1].subtract(p[y + 1]) : p[y].subtract(p[tt]);

      if (v[x].and(zz).signum() != 0
        || v[x + e[i - 1]].and(p[tt]).signum() != 0) {
        continue;
      }

      v[x] = v[x].add(zz);
      v[x + e[i - 1]] = v[x + e[i - 1]].add(p[tt]);
      h[i - 1] = tt;

      if (i == r) {
        if (v[x + e[i - 1]].and(p[m + 1].subtract(p[tt + 1])).signum() == 0) {
          result = result.add(z(w(m, r, e, h)));
        }
      } else {
        result = result.add(d(n, r, e, h, i + 1, u, tt,
          f + e[i - 1] * (tt - n), x + e[i - 1], v, p));
      }

      v[x] = v[x].subtract(zz);
      v[x + e[i - 1]] = v[x + e[i - 1]].subtract(p[tt]);
    }
    return result;
  }

  @Override
  public Z next() {
    final int n = ++mN;
    if (n == 0) {
      return Z.ONE;
    }

    final int k = 2 * n;
    final int[] seq = new int[2 * n - 1];
    for (int i = 0; i < seq.length; ++i) {
      seq[i] = i + 1 - n;
    }
    final Z[][] g = t(seq, k);

    final Z[] powers = new Z[k + 2];
    powers[0] = Z.ONE;
    for (int j = 1; j < powers.length; ++j) {
      powers[j] = powers[j - 1].shiftLeft(1);
    }

    Z a = Z.ZERO;
    for (int r = 2; r <= 2 * n - 4; r += 2) {
      final int[] e = new int[r];
      final int[] h = new int[r];
      e[0] = 1;
      for (int mask = 0; mask < (1 << (r - 1)); ++mask) {
        int s = 1;
        for (int j = 1; j < r; ++j) {
          e[j] = ((mask >> (j - 1)) & 1) * 2 - 1;
          s += e[j];
        }
        s = (k - s) / 2;
        if (s < 1 || s >= k) {
          continue;
        }
        int xx = s;
        boolean valid = true;
        for (int j = 0; j < r; ++j) {
          xx += e[j];
          if (xx <= 0 || xx >= k) {
            valid = false;
            break;
          }
        }
        if (!valid) {
          continue;
        }
        final Z[] v = new Z[k + 1];
        for (int j = 0; j <= k; ++j) {
          v[j] = Z.ZERO;
        }
        v[s] = Z.ONE;
        a = a.add(d(n, r, e, h, 1, 0, 0, 0, s, v, powers));
      }
    }

    return m(n, g).add(o(n, g)).add(a.multiply(2)).divide(4);
  }
}
