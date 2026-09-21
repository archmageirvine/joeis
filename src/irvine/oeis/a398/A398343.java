package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A398343 a(n) = (Sum_{d|k} rad(d)) / rad(k), where k = A398342(n) and rad = A007947.
 * @author Sean A. Irvine
 */
public class A398343 extends A398342 {

  @Override
  public Z next() {
    final Z k = super.next();
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(k).divisors()) {
      sum = sum.add(Functions.RAD.z(d));
    }
    return sum.divide(Functions.RAD.z(k));
  }
}
