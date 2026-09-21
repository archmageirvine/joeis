package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A399552 a(n) = (Sum_{d|k} gpf(d)) / gpf(k), where k = A399551(n) and gpf = A006530.
 * @author Sean A. Irvine
 */
public class A399552 extends A399551 {

  @Override
  public Z next() {
    final Z k = super.next();
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(k).divisors()) {
      sum = sum.add(Functions.GPF.z(d));
    }
    return sum.divide(Functions.GPF.z(k));
  }
}
