package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396467 a(n) is the number of distinct triplets of triangles chosen from n^2 unit triangles of a triangular grid, excluding rotationally equivalent configurations and excluding the centers of three triangles in a same symmetrical axis.
 * @author Sean A. Irvine
 */
public class A396467 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN, 3).add(2 * ((mN * mN) / 3)).divide(3).subtract(Binomial.binomial(mN, 3));
  }
}
