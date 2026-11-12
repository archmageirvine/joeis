package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398775 allocated for Lei Zhou.
 * @author Sean A. Irvine
 */
public class A398775 extends Sequence1 {

  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mP.multiply2().square();
    long k = 0;
    while (true) {
      final Z t = mP.multiply(++k * k).add(1);
      if (t.isProbablePrime()) {
        mP = t;
        return Z.valueOf(k);
      }
    }
  }
}
