package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399615 allocated for Ellen Veomett.
 * @author Sean A. Irvine
 */
public class A399615 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 2 ? Z.ONE : Z.ONE.shiftLeft((1L << mN) - 2 * mN - 1).add(Z.ONE.shiftLeft((1L << (mN - 1)) - mN - 1));
  }
}
