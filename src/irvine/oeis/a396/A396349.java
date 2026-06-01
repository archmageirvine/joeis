package irvine.oeis.a396;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A396349 Antidiagonal sums of A396348.
 * @author Sean A. Irvine
 */
public class A396349 extends A396348 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
