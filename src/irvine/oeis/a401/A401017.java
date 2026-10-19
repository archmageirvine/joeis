package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401017 allocated for Andrei Leonov.
 * @author Sean A. Irvine
 */
public class A401017 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = Functions.SQRT.l(++mN);
    final long w = Functions.MAKE_ODD.l(2 * m + 1 - (mN - m * m) % (m + 1));
    return Z.valueOf((w - 1) / 2);
  }
}
