package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398489 Irregular triangle read by rows: T(n, k) is the number of multisets of k positive integers that occur as the side lengths of a simple polygon inscribed in a circle of radius n, where 3 &lt;= k &lt;= A398490(n).
 * @author Sean A. Irvine
 */
public class A398489 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;
  private int mK = 0;
  private List<Z> mTerms = null;


  /**
   * Compute the coefficient list corresponding to Maple r(n).
   *
   * @param n argument
   * @return coefficients of p(n), from z^3 through its degree
   */
  private List<Z> compute(final int n) {
    final Z twoN = Z.valueOf(2L * n);
    final long[] a = A398490.q(4 * n);

    // Maple: c := table(), indexed by d.
    final Map<Long, List<long[]>> classes = new HashMap<>();
    for (int j = 1; j <= 2 * n - 1; ++j) {
      final long gcd = Functions.GCD.l(a[2 * n - j], a[2 * n + j]);
      final long d = a[2 * n - j] * a[2 * n + j] / (gcd * gcd);
      final long u = Functions.SQRT.l((4L * n * n - (long) j * j) / d);
      classes.computeIfAbsent(d, k -> new ArrayList<>())
        .add(new long[] {j, u});
    }

    // Maple: o := table(), r := table().
    final Map<Integer, Z> o = new HashMap<>();
    final Map<Integer, Z> r = new HashMap<>();

    for (final Map.Entry<Long, List<long[]>> entry : classes.entrySet()) {
      final long d = entry.getKey();
      final List<long[]> w = entry.getValue();

      final List<Z[]> v = new ArrayList<>();
      for (final long[] wu : w) {
        v.add(A398490.b(wu[0], wu[1], d));
      }

      final Map<Integer, Z> x = new HashMap<>();
      final Map<Integer, Z> y = new HashMap<>();

      A398490.f(v, d, 0, new Z[] {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO}, 0, x, y, twoN);

      for (final Map.Entry<Integer, Z> e : x.entrySet()) {
        A398490.add(r, e.getKey(), e.getValue());
      }

      for (final Map.Entry<Integer, Z> e : y.entrySet()) {
        A398490.add(r, e.getKey() + 1, e.getValue());
      }

      for (final Map.Entry<Integer, Z> oi : o.entrySet()) {
        for (final Map.Entry<Integer, Z> yk : y.entrySet()) {
          A398490.add(r, oi.getKey() + yk.getKey(), oi.getValue().multiply(yk.getValue()));
        }
      }

      for (final Map.Entry<Integer, Z> yk : y.entrySet()) {
        A398490.add(o, yk.getKey(), yk.getValue());
      }

      for (int j = 1; j < v.size(); ++j) {
        A398490.g(v.subList(0, j), d, 0, new Z[] {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO}, 0, v.get(j), r, twoN);
      }
    }

    int degree = 0;
    for (final Map.Entry<Integer, Z> e : r.entrySet()) {
      if (!e.getValue().isZero() && e.getKey() > degree) {
        degree = e.getKey();
      }
    }

    final List<Z> res = new ArrayList<>();
    for (int k = 3; k <= degree; ++k) {
      res.add(r.getOrDefault(k, Z.ZERO));
    }
    return res;
  }

  @Override
  public Z next() {
    if (mTerms == null || mK >= mTerms.size()) {
      mTerms = compute(++mN);
      mK = 0;
    }
    return mTerms.get(mK++);
  }
}
