package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a004.A004012;

/**
 * A400434 Sizes of the successive clusters of the hexagonal close-packed (HCP) lattice, centered on a lattice point.
 * @author Sean A. Irvine
 */
public class A400434 extends A004012 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isZero());
    mSum = mSum.add(t);
    return mSum;
  }
}

