package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030190.
 * @author Sean A. Irvine
 */
public class A400471 extends Sequence0 {
 
  private String mS = "";
  private int mPos = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.square().toString(2);
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos) - '0');
  }
}
