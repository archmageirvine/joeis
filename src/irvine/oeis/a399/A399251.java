package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399251 allocated for Jens Ahlstr\u00f6m.
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

