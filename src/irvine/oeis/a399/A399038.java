package irvine.oeis.a399;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399038 Product of the distinct entries on the two main diagonals of the (2*n + 1) X (2*n + 1) square spiral.
 * @author Sean
 */
public class A399038 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Z.valueOf(4 * k * k - 2 * k + 1).multiply(4 * k * k + 1).multiply(4 * k * k + 2 * k + 1).multiply(4 * k * k + 4 * k + 1));
  }
}

