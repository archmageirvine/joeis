package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399810 Numbers k such that 42*10^(k+2) + 43 is prime.
 * @author Sean A. Irvine
 */
public class A399810 extends Sequence1 {

  private Z mA = Z.valueOf(420);
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(10);
      final Z t = mA.add(43);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
