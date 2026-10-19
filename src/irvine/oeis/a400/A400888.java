package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400888 Contents of the quarter-turn corrected Stern vectors associated with the column words of the Gosper-Lafitte triangle.
 * @author Sean A. Irvine
 */
public class A400888 extends Sequence0 {

  // After M. Jeremie Lafitte (Levitas)

  private int mN = -1;

  private List<Long> f(final List<Long> v, final int c, final long h) {
    final List<Long> res = new ArrayList<>(v.size());
    for (final long x : v) {
      final long rem = x % 2;
      res.add(2 * (x + h) + c - (2L * c + 1) * rem);
    }
    return res;
  }

  private List<Long> w(final int n) {
    if (n < 1) {
      if (n == 0) {
        final List<Long> lst = new ArrayList<>();
        lst.add(1L);
        return lst;
      }
      return new ArrayList<>();
    }
    final int m = n / 2;
    if (n % 2 != 0) {
      return f(w(m), m % 3 != 2 ? 1 : 0, 1);
    } else {
      final List<Long> part1 = f(w(m), m % 3 != 0 ? 1 : 0, 0);
      final List<Long> part2 = f(w(m - 1), m % 3 != 2 ? 1 : 0, 0);
      final List<Long> combined = new ArrayList<>(part1);
      combined.addAll(part2);
      return combined;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final List<Long> v = w(mN);
    v.sort(Collections.reverseOrder());
    final List<Long> uniqueV = new ArrayList<>();
    for (int i = 0; i < v.size(); i++) {
      if (i == 0 || !v.get(i).equals(v.get(i - 1))) {
        uniqueV.add(v.get(i));
      }
    }

    long ones = 0;
    for (final long x : uniqueV) {
      if (x % 2 != 0) {
        ++ones;
      }
    }
    final long zeros = uniqueV.size() - ones;

    Z p = Z.ONE;
    Z q = Z.ONE;
    for (final long x : uniqueV) {
      if (x % 2 != 0) {
        p = p.add(q);
      } else {
        q = q.add(p);
      }
    }

    final Z term1 = p.subtract(zeros);
    final Z term2 = q.add(ones);
    return term1.gcd(term2);
  }
}
