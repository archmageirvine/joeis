package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a057.A057557;

/**
 * A397898 Values of the discriminant b^2 - 4*a*c of the quadratic equation a*x^2 + b*x + c = 0 for triples (a, b, c) of positive numbers, ordered first by their sum and then component-wise.
 * @author Sean A. Irvine
 */
public class A397898 extends A057557 {

  @Override
  public Z next() {
    final Z a = super.next();
    final Z b = super.next();
    final Z c = super.next();
    return b.square().subtract(a.multiply(c).multiply(4));
  }
}
