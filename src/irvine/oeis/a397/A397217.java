package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A397217 allocated for Eric Stolee.
 * @author Sean A. Irvine
 */
public class A397217 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] coords = ZUtils.ulamCoords(Z.valueOf(++mN));
    final Z x = coords[0];
    final Z y = coords[1];
    return Functions.MIN.z(
      ZUtils.ulamValue(x.add(mN), y),
      ZUtils.ulamValue(x.subtract(mN), y),
      ZUtils.ulamValue(x, y.add(mN)),
      ZUtils.ulamValue(x, y.subtract(mN)));
  }
}
