package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a401.A401738;

/**
 * A399521 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A399521 extends Sequence0 {

  private int mN = -1;
  private final A401738.Periods mData = new A401738.Periods();

  @Override
  public Z next() {
    return Z.valueOf(mData.getPeriod(++mN));
  }
}
