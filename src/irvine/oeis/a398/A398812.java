package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a138.A138808;

/**
 * A398812 a(n) = n^2 - A138808(n): number of lattice points in the square [1,n] X [1,n] not covered by any box [1,p] X [1,q] with p*q = n.
 * @author Sean A. Irvine
 */
public class A398812 extends A138808 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN * mN).subtract(t);
  }
}
