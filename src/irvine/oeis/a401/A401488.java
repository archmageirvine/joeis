package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401488 allocated for Francisco J. Mu\u00f1oz.
 * @author Sean A. Irvine
 */
public class A401488 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.ONE.shiftLeft((1L << mN) - 1).add(Z.ONE.shiftLeft((1L << (mN - 1)) - 1));
  }
}

