package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000720;

/**
 * A401847 allocated for Mykola Filipchuk.
 * @author Sean A. Irvine
 */
public class A401847 extends Sequence0 {

  private final Sequence mPi = new A000720().skip();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final long pi = mPi.next().longValueExact();
    return Functions.FACTORIAL.z(pi).multiply(Functions.FACTORIAL.z(mN - pi + 1));
  }
}

