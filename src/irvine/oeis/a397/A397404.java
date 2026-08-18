package irvine.oeis.a397;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A397404 allocated for Gavin Lupo.
 * @author Sean A. Irvine
 */
public class A397404 extends Sequence0 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mX = Z.ZERO;
  private Z mY = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    System.out.println(Arrays.toString(ZUtils.ulamCoords(Z.valueOf(345))));
    System.out.println(Arrays.toString(ZUtils.ulamCoords(Z.valueOf(603))));
    System.out.println(Arrays.toString(ZUtils.ulamCoords(Z.valueOf(605))));
    if (++mN == 0) {
      mUsed.add(Z.ZERO);
      return Z.ZERO;
    }
    final boolean parity = ((mN >>> 1) & 1) == 1;
    Z best = null;
    Z bx = null;
    Z by = null;
    long r2 = 0;
    while (best == null) {
      ++r2;
      for (long dx = -r2; dx <= r2; ++dx) {
        for (long dy = -r2; dy <= r2; ++dy) {
          final long d = dx * dx + dy * dy;
          if (d == r2) {
            final Z nx = mX.add(dx);
            final Z ny = mY.add(dy);
            final Z v = ZUtils.ulamValue(nx, ny).subtract(1);
            if (v.testBit(0) == parity && !mUsed.contains(v) && (best == null || v.compareTo(best) < 0)) {
              best = v;
              bx = nx;
              by = ny;
            }
          }
        }
      }
    }
    mUsed.add(best);
    mX = bx;
    mY = by;
    return best;
  }
}
