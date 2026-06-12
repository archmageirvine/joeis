package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a080.A080257;

/**
 * A396031.
 * @author Sean A. Irvine
 */
public class A396828 extends Sequence1 {

  private final Sequence mS = new A080257();
  private Q mBest = Q.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z n = mS.next();
      final Q t = new Q(Functions.SIGMA1.z(n), n);
      if (t.compareTo(mBest) < 0) {
        mBest = t;
        return n;
      }
    }
  }
}
