package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a399.A399458;
import irvine.util.array.LongDynamicLongArray;

/**
 * A397866 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A397866 extends A399458 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(2 * mN - 1) == 0) {
      ++mM;
      final long t = super.next().longValueExact();
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(2 * mN - 1));
  }
}
