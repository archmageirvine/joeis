package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399026 a(n) is the number of inequivalent ways of choosing 4 points on an n X n grid that form a square up to rotations and reflections.
 * @author Sean A. Irvine
 */
public class A399026 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN).multiply(mN).add(32).multiply(mN).subtract(24).multiply(mN).divide(96)
      : Z.valueOf(mN).add(1).multiply(mN).add(39).multiply(mN).subtract(9).multiply(mN - 1).divide(96);
  }
}
