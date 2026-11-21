package irvine.oeis.a402;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402238 Number of essential acyclic digraphs (or DAGs) on n labeled nodes in which every node has in-degree at most 2.
 * @author Gregory Morse
 */
public class A402238 extends Sequence0 {
  // After Tyler Satchel Orden.
  private int mN = -1;
  private final MemoryFunctionInt3<Z> mEssential = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int j) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int t = 1; t <= n; ++t) {
        final int m = n - t;
        Z marked = Z.ZERO;
        for (int s = Math.max(0, i - m); s <= Math.min(i, t); ++s) {
          for (int r = Math.max(0, i + j - s - m); r <= Math.min(j, t - s); ++r) {
            final Z a = Z.valueOf(m - i + s).pow(r);
            final Z b = Binomial.binomial(m, 2).subtract(j - r).pow(t - s - r);
            final Z ways = Binomial.binomial(t, s).multiply(Binomial.binomial(t - s, r)).multiply(a).multiply(b);
            marked = marked.add(ways.multiply(get(m, i - s, j - r)));
          }
        }
        sum = sum.signedAdd((t & 1) != 0, Binomial.binomial(n, t).multiply(marked));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN - i; ++j) {
        sum = sum.add(mEssential.get(mN, i, j));
      }
    }
    return sum;
  }
}
