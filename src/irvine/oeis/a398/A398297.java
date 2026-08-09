package irvine.oeis.a398;

import irvine.math.z.Z;

/**
 * A398297 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A398297 extends A398261 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
    } else {
      step();
    }
    return Z.valueOf(mRow.length);
  }
}
