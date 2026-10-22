package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400803 allocated for Vicenzo P DeMaar.
 * @author Sean A. Irvine
 */
public class A400803 extends A400804 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(b(++mN));
  }
}
