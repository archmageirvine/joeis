package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397672 allocated for Mareike Fischer.
 * @author Sean A. Irvine
 */
public class A397672 extends Sequence1 {

  private int mN = 0;

  private long colless(final int n) {
    if (n <= 1) {
      return 0;
    }
    if ((n & (n - 1)) == 0) {
      return 0;
    }
    final int m = Integer.highestOneBit(n);
    return 2L * m - n + colless(n - m);
  }

  @Override
  public Z next() {
    return Z.valueOf(colless(++mN));
  }
}
