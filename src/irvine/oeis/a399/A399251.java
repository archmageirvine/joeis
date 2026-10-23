package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399251 a(n) = x^2 - y^2, where (x, y) are the coordinates of the n-th point of the square counterclockwise spiral with n=1 at the origin.
 * @author Sean A. Irvine
 */
public class A399251 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] xy = ZUtils.ulamCoords(Z.valueOf(++mN));
    return xy[0].square().subtract(xy[1].square());
  }
}

