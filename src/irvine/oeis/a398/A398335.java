package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A398335 Number of strongly connected digraphs on n labeled nodes that are acyclic after deleting node 1.
 * @author Gregory Morse
 */
public class A398335 extends AbstractSequence {

  /** Construct the sequence. */
  public A398335() {
    this(1);
  }

  /**
   * Construct with a specified offset.
   * @param offset first index
   */
  protected A398335(final int offset) {
    super(offset);
  }

  private int mN = 0;

  private final MemoryFunctionInt3<Z> mEdges = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int p, final int m, final int r) {
      Z sum = Z.ZERO;
      for (int k = 0; k <= m; ++k) {
        final Z term = Binomial.binomial(m, k).multiply(Z.ONE.shiftLeft(k + r).subtract(1).pow(p));
        sum = ((m - k) & 1) == 0 ? sum.add(term) : sum.subtract(term);
      }
      return sum;
    }
  };

  // DAGs with k sources and l sinks, split by the number of isolated sources.
  private final MemoryFunctionInt3<Z> mDags = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int l) {
      if (k == n) {
        return l == n ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int r = n - k;
      for (int i = Math.max(0, l - r); i <= Math.min(k - 1, l - 1); ++i) {
        for (int j = 1; j <= r; ++j) {
          sum = sum.add(Binomial.binomial(k, i).multiply(get(r, j, l - i)).multiply(mEdges.get(k - i, j, r - j)));
        }
      }
      return Binomial.binomial(n, k).multiply(sum);
    }
  };

  protected Z dagCount(final int n, final int sources, final int sinks) {
    return mDags.get(n, sources, sinks);
  }

  protected Z shoot(final int n, final int required, final int free) {
    return mEdges.get(n, required, free);
  }

  protected Z flatStrong(final int n) {
    if (n == 1) {
      return Z.ONE;
    }
    final int d = n - 1;
    Z sum = Z.ZERO;
    for (int k = 1; k <= d; ++k) {
      for (int l = 1; l <= d; ++l) {
        sum = sum.add(mDags.get(d, k, l).shiftLeft(2L * d - k - l));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return flatStrong(++mN);
  }
}
