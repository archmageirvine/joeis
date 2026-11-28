package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401089 allocated for Pietro Tiaraju Giavarina dos Santos.
 * @author Sean A. Irvine
 */
public class A401089 extends Sequence1 {

  /**
   * Absolute comparison tolerance is 2^PRECISION.
   * Increase the magnitude for more precision.
   */
  private static final int PRECISION = -160;
  private static final Comparator<CR> CR_COMPARATOR = (a, b) -> a.compareTo(b, PRECISION);

  private static CR angle(final int t, final int m) {
    return CR.PI.multiply(t).divide(m);
  }

  private static boolean contains(final CR[] offsets, final CR h) {
    int lo = 0;
    int hi = offsets.length - 1;
    while (lo <= hi) {
      final int mid = (lo + hi) >>> 1;
      final int c = offsets[mid].compareTo(h, PRECISION);
      if (c == 0) {
        return true;
      } else if (c < 0) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return false;
  }

  private static CR[][] inverse(final CR[] ux, final CR[] uy) {
    final CR a00 = ux[0];
    final CR a01 = uy[0];
    final CR a10 = ux[1];
    final CR a11 = uy[1];
    final CR a20 = ux[2];
    final CR a21 = uy[2];

    final CR det = a00.multiply(a11.subtract(a21))
      .subtract(a01.multiply(a10.subtract(a20)))
      .add(a10.multiply(a21).subtract(a11.multiply(a20)));

    if (det.compareTo(CR.ZERO, PRECISION) == 0) {
      return null;
    }

    final CR d = det.inverse();
    return new CR[][] {
      {
        a11.subtract(a21).multiply(d),
        a21.subtract(a01).multiply(d),
        a01.subtract(a11).multiply(d)
      },
      {
        a20.subtract(a10).multiply(d),
        a00.subtract(a20).multiply(d),
        a10.subtract(a00).multiply(d)
      },
      {
        a10.multiply(a21).subtract(a11.multiply(a20)).multiply(d),
        a01.multiply(a20).subtract(a00.multiply(a21)).multiply(d),
        a00.multiply(a11).subtract(a01.multiply(a10)).multiply(d)
      }
    };
  }

  private static CR dot(final CR[] row, final CR h0, final CR h1, final CR h2) {
    return row[0].multiply(h0).add(row[1].multiply(h1)).add(row[2].multiply(h2));
  }

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final int m = 5 * n;
    final int s = 2 * n;
    final int twoM = 2 * m;

    // Unit-circle vertices.
    final CR[] vx = new CR[m];
    final CR[] vy = new CR[m];
    for (int i = 0; i < m; ++i) {
      final CR a = angle(2 * i, m);
      vx[i] = a.cos();
      vy[i] = a.sin();
    }

    // Chord offsets, indexed by normal angle pi*t/m.
    final List<TreeSet<CR>> sets = new ArrayList<>(twoM);
    for (int t = 0; t < twoM; ++t) {
      sets.add(new TreeSet<>(CR_COMPARATOR));
    }

    for (int i = 0; i < m; ++i) {
      for (int j = i + 1; j < m; ++j) {
        final int t = i + j;
        final CR a = angle(t, m);
        final CR h = vx[i].multiply(a.cos()).add(vy[i].multiply(a.sin()));
        sets.get(t % twoM).add(h);
        sets.get((t + m) % twoM).add(h.negate());
      }
    }

    final CR[][] off = new CR[twoM][];
    for (int t = 0; t < twoM; ++t) {
      off[t] = sets.get(t).toArray(new CR[0]);
    }

    final CR[] ux = new CR[5];
    final CR[] uy = new CR[5];
    final CR[] outerUx = new CR[m];
    final CR[] outerUy = new CR[m];

    for (int j = 0; j < m; ++j) {
      final CR a = angle(2 * j + 1, m);
      outerUx[j] = a.cos();
      outerUy[j] = a.sin();
    }

    final CR outerLimit = angle(1, m).cos();
    final CR vertexTurnCos = angle(n, m).cos();
    final CR vertexTurnSin = angle(n, m).sin();

    long count = 0;

    // Rotation symmetry: t0 -> t0 + 2.
    for (int t0 = 0; t0 < 2; ++t0) {
      final int[] t = new int[5];
      for (int k = 0; k < 5; ++k) {
        t[k] = (t0 + k * s) % twoM;
        final CR a = angle(t[k], m);
        ux[k] = a.cos();
        uy[k] = a.sin();
      }

      final CR[][] inv = inverse(ux, uy);
      if (inv == null) {
        continue;
      }

      final CR[] o0 = off[t[0]];
      final CR[] o1 = off[t[1]];
      final CR[] o2 = off[t[2]];
      final CR[] o3 = off[t[3]];
      final CR[] o4 = off[t[4]];

      for (final CR h0 : o0) {
        for (final CR h1 : o1) {
          for (final CR h2 : o2) {
            final CR cx = dot(inv[0], h0, h1, h2);
            final CR cy = dot(inv[1], h0, h1, h2);
            final CR r = dot(inv[2], h0, h1, h2);
            if (r.compareTo(CR.ZERO, PRECISION) <= 0) {
              continue;
            }
            final CR h3 = ux[3].multiply(cx).add(uy[3].multiply(cy)).add(r);
            if (!contains(o3, h3)) {
              continue;
            }
            final CR h4 = ux[4].multiply(cx).add(uy[4].multiply(cy)).add(r);
            if (!contains(o4, h4)) {
              continue;
            }
            // Circumradius of the regular pentagon.
            final CR radius = r.divide(vertexTurnCos);
            // Test all five vertices against all outer polygon sides.
            boolean ok = true;
            for (int k = 0; k < 5 && ok; ++k) {
              final CR wx = cx.add(radius.multiply(ux[k].multiply(vertexTurnCos).subtract(uy[k].multiply(vertexTurnSin))));
              final CR wy = cy.add(radius.multiply(ux[k].multiply(vertexTurnSin).add(uy[k].multiply(vertexTurnCos))));

              for (int j = 0; j < m; ++j) {
                final CR projection = wx.multiply(outerUx[j]).add(wy.multiply(outerUy[j]));
                if (projection.compareTo(outerLimit, PRECISION) > 0) {
                  ok = false;
                  break;
                }
              }
            }
            if (ok) {
              ++count;
            }
          }
        }
      }
    }
    return Z.valueOf(count).multiply(n);
  }
}
