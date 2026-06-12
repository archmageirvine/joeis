package irvine.oeis.a396;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396031.
 * @author Sean A. Irvine
 */
public class A396765 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final HashSet<Long> s = new HashSet<>();
    for (long t = 0; t < mN; ++t) {
      if (Functions.GCD.l(t, mN) == 1 && Functions.GCD.l(Math.abs(1 - t), mN) == 1) {
        s.add(Functions.ORDER.l(mN, t));
      }
    }
    return Z.valueOf(s.size());
  }
}
