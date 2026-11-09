package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401647 allocated for Amit Shukla.
 * @author Sean A. Irvine
 */
public class A401647 extends Sequence1 {

  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    if (mCounts[1] == 0) {
      ++mCounts[1];
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mCounts.length; ++k) {
      if (mCounts[k] > 0) {
        sb.append(mCounts[k]).append(k);
      }
    }
    for (int k = 0; k < sb.length(); ++k) {
      ++mCounts[sb.charAt(k) - '0'];
    }
    return new Z(sb);
  }
}
