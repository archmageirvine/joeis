package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a074.A074854;

/**
 * A397424 a(n) = A074854(n) mod n.
 * @author Sean A. Irvine
 */
public class A397424 extends A074854 {

  @Override
  public Z next() {
    return super.next().modZ(mN);
  }
}
