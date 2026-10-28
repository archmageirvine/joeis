package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a106.A106039;

/**
 * A400800 allocated for Davide Rotondo.
 * @author Sean A. Irvine
 */
public class A400800 extends A106039 {

  private final HashSet<Long> mBelgian = new HashSet<>();

  private long[] toDigits(long b) {
    final long[] d = new long[Functions.DIGIT_LENGTH.i(b)];
    for (int k = d.length - 1; k >= 0; --k) {
      d[k] = b % 10;
      b /= 10;
    }
    return d;
  }

  private boolean is(final long b) {
    final long[] d = toDigits(b);
    long s = 0;
    int k = -1;
    while (s < b) {
      if (++k >= d.length) {
        k = 0;
      }
      s += d[k];
      if (!mBelgian.contains(s)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z b = super.next();
      final long bb = b.longValueExact();
      mBelgian.add(bb);
      if (is(bb)) {
        return b;
      }
    }
  }
}
