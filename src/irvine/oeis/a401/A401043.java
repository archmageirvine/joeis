package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A401043 allocated for Jan Snellman.
 * @author Sean A. Irvine
 */
public class A401043 extends A401042 {

  private long mN = 1;
  private long mPi = 0;

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      ++mPi;
    }
    return Integers.SINGLETON.sum(0, mPi, k -> t(mN, k));
  }
}
