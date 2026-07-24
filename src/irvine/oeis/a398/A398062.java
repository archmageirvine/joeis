package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A398062 Array read by ascending antidiagonals: A(n,k) is the n-th nondivisor of k.
 * @author Sean A. Irvine
 */
public class A398062 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    while ((mM + 1) % mA.increment(mM) == 0) {
      // do nothing
    }
    return Z.valueOf(mA.get(mM));
  }
}
