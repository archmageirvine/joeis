package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a004.A004185;

/**
 * A398334 a(n) = (n - A004185(n)) / 9.
 * @author Sean A. Irvine
 */
public class A398334 extends A004185 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN).subtract(t).divide(9);
  }
}

