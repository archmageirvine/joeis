package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398744 allocated for Leo Zhang.
 * @author Sean A. Irvine
 */
public class A398744 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (Predicates.PRIME.is(mN - 2)) {
        final Z t = mA.add(mB);
        mA = mB;
        mB = t;
      } else {
        mA = mB;
      }
    }
    return mB;
  }
}

