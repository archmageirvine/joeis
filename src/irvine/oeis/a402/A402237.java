package irvine.oeis.a402;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402237 Number of acyclic digraphs (or DAGs) on n labeled nodes in which every node has in-degree at most 2 and there is exactly one source and exactly one sink.
 * @author Gregory Morse
 */
public class A402237 extends Sequence1 {
  // After Tyler Satchel Orden.
  private final boolean mUniqueSink;
  private int mN = 0;

  protected A402237(final boolean uniqueSink) {
    mUniqueSink = uniqueSink;
  }

  /** Construct the sequence. */
  public A402237() {
    this(true);
  }

  private final MemoryFunctionInt2<Z> mSources = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int s) {
      return n == 0 ? s == 0 ? Z.ONE : Z.ZERO : count(n, s, false);
    }
  };

  private Z count(final int n, final int s, final boolean uniqueSink) {
    Z sum = Z.ZERO;
    for (int t = 1; t <= n; ++t) {
      final int m = n - t;
      final Z e = Z.valueOf(m).multiply(m + 1).divide2();
      Z marked = Z.ZERO;
      for (int j = Math.max(0, s - m); j <= Math.min(t, s); ++j) {
        marked = marked.add(Binomial.binomial(t, j).multiply(e.pow(t - j)).multiply(mSources.get(m, s - j)));
      }
      sum = sum.signedAdd((t & 1) != 0, Binomial.binomial(n, t).multiply(marked).multiply(uniqueSink ? t : 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    return mUniqueSink ? count(mN, 1, true) : mSources.get(mN, 1);
  }
}
