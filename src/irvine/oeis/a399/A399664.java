package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002861;

/**
 * A399664 Triangle read by rows: T(n, k) is the number of mapping patterns of order n with largest component size &lt;= k.
 * @author Sean A. Irvine
 */
public class A399664 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final DirectSequence mS = DirectSequence.create(new A002861());
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (k == 0) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n, q -> get(n - q, k).multiply(Integers.SINGLETON.sumdiv(q, d -> d <= k ? mS.a(d).multiply(d) : Z.ZERO))).divide(n);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
