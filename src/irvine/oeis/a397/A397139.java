package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397139 allocated for Steven E Landsburg.
 * @author Sean A. Irvine
 */
public class A397139 extends Sequence1 {

  private int mN = 0;

  private final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<>() {
    @Override
    public Z compute(int i, int j) {
      if (i < 0 || j < 0) {
        return Z.ZERO;
      }
      if ((i == 0 && j == 0) || (i == 0 && j == 1) || (i == 1 && j == 0)) {
        return Z.ONE;
      }
      if (i == 0 || j == 0) {
        return Z.ZERO;
      }
      if ((i == 1 && j == 1) || (i == 1 && j == 2) || (i == 2 && j == 1)) {
        return Z.THREE;
      }
      return mT.get(i - 1, j - 1).multiply(2)
        .add(mT.get(i - 2, j - 1))
        .add(mT.get(i - 1, j - 2))
        .add(mT.get(i - 2, j - 2));
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      for (int j = 1; j <= mN; ++j) {
        sum = sum.add(Functions.FACTORIAL.z(k)
          .multiply(Functions.FACTORIAL.z(j))
          .multiply(Functions.STIRLING2.z(mN, k))
          .multiply(Functions.STIRLING2.z(mN, j))
          .multiply(mT.get(k, j)));
      }
    }
    return sum;
  }
}

