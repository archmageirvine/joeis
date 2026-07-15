package irvine.oeis.a397;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397838 Antidiagonal products of the multifactorial array.
 * @author Sean A. Irvine
 */
public class A397838 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Integers.SINGLETON.product(1, mN / k, j -> Z.valueOf(mN + 1 - k * j)));
  }
}
