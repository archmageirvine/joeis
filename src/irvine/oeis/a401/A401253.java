package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401253 allocated for Tomas Laris.
 * @author Sean A. Irvine
 */
public class A401253 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long g = Functions.GCD.l(++mN, 1);
    for (long k = 2; k < mN; ++k) {
      final long d = g;
      g = Functions.GCD.l(mN, k);
      sum = sum.add(Math.abs(g - d));
    }
    return sum;
  }
}

