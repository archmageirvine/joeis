package irvine.oeis.a401;

import irvine.math.z.Z;

/**
 * A401211 Number of simple graphs on n unlabeled vertices rooted at a triangle.
 * @author Gregory Morse
 */
public class A401211 extends A401210 {
  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN < 3 ? Z.ZERO : compute(mN, 3);
  }
}
