package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398775 a(n) is the smallest positive integer that makes p(n) = (2 * a(n) * p(n-1))^2 + 1 a prime with p(0) = 1.
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
