package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399055 allocated for Lux Penet.
 * @author Sean A. Irvine
 */
public class A399055 extends Sequence1 {

  // After Lux Penet

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    if (mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    long a = 0;
    long count = 0;
    final long mask = (1L << mN) - 1;
    final HashSet<Long> past = new HashSet<>();
    // Generate all binary necklaces of length n
    while (true) {
      int i = mN - 1;
      while (i >= 0 && ((a >>> (mN - 1 - i)) & 1) == 1) {
        --i;
      }
      if (i < 0) {
        return Z.valueOf(count);
      }
      a |= 1L << (mN - 1 - i);
      for (int j = i + 1; j < mN; ++j) {
        if (((a >>> (mN - j + i)) & 1) == 1) {
          a |= 1L << (mN - 1 - j);
        } else {
          a &= ~(1L << (mN - 1 - j));
        }
      }
      if (mN % (i + 1) == 0 && !past.contains(a)) {
        final HashSet<Long> path = new HashSet<>();
        long now = a;
        while (!path.contains(now) && !past.contains(now)) {
          path.add(now);
          final long left = (now >>> 1) | ((now & 1) << (mN - 1));
          final long right = ((now << 1) & mask) | (now >>> (mN - 1));
          final long next = left ^ (now | right);
          // Find small representation
          now = next;
          for (int k = 1; k < mN; ++k) {
            final long v = ((next << k) & mask) | (next >>> (mN - k));
            if (v < now) {
              now = v;
            }
          }
        }
        if (!past.contains(now)) {
          ++count;
        }
        past.addAll(path);
      }
    }
  }
}

