package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401754 Square array read by antidiagonals upwards: T(n,k) is the n-th nonnegative integer that does not contain the string "k", with n &gt;= 1, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A401754 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  private Z t(final long col) {
    final String cs = String.valueOf(col);
    while (String.valueOf(mA.get(col)).contains(cs)) {
      mA.increment(col);
    }
    return Z.valueOf(mA.increment(col) - 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM);
  }
}
