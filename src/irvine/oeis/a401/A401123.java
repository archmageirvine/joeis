package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401123 Numbers k such that the number formed by 1 followed by k copies of 81, (20*100^k - 9)/11, is prime.
 * @author Sean A. Irvine
 */
public class A401123 extends Sequence1 {

  private Z mA = Z.valueOf(20);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(100);
      if (mA.subtract(9).divide(11).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
