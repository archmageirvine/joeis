package irvine.oeis.a396;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018804;

/**
 * A394611.
 * @author Sean A. Irvine
 */
public class A396015 extends Sequence1 {

  private final Sequence mA = new A018804();
  private final HashMap<Z, Integer> mCounts = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mCounts.merge(mA.next(), 1, Integer::sum) != 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
