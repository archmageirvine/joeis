package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a085.A085244;

/**
 * A397049.
 * @author Sean A. Irvine
 */
public class A397298 extends A085244 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
