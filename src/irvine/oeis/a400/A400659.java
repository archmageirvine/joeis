package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A400659 allocated for Yagel Bar.
 * @author Sean A. Irvine
 */
public class A400659 extends A000040 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    mProd = mProd.multiply(mP);
    super.next(); // updates mP
    long k = 0;
    Z t = mProd;
    while (true) {
      ++k;
      t = t.multiply(mP);
      if (t.subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
