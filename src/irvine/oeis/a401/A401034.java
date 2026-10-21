package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A401034 allocated for Jens Ahlstr\u00f6m.
 * @author Sean A. Irvine
 */
public class A401034 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SUM.z(ZUtils.ulamCoords(Z.valueOf(++mN))).add(mN);
  }
}

