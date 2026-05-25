package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396086 allocated for Patrick Bini.
 * @author Sean A. Irvine
 */
public class A396086 extends Sequence0 {

  private int mN = -1;

  /**
   * Test whether [u/den, v/den] intersects the Cantor set.
   */
  private boolean intersects(long u, long v, final long den) {
    final long twoDen = den << 1;
    while (true) {
      // Entirely inside deleted middle third:
      // u/den > 1/3 and v/den < 2/3
      if (3 * u > den && 3 * v < twoDen) {
        return false;
      }
      // Entirely in left third
      if (3 * v <= den) {
        u *= 3;
        v *= 3;
      } else if (3 * u >= twoDen) {
        // Entirely in right third
        u = 3 * u - twoDen;
        v = 3 * v - twoDen;
      } else {
        // Crosses a surviving boundary
        return true;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final long den = 1L << mN;
    long cnt = 0;
    for (long m = 0; m < den; ++m) {
      if (intersects(m, m + 1, den)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
