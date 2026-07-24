package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A398063 Antidiagonal sums of the array A398062.
 * @author Sean A. Irvine
 */
public class A398063 extends A398062 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
