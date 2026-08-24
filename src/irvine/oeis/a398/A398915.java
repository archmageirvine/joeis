package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a399.A399000;

/**
 * A398915 Antidiagonal sums of the binomial matrix of the Catalan numbers (A399000).
 * @author Sean A. Irvine
 */
public class A398915 extends A399000 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
