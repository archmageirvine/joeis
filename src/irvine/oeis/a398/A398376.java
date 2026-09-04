package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398376 Number of congruence classes of nonsingular n X n matrices over GF(2).
 * @author Sean A. Irvine
 */
public class A398376 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      if (m < 0) {
        return Z.ZERO;
      }
      return get(n - 1, m).add(get(n - 1, m - n)).add(get(n, m - 2 * n).multiply2());
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}

