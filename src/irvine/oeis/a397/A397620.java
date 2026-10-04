package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397620 a(n) = Sum_{d | n^3} d^3 * lambda(d) / Sum_{d | n^3} d * lambda(d), where lambda(n) denotes Liouville's function A008836(n).
 * @author Sean A. Irvine
 */
public class A397620 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z num = Z.ZERO;
    Z den = Z.ZERO;
    for (final Z d : Jaguar.factor(Z.valueOf(++mN).pow(3)).divisors()) {
      final Z l = Functions.LIOUVILLE_LAMBDA.z(d);
      num = num.add(d.pow(3).multiply(l));
      den = den.add(d.multiply(l));
    }
    return num.divide(den);
  }
}
