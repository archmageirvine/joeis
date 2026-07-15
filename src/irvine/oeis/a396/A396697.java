package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396697 Smallest composite of each composite domino orthogonally enclosed by primes in the odds-only Ulam spiral.
 * @author Sean A. Irvine
 */
public class A396697 extends Sequence1 {

  // After Paul Steendijk

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mA = new TreeSet<>();
  private int mS = 0;

  private long v(final int x, final int y) {
    if (x == 0 && y == 0) {
      return 1;
    }
    if (-x < y && y <= x) {
      return 1L + 8L * x * x - 6L * x + 2L * y;
    }
    if (-y <= x && x < y) {
      return 1L + 8L * y * y - 2L * y - 2L * x;
    }
    if (x <= y && y < -x) {
      return 1L + 8L * x * x - 2L * x - 2L * y;
    }
    return 1L + 8L * y * y - 6L * y + 2L * x;
  }

  private boolean isComp(final int x, final int y) {
    final long k = v(x, y);
    return k > 1 && !mPrime.isPrime(k);
  }

  private boolean isPair(final int x, final int y, final int dx, final int dy) {
    return isComp(x, y)
      && isComp(x + dx, y + dy)
      && mPrime.isPrime(v(x - dx, y - dy))
      && mPrime.isPrime(v(x - dy, y + dx))
      && mPrime.isPrime(v(x + dy, y - dx))
      && mPrime.isPrime(v(x + 2 * dx, y + 2 * dy))
      && mPrime.isPrime(v(x + dx - dy, y + dy + dx))
      && mPrime.isPrime(v(x + dx + dy, y + dy - dx));
  }

  private void testPoint(final int x, final int y) {
    if (isComp(x, y)) {
      if (isPair(x, y, 1, 0)) {
        mA.add(Math.min(v(x, y), v(x + 1, y)));
      } else if (isPair(x, y, 0, 1)) {
        mA.add(Math.min(v(x, y), v(x, y + 1)));
      }
    }
  }

  private void expand() {
    // Search another shell
    ++mS;
    for (int y = -mS + 1; y <= mS; ++y) {
      testPoint(mS, y);
    }
    for (int x = mS - 1; x >= -mS; --x) {
      testPoint(x, mS);
    }
    for (int y = mS - 1; y >= -mS; --y) {
      testPoint(-mS, y);
    }
    for (int x = -mS + 1; x <= mS; ++x) {
      testPoint(x, -mS);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      expand();
    }
    return Z.valueOf(mA.pollFirst());
  }
}
