package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a337.A337249;

/**
 * A398583 Earliest sequence of numbers k such that k * sin(k) is positive and decreases monotonically toward 0.
 * @author Sean A. Irvine
 */
public class A398583 extends A337249 {

  private CR mBest = CR.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final CR n = CR.valueOf(k);
      final CR t = n.sin().multiply(n);
      if (t.signum() > 0 && t.compareTo(mBest) < 0) {
        mBest = t;
        return k;
      }
    }
  }
}
