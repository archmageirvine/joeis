package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000081;

/**
 * A399663 allocated for Peter Luschny.
 * @author Sean A. Irvine
 */
public class A399663 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final DirectSequence mS = DirectSequence.create(new A000081());
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (k == 1) {
        return Integers.SINGLETON.sum(1, n, j -> get(n - j, 1).multiply(mS.a(j)));
      }
      return Integers.SINGLETON.sum(0, n / k, j -> get(n - j * k, k - 1).multiply(get(j, 1)));
    }
  };

  // T(n, k) = Sum_{j=0..floor(n/k)} T(n-j*k, k-1) * T(j, 1), T(n, 1) = Sum_{j=1..n} T(n-j, 1) * A000081(j), T(n, 0) = 0^n.

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
