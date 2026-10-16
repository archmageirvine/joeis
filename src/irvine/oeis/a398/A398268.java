package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a069.A069268;

/**
 * A398268 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A398268 extends A069268 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(5));
    return mSum;
  }
}
