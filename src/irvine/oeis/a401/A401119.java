package irvine.oeis.a401;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A401119 Number of orbits of exponents d, 1 &lt;= d &lt;= 2^n-2, under multiplication by 2 modulo 2^n-1, such that gcd(d, 2^n-1) = 1 and the power map x -&gt; x^d on GF(2^n) has differential uniformity 4.
 * @author Sean A. Irvine
 */
public class A401119 extends Sequence3 {

  // After Sajid Khan Hussain

  private int mN = 2;

  /**
   * Multiply by x in GF(2^n), using the supplied primitive polynomial.
   * @param a field element
   * @param low low n bits of the primitive polynomial
   * @param top highest bit of a field element
   * @return product
   */
  private static int multiplyX(final int a, final int low, final int top) {
    return ((a << 1) & (2 * top - 1)) ^ ((a & top) != 0 ? low : 0);
  }

  private static long primitivePolynomial(final int n, final int m) {
    final long leading = 1L << n;
    for (long p = leading | 1; p < (leading << 1); p += 2) {
      final int low = (int) (p ^ leading);
      final boolean[] seen = new boolean[1 << n];
      int v = 1;
      boolean primitive = true;
      for (int i = 0; i < m; ++i) {
        if (v == 0 || seen[v]) {
          primitive = false;
          break;
        }
        seen[v] = true;
        v = multiplyX(v, low, 1 << (n - 1));
      }
      if (primitive && v == 1) {
        return p;
      }
    }
    throw new IllegalStateException("No primitive polynomial found");
  }

  private static Z compute(final int n) {
    if (n >= 30) {
      throw new IllegalArgumentException("n is too large for int-indexed field tables");
    }
    final int size = 1 << n;
    final int m = size - 1;
    if (m == 1) {
      return Z.ZERO;
    }
    final int low = (int) (primitivePolynomial(n, m) ^ (1L << n));
    final int top = 1 << (n - 1);
    // powers[e] = g^e, logs[x] = discrete logarithm of x
    final int[] powers = new int[m];
    final int[] logs = new int[size];
    Arrays.fill(logs, -1);
    int v = 1;
    for (int e = 0; e < m; ++e) {
      powers[e] = v;
      logs[v] = e;
      v = multiplyX(v, low, top);
    }

    // Count the eligible exponents d
    int answer = 0;
    final int[] counts = new int[m + 1];
    for (int d = 1; d < m; ++d) {
      if (Functions.GCD.l(d, m) != 1) {
        continue;
      }
      int e = d;
      boolean ok = true;
      for (int i = 1; i < n; ++i) {
        e = (int) (2L * e % m);
        if (e < d) {
          ok = false;
          break;
        }
      }
      if (!ok) {
        continue;
      }

      Arrays.fill(counts, 0);
      int max = 0;

      for (int x = 0; x < size; ++x) {
        final int lx = logs[x];
        final int ly = logs[x ^ 1];
        final int xd = lx < 0 ? 0 : powers[(int) ((long) lx * d % m)];
        final int yd = ly < 0 ? 0 : powers[(int) ((long) ly * d % m)];

        // Addition in characteristic two is XOR
        final int f = xd ^ yd;
        // Index zero represents the zero field element
        final int index = f == 0 ? 0 : logs[f] + 1;
        final int count = ++counts[index];
        if (count > max) {
          max = count;
          if (max > 4) {
            break;
          }
        }
      }

      if (max == 4) {
        ++answer;
      }
    }
    return Z.valueOf(answer);
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
