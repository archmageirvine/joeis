package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399025 a(n) is the number of inequivalent ways of choosing 4 points on an n X n grid that form a square up to rotations.
 * @author Sean A. Irvine
 */
public class A399025 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long m = ++mN / 2;
    return (mN & 1) == 0
      ? Z.valueOf(m - 1).add(2).multiply(m - 1).add(3).multiply(m).multiply(m).divide(3)
      : Z.valueOf(2 * m).add(2).multiply(m).add(5).multiply(m).multiply(m + 1).divide(6);
  }
}
