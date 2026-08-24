package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399172 a(n) = 2^((2^n-(-1)^n)/3).
 * @author Sean A. Irvine
 */
public class A399172 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(((1L << ++mN) + 1) / 3);
  }
}
