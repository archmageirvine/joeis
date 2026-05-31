package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085084.
 * @author Sean A. Irvine
 */
public class A396215 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      if (Functions.BIG_OMEGA.l(Binomial.binomial(mN + ++k, mN)) == mN) {
        return Z.valueOf(k + 1);
      }
    }
  }
}

