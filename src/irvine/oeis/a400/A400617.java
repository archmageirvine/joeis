package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400617 Irregular array where the n-th row is the trajectory obtained when starting with t = 1; then if t is odd add 2*n-1; if even divide by 2. Stop when you reach 1.
 * @author Sean A. Irvine
 */
public class A400617 extends Sequence1 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mN += 2;
      mA = Z.ONE;
      return Z.ONE;
    }
    mA = mA.isEven() ? mA.divide2() : mA.add(mN);
    final Z res = mA;
    if (mA.isOne()) {
      mA = null;
    }
    return res;
  }
}
