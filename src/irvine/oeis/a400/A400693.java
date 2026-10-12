package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a069.A069268;

/**
 * A400693 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A400693 extends A069268 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(3));
    return mSum;
  }
}
