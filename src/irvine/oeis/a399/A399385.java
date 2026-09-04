package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399385 Number of 2n+1 X 2n+1 off-diagonally symmetric alternating sign matrices.
 * @author Sean A. Irvine
 */
public class A399385 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(3 * mN + 2)
      .divide(Functions.FACTORIAL.z(2 * mN + 1))
      .multiply(Integers.SINGLETON.product(1, mN, k -> Functions.FACTORIAL.z(6 * k - 2)))
      .divide(Integers.SINGLETON.product(1, mN, k -> Functions.FACTORIAL.z(2 * mN + 2 * k + 1)))
      .shiftLeft(mN - 1);
  }
}

