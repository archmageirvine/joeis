package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401489 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A401489 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Predicates.BRILLIANT.is(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
