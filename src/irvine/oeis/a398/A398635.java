package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398635 Number of interior lattice points of [0,2n]^2 visible from all four vertices.
 * @author Sean A. Irvine
 */
public class A398635 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 2) {
      return Z.ONE;
    }
    long count = 0;
    for (long x = 1; x <= mN; ++x) {
      for (long y = x + 1; y <= mN; ++y) {
        if (Functions.GCD.l(x * (mN - x), y * (mN - y)) == 1) {
          count += 2;
        }
      }
    }
    return Z.valueOf(count);
  }
}
