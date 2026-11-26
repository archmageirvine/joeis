package irvine.oeis.a402;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402176 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A402176 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  /*
   * Generate all candidates up to limit.
   * Exponents of successive primes must be nonincreasing.
   */
  private static void generate(final Z limit, final int depth, final int maxExponent, final Z m, final int dmod4, final boolean fourth, final int[] exponents, final TreeMap<Z, int[]> candidates) {

    if (dmod4 == 2 || fourth) {
      candidates.put(m, Arrays.copyOf(exponents, depth));
    }
    final Z p = Functions.PRIME.z(depth + 1);
    Z x = m;
    for (int j = 1; j <= maxExponent; ++j) {
      x = x.multiply(p);
      if (x.compareTo(limit) > 0) {
        break;
      }
      exponents[depth] = j;
      generate(limit, depth + 1, j, x, (dmod4 * (j + 1)) & 3, fourth && (j % 4 == 0), exponents, candidates);
    }
  }

  /**
   * Enumerate divisors and perform the corresponding knapsack update.
   */
  private static void divisors(final int[] e, final Z[] w, final int depth, final Z q, final Z[] b, final int z) {
    if (depth == e.length) {
      if (q.signum() > 0) {
        final int qi = q.intValue();
        for (int j = z; j >= qi; --j) {
          b[j] = b[j].add(b[j - qi]);
        }
      }
      return;
    }
    Z q2 = q;
    for (int k = 0; k <= e[depth]; ++k) {
      divisors(e, w, depth + 1, q2, b, z);
      q2 = q2.add(w[depth]);
    }
  }

  @Override
  public Z next() {
    final Z target = Z.valueOf(++mN);
    Z limit = Z.ONE;
    TreeMap<Z, int[]> candidates;
    // Increase the search limit until there are enough candidates.
    while (true) {
      candidates = new TreeMap<>();
      final int maxExponent = limit.bitLength();
      generate(limit, 0, maxExponent, Z.ONE, 1, true, new int[maxExponent + 1], candidates);
      if (candidates.size() >= target.intValue()) {
        break;
      }
      limit = limit.multiply2();
    }

    // Select the required candidate.
    int index = 0;
    int[] e = null;
    for (Map.Entry<Z, int[]> entry : candidates.entrySet()) {
      if (++index == target.intValue()) {
        e = entry.getValue();
        break;
      }
    }

    final int r = e.length;
    // Number of divisors of m.
    Z c = Z.ONE;
    for (final int v : e) {
      c = c.multiply(v + 1);
    }
    // Calculate s[i] and w[i].
    final Z[] w = new Z[r];
    Z z = Z.ZERO;
    Z product = Z.ONE;
    for (int i = 0; i < r; ++i) {
      final Z s = Z.valueOf(e[i]).multiply(c.subtract(2)).divide(4);
      w[i] = product;
      z = z.add(s.multiply(w[i]));
      final Z factor = Z.valueOf(e[i]).multiply(c).divide(2).add(1);
      product = product.multiply(factor);
    }
    final int zi = z.intValue();
    // Subset-sum dynamic programming.
    final Z[] b = new Z[zi + 1];
    Arrays.fill(b, Z.ZERO);
    b[0] = Z.ONE;
    divisors(e, w, 0, Z.ZERO, b, zi);
    return b[zi];
  }
}
