package irvine.oeis.a397;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007770;

/**
 * A085470.
 * @author Sean A. Irvine
 */
public class A397125 extends Sequence1 {

  private final DirectSequence mHappy = DirectSequence.create(new A007770());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Predicates.HAPPY.is(mHappy.a(++k).multiply(mN))) {
        return mHappy.a(k);
      }
    }
  }
}
