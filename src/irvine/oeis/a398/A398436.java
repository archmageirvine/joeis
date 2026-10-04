package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A398436 a(n) is the smallest composite number c greater than all previous terms such that the product of the previous terms plus c is prime.
 * @author Sean A. Irvine
 */
public class A398436 extends Sequence1 {

  private final Sequence mC = new A002808();
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z c = mC.next();
      if (mProd.add(c).isProbablePrime()) {
        mProd = mProd.multiply(c);
        return c;
      }
    }
  }
}
