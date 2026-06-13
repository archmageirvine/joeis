package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396285 a(n) is the number of distinct triplets of triangles chosen from the n^2 unit triangles of the triangular grid, excluding rotationally equivalent configurations.
 * @author Sean A. Irvine
 */
public class A396285 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN, 3).add(2 * ((mN * mN) / 3)).divide(3);
  }
}
