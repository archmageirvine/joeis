package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396710 Number of unordered factorizations of n into exactly k squarefree factors, where k is the maximum exponent in the prime factorization of n.
 * @author Sean A. Irvine
 */
public class A396710 extends Sequence1 {

  private long mN = 0;

  private long p(final int[] m, final int k) {
    for (final int v : m) {
      if (v < 0) {
        return 0;
      }
    }
    if (k == 0) {
      return Functions.MAX.i(m) == 0 ? 1 : 0;
    }

    long sum = 0;

    for (int j = 1; j <= k; ++j) {
      final int[] mj = new int[m.length];
      for (int mask = 1; mask < (1 << m.length); ++mask) {
        for (int i = 0; i < m.length; ++i) {
          mj[i] = m[i] - j * ((mask >>> i) & 1);
        }
        sum += p(mj, k - j);
      }
    }
    return sum / k;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final int[] e = new int[fs.omega()];
    int k = 0;
    for (Z p : fs.toZArray()) {
      e[k++] = fs.getExponent(p);
    }
    return Z.valueOf(p(e, fs.maxExponent()));
  }
}
