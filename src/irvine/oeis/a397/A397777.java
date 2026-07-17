package irvine.oeis.a397;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A397777 Antidiagonal sums of the array A397775.
 * @author Sean A. Irvine
 */
public class A397777 extends A397775 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
