package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401821 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A401821 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    while (mSum.compareTo(n) <= 0) {
      mSum = mSum.add(CR.valueOf(++mM).inverse().sin());
    }
    return Z.valueOf(mM);
  }
}
