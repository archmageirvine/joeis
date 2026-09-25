package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398974 Number of 0's in the binary expansion of n^3.
 * @author Sean A. Irvine
 */
public class A398974 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z c = Z.valueOf(mN).pow(3);
    return Z.valueOf(c.bitLength() - c.bitCount());
  }
}
