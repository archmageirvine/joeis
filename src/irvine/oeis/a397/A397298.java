package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a085.A085244;

/**
 * A397298 a(n) = 2-adic valuation of A085244(n).
 * @author Sean A. Irvine
 */
public class A397298 extends A085244 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
