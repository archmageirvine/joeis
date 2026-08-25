package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a070.A070826;

/**
 * A399052 allocated for Hossein Sadeghpour.
 * @author Sean A. Irvine
 */
public class A399052 extends A070826 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isOne() ? Z.TWO : Functions.NEXT_PRIME.z(t).subtract(t);
  }
}
