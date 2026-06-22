package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397099 allocated for Hoang Nguyen.
 * @author Sean A. Irvine
 */
public class A397099 extends Sequence1 {

  private Q mBest = Q.TWO;
  private long mN = 2;


  @Override
  public Z next() {
    while (true) {
      if (!Predicates.POWER_OF_TWO.is(++mN)) {
        final Q abundancy = Q.TWO.subtract(new Q(Functions.SIGMA1.z(mN), mN)).abs();
        if (!abundancy.isZero() && abundancy.compareTo(mBest) < 0) {
          mBest = abundancy;
          return Z.valueOf(mN);
        }
      }
    }
  }
}
