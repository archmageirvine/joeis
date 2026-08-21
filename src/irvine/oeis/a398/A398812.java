package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a138.A138808;

/**
 * A398812 allocated for Soslan Daurov.
 * @author Sean A. Irvine
 */
public class A398812 extends A138808 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN * mN).subtract(t);
  }
}
