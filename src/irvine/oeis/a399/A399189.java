package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a283.A283626;

/**
 * A399189 a(n) = n^3 - A283626(n): number of lattice points in the cube [1,n]^3 not covered by any box [1,p] X [1,q] X [1,r] with p*q*r = n.
 * @author Sean A. Irvine
 */
public class A399189 extends A283626 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).subtract(super.next());
  }
}

