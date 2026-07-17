package irvine.oeis.a397;

import irvine.math.z.Z;

/**
 * A397776 Main diagonal of the array A397775.
 * @author Sean A. Irvine
 */
public class A397776 extends A397775 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
