package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400335 allocated for Rasmus Joergensen.
 * @author Sean A. Irvine
 */
public class A400335 extends Sequence1 {

  private long mN = 0;

  protected Z f(final long g, final long l) {
    final Z s = (l & 1) == 0 ? Z.TWO : Z.ONE;
    return Integers.SINGLETON.sum(0, g / 2,
      p -> Functions.FACTORIAL.z(g)
        .divide(Functions.FACTORIAL.z(g - 2 * p).multiply(Functions.FACTORIAL.z(p)).shiftLeft(p))
        .multiply(Z.valueOf(l).pow(p))
        .multiply(s.pow(g - 2 * p))
    );
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN - 1, r -> f(Functions.GCD.l(mN, r), mN / Functions.GCD.l(mN, r))).divide(mN);
  }
}
