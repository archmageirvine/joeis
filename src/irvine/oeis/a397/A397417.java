package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397417 Number of compositions of n in which each pair of adjacent parts is comparable under divisibility (each part divides, or is divided by, the next).
 * @author Sean A. Irvine
 */
public class A397417 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, j -> i == 0 || j % i == 0 || i % j == 0 ? get(n - j, j) : Z.ZERO);
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
