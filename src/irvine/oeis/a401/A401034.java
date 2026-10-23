package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A401034 a(n) = n + x + y where x and y are the coordinates of n in the square spiral.
 * @author Sean A. Irvine
 */
public class A401034 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SUM.z(ZUtils.ulamCoords(Z.valueOf(++mN))).add(mN);
  }
}

