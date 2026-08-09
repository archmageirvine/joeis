package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a397.A397600;

/**
 * A398470 Number of increasing 3-term arithmetic progressions in an n^3 cube.
 * @author Sean A. Irvine
 */
public class A398470 extends A397600 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
