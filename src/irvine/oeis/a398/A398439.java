package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A398439 Antidiagonal sums of the array A398438.
 * @author Sean A. Irvine
 */
public class A398439 extends A398438 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
