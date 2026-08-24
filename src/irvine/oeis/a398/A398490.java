package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398490 a(n) is the maximum number of sides of a simple polygon with positive integer side lengths inscribed in a circle of radius n.
 * @author Sean A. Irvine
 */
public class A398490 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;

  /**
   * Squarefree kernel (radical) for 1..m.
   * @param m maximum index
   * @return radical array, with entry 0 unused
   */
  static long[] q(final int m) {
    final int[] p = new int[m + 1];
    final long[] a = new long[m + 1];
    a[1] = 1;
    for (int i = 2; i <= m; ++i) {
      if (p[i] == 0) {
        for (int j = i; j <= m; j += i) {
          if (p[j] == 0) {
            p[j] = i;
          }
        }
      }
      final int t = i / p[i];
      if (a[t] % p[i] == 0) {
        a[i] = a[t] / p[i];
      } else {
        a[i] = a[t] * p[i];
      }
    }
    return a;
  }

  // Sign of a + b sqrt(d), where the representation used here is determined by the Maple routine s()
  static int s(final Z a, final Z b, final long d) {
    if (d == 1) {
      return a.add(b).signum();
    }
    if (b.isZero()) {
      return a.signum();
    }
    if (a.isZero()) {
      return b.signum();
    }
    if (a.signum() > 0 && b.signum() > 0) {
      return 1;
    }
    if (a.signum() < 0 && b.signum() < 0) {
      return -1;
    }
    final Z aa = a.square();
    final Z dbb = b.square().multiply(d);
    if (a.signum() > 0) {
      return aa.compareTo(dbb) > 0 ? 1 : -1;
    } else {
      return dbb.compareTo(aa) > 0 ? 1 : -1;
    }
  }


  // Canonicalize an element when d = 1.
  static Z[] c(final Z[] x, final long d) {
    if (d == 1) {
      return new Z[] {
        x[0].add(x[1]),
        Z.ZERO,
        x[2].add(x[3]),
        Z.ZERO
      };
    }
    return x;
  }

  static Z[] mul(final Z[] x, final Z[] y, final long d) {
    return c(new Z[] {
      x[0].multiply(y[0])
        .add(x[1].multiply(y[1]).multiply(d))
        .subtract(x[2].multiply(y[2]))
        .subtract(x[3].multiply(y[3]).multiply(d)),
      x[0].multiply(y[1])
        .add(x[1].multiply(y[0]))
        .subtract(x[2].multiply(y[3]))
        .subtract(x[3].multiply(y[2])),
      x[0].multiply(y[2])
        .add(x[1].multiply(y[3]).multiply(d))
        .add(x[2].multiply(y[0]))
        .add(x[3].multiply(y[1]).multiply(d)),
      x[0].multiply(y[3])
        .add(x[1].multiply(y[2]))
        .add(x[2].multiply(y[1]))
        .add(x[3].multiply(y[0]))
    }, d);
  }

  static Z[] h(final Z[] x) {
    return new Z[] {x[0], x[1], x[2].negate(), x[3].negate()};
  }

  static Z[] scale(final Z[] x, final Z a) {
    return new Z[] {
      x[0].multiply(a),
      x[1].multiply(a),
      x[2].multiply(a),
      x[3].multiply(a)
    };
  }

  static Z[] b(final long j, final long u, final long d) {
    if (d == 1) {
      return new Z[] {Z.valueOf(u), Z.ZERO, Z.valueOf(j), Z.ZERO};
    }
    return new Z[] {Z.ZERO, Z.valueOf(u), Z.valueOf(j), Z.ZERO};
  }

  /**
   * Add v to t[k].
   */
  static void add(final Map<Integer, Z> t, final int k, final Z v) {
    t.merge(k, v, Z::add);
  }

  static boolean equal(final Z[] a, final Z[] b) {
    return a[0].equals(b[0]) && a[1].equals(b[1]) && a[2].equals(b[2])  && a[3].equals(b[3]);
  }

  static void f(final List<Z[]> v, final long d, final int j, final Z[] a, final int k, final Map<Integer, Z> x, final Map<Integer, Z> y, final Z twoN) {
    if (a[0].equals(twoN.pow(k).negate()) && a[1].isZero() && a[2].isZero() && a[3].isZero()) {
      if (k >= 3) {
        add(x, k, Z.ONE);
      }
      return;
    }
    if (s(a[2], a[3], d) < 0) {
      return;
    }
    if (j >= v.size()) {
      if (a[0].isZero() && a[1].isZero() && a[2].equals(twoN.pow(k)) && a[3].isZero() && k >= 2) {
        add(y, k, Z.ONE);
      }
      return;
    }

    Z[] r = a;
    for (int u = 0; ; ++u) {
      f(v, d, j + 1, r, k + u, x, y, twoN);
      r = mul(r, v.get(j), d);
      if (s(r[2], r[3], d) < 0) {
        break;
      }
    }
  }

  static void g(final List<Z[]> v, final long d, final int j, final Z[] a, final int k, final Z[] w, final Map<Integer, Z> t, final Z twoN) {
    if (k >= 2 && equal(a, scale(w, twoN.pow(k - 1)))) {
      add(t, k + 1, Z.ONE);
      return;
    }
    Z[] p = mul(a, h(w), d);
    if (s(p[2], p[3], d) > 0) {
      return;
    }
    if (j >= v.size()) {
      return;
    }
    Z[] r = a;
    for (int u = 0; ; ++u) {
      g(v, d, j + 1, r, k + u, w, t, twoN);
      r = mul(r, v.get(j), d);
      p = mul(r, h(w), d);
      if (s(p[2], p[3], d) > 0) {
        break;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int n = mN;
    final int twoNInt = 2 * n;
    final Z twoN = Z.valueOf(twoNInt);

    final long[] a = q(4 * n);

    // Maple: c := table(), indexed by d.
    final Map<Long, List<long[]>> classes = new HashMap<>();
    for (int j = 1; j <= 2 * n - 1; ++j) {
      final long g = Functions.GCD.l(a[2 * n - j], a[2 * n + j]);
      final long d = a[2 * n - j] * a[2 * n + j] / (g * g);
      final long u = Functions.SQRT.l((4L * n * n - (long) j * j) / d);
      classes.computeIfAbsent(d, k -> new ArrayList<>()).add(new long[] {j, u});
    }

    // Maple: o := table(), r := table().
    final Map<Integer, Z> o = new HashMap<>();
    final Map<Integer, Z> r = new HashMap<>();
    for (final Map.Entry<Long, List<long[]>> entry : classes.entrySet()) {
      final long d = entry.getKey();
      final List<long[]> w = entry.getValue();

      final List<Z[]> v = new ArrayList<>();
      for (final long[] wu : w) {
        v.add(b(wu[0], wu[1], d));
      }

      final Map<Integer, Z> x = new HashMap<>();
      final Map<Integer, Z> y = new HashMap<>();
      f(v, d, 0, new Z[] {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO}, 0, x, y, twoN);
      for (final Map.Entry<Integer, Z> e : x.entrySet()) {
        add(r, e.getKey(), e.getValue());
      }
      for (final Map.Entry<Integer, Z> e : y.entrySet()) {
        add(r, e.getKey() + 1, e.getValue());
      }
      for (final Map.Entry<Integer, Z> oi : o.entrySet()) {
        for (final Map.Entry<Integer, Z> yk : y.entrySet()) {
          add(r, oi.getKey() + yk.getKey(), oi.getValue().multiply(yk.getValue()));
        }
      }
      for (final Map.Entry<Integer, Z> yk : y.entrySet()) {
        add(o, yk.getKey(), yk.getValue());
      }
      for (int j = 1; j < v.size(); ++j) {
        g(v.subList(0, j), d, 0, new Z[] {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO}, 0, v.get(j), r, twoN);
      }
    }

    int degree = 0;
    for (final Map.Entry<Integer, Z> e : r.entrySet()) {
      if (!e.getValue().isZero() && e.getKey() > degree) {
        degree = e.getKey();
      }
    }
    return Z.valueOf(degree);
  }

}
