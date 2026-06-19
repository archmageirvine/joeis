package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396761 a(n) is the number of distinct triplets of triangles chosen from the n^2 unit triangles of the triangular grid, excluding rotationally equivalent configurations and reflections.
 * @author Sean A. Irvine
 */
public class A396761 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN, 3).add(2 * ((mN * mN) / 3)).divide(3).add(Z.valueOf(mN).square().multiply(mN - 1).divide2()).add(Binomial.binomial(mN, 3)).divide2();
  }
}
