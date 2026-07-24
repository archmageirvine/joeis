package irvine.oeis.a397;

import irvine.math.z.Z;

/**
 * A397883 a(n) = r(2,n,2) where r(m,n,k) is the number of possible outcomes in a race with n participants that contains exactly k ties of size at least m.
 * @author Sean A. Irvine
 */
public class A397883 extends A397265 {

  private int mN = 0;

  @Override
  public Z next() {
    return mR.get(2, ++mN, 2);
  }
}
