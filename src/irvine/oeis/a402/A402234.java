package irvine.oeis.a402;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a397.A397711;
import irvine.oeis.triangle.Triangle;

/**
 * A402234 Triangle read by rows: T(n,k) is the number of acyclic digraphs (or DAGs) on n labeled nodes whose longest directed path has k arcs, n &gt;= 1, 0 &lt;= k &lt;= n-1.
 * @author Gregory Morse
 */
public class A402234 extends Triangle {
  // After Tyler Satchel Orden.
  private final int mBound;

  protected A402234(final int bound) {
    mBound = bound;
    setOffset(1);
  }

  /** Construct the sequence. */
  public A402234() {
    this(-1);
  }

  private final MemoryFunctionInt3<Z> mCounts = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int h) {
      if (h == 0) {
        return n == m ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int p = 1; p <= n - m - h + 1; ++p) {
        final int q = n - m - p;
        final Z parents = mBound < 0 ? Z.ONE.shiftLeft(p).subtract(1).shiftLeft(q) : A397711.parents(p, q, mBound);
        sum = sum.add(get(n - m, p, h - 1).multiply(parents.pow(m)));
      }
      return Binomial.binomial(n, m).multiply(sum);
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int m = 1; m <= n + 1 - k; ++m) {
      sum = sum.add(mCounts.get(n + 1, m, k));
    }
    return sum;
  }
}
