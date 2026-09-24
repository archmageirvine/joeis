package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a057.A057557;

/**
 * A397898 allocated for Nicolay Avilov.
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
