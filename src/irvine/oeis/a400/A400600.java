package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400600 allocated for Fedor Karpelevitch.
 * @author Sean A. Irvine
 */
public class A400600 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z f = Z.ONE.shiftLeft(++mN).subtract(mN * (mN - 3) / 2).subtract(5);
    if (mN <= 8) {
      return f;
    }
    if (mN <= 10) {
      return f.add(1);
    }
    return f.add(2);
  }
}

