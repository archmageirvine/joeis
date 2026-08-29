package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a070.A070826;

/**
 * A399052 a(n) is the least even number c such that (prime(n)#/2) + c is prime.
 * @author Sean A. Irvine
 */
public class A399052 extends A070826 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isOne() ? Z.TWO : Functions.NEXT_PRIME.z(t).subtract(t);
  }
}
