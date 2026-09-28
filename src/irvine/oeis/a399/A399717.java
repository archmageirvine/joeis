package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399717 Numerators of "Farey fraction" approximations to Pi/2.
 * @author Sean A. Irvine
 */
public class A399717 extends Sequence0 {

  private Z mLoP = null;
  private Z mLoQ = Z.ONE;
  private Z mHiP = null;
  private Z mHiQ = Z.ZERO;

  protected Z select(final Z num, final Z den) {
    return num;
  }

  @Override
  public Z next() {
    if (mHiP == null) {
      if (mLoP == null) {
        mLoP = Z.ZERO;
        return select(Z.ONE, Z.ZERO);
      }
      mHiP = Z.ONE;
      return select(Z.ZERO, Z.ONE);
    }
    final Z p = mLoP.add(mHiP);
    final Z q = mLoQ.add(mHiQ);
    final Z res = select(p, q);
    if (CR.valueOf(p).divide(q).compareTo(CR.HALF_PI) <= 0) {
      mLoP = p;
      mLoQ = q;
    } else {
      mHiP = p;
      mHiQ = q;
    }
    return res;
  }
}
