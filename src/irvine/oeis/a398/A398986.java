package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A398986 Antidiagonal sums of the binomial matrix of the factorial numbers.
 * @author Sean A. Irvine
 */
public class A398986 extends A398999 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
