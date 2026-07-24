package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396769 Value of the Sackin index for the rooted binary echelon tree with n leaves.
 * @author Sean A. Irvine
 */
public class A396769 extends Sequence1 {

  private long mN = 0;

  private long sackin(final long n) {
    if ((n & (n - 1)) == 0) {
      return n * Long.numberOfTrailingZeros(n);
    }
    final long m = Long.highestOneBit(n);
    return m * Long.numberOfTrailingZeros(m) + n + sackin(n - m);
  }

  @Override
  public Z next() {
    return Z.valueOf(sackin(++mN));
  }
}
