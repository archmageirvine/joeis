package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a394.A394611;

/**
 * A397177 a(n) = n - A394611(n).
 * @author Sean A. Irvine
 */
public class A397177 extends A394611 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next());
  }
}
