package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a400.A400000;
import irvine.util.array.LongDynamicLongArray;

/**
 * A402516 allocated for Gionata Neri.
 * @author Sean A. Irvine
 */
public class A402516 extends A400000 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();

  @Override
  public Z next() {
    return Z.valueOf(mCounts.increment(super.next().longValueExact()) - 1);
  }
}
