package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A396609 Prime numbers whose nearest prime distance in the Ulam spiral exceeds that of every smaller prime number.
 * @author Sean A. Irvine
 */
public class A396609 extends A000040 {

  private long mBest = 0;

  private boolean isPrime(final long x, final long y) {
    return ZUtils.ulamValue(Z.valueOf(x), Z.valueOf(y)).isProbablePrime();
  }

  private long search(final long x, final long y) {
    long r2 = 1;
    while (true) {
      final long lim = Functions.SQRT.l(r2);
      for (long dx = 0; dx <= lim; ++dx) {
        final long dy2 = r2 - dx * dx;
        final long dy = Functions.SQRT.l(dy2);
        if (dy * dy == dy2) {
          if (isPrime(x + dx, y + dy)) {
            return r2;
          }
          if (dy != 0 && isPrime(x + dx, y - dy)) {
            return r2;
          }
          if (dx != 0) {
            if (isPrime(x - dx, y + dy)) {
              return r2;
            }
            if (dy != 0 && isPrime(x - dx, y - dy)) {
              return r2;
            }
          }
        }
      }
      ++r2;
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z[] coords = ZUtils.ulamCoords(p);
      final long x = coords[0].longValueExact();
      final long y = coords[1].longValueExact();
      final long dist = search(x, y);
      if (dist > mBest) {
        mBest = dist;
        return p;
      }
    }
  }
}

