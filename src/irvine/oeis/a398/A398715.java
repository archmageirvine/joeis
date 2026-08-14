package irvine.oeis.a398;

import irvine.oeis.FilterNumberSequence;

/**
 * A398715 allocated for Nick Kashyap.
 * @author Sean A. Irvine
 */
public class A398715 extends FilterNumberSequence {

  private static final long[] MAP = {0, 1, 2, -1, -1, 5, 9, -1, 8, 6};

  private static long r(final long n) {
    if (n % 10 == 0) {
      return -1;
    }
    long m = n;
    long r = 0;
    while (m != 0) {
      r *= 10;
      final long v = MAP[(int) (m % 10)];
      if (v < 0) {
        return -1;
      }
      r += v;
      m /= 10;
    }
    return r;
  }

  private static boolean isStrobogrammatic(final long n) {
    return r(n) == n;
  }

  /** Construct the sequence. */
  public A398715() {
    super(1, n -> {
      final long r = r(n);
      if (r < 0) {
        return false;
      }
      final long u = n + r;
      if (isStrobogrammatic(u)) {
        return false;
      }
      final long s = r(u);
      return s >= 0 && isStrobogrammatic(u + s);
    });
  }
}
