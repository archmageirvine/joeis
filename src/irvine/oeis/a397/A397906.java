package irvine.oeis.a397;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a086.A152795;

/**
 * A397906 allocated for Paul D. Hanna.
 * @author Sean A. Irvine
 */
public class A397906 extends A152795 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
