package irvine.oeis.a398;

import irvine.math.z.Z;

/**
 * A398793 Number of residues r mod 2^(n+1) such that r and r+1 have the same image and the same number of odd terms after n+1 iterations of the Collatz map (A014682) and such that r mod 2^n does not already have this property at level n.
 * @author Sean A. Irvine
 */
public class A398793 extends A398792 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}
