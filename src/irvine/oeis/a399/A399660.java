package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002861;

/**
 * A399660 Triangle read by rows: T(n, k) is the number of endofunction patterns on n nodes having k connected components; T(0, 0) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A399660 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final DirectSequence mS = DirectSequence.create(new A002861());
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      if (k > n) {
        return Z.ZERO;
      }
      if (k == 1) {
        return mS.a(n);
      }
      if (2 * k > n) {
        return get(n - 1, k - 1);
      }
      return Integers.SINGLETON.sum(1, n, q -> Integers.SINGLETON.sumdiv(q, p -> p <= k ? mS.a(q / p).multiply(get(n - q, k - p)) : Z.ZERO)).divide(k);
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
