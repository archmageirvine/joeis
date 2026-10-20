package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400471 Write the positive squares 1, 4, 9, 16, ... in base 2 and juxtapose.
 * @author Sean A. Irvine
 */
public class A400471 extends Sequence1 {

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
