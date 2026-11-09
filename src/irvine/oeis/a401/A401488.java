package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401488 Number of Boolean functions of n variables up to duality, where f is identified with its dual f^d(x) = NOT f(NOT x).
 * @author Sean A. Irvine
 */
public class A401488 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.ONE.shiftLeft((1L << mN) - 1).add(Z.ONE.shiftLeft((1L << (mN - 1)) - 1));
  }
}

