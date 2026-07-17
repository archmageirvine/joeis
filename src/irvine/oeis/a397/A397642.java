package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397642 allocated for Mareike Fischer.
 * @author Sean A. Irvine
 */
public class A397642 extends CachedSequence {

  /** Construct the sequence. */
  public A397642() {
    super(1);
  }

  private static long pack(final int b, final int c) {
    return (((long) Math.max(b, c)) << 32) | (Math.min(b, c) & 0xFFFFFFFFL);
  }

  private Collection<Long> qb(final int n) {
    if (n == 1) {
      return Collections.emptySet();
    }
    final Collection<Long> res = new TreeSet<>();
    if ((n & 1) == 0) {
      final int k = Integer.numberOfTrailingZeros(n);
      final int scale = 1 << k;
      for (final long p : qb(n >> k)) {
        final int b = (int) (p >>> 32);
        final int c = (int) p;
        res.add(pack(scale * b, scale * c));
      }
      res.add(pack(n / 2, n / 2));
      return res;
    }

    // odd case
    final ArrayList<Integer> m = new ArrayList<>();
    final int bits = 32 - Integer.numberOfLeadingZeros(n);
    for (int i = 0; i < bits; ++i) {
      if (((n >>> (bits - 1 - i)) & 1) != 0) {
        m.add(bits - 1 - i);
      }
    }
    res.add(pack((n + 1) / 2, (n - 1) / 2));
    for (int j = 1; j < m.size() - 1; ++j) {
      int t = 0;
      for (int i = 0; i < j; ++i) {
        t += 1 << (m.get(i) - 1);
      }
      if (m.get(j - 1) - m.get(j) > 1) {
        res.add(pack(n - t, t));
      }
      if (m.get(j) - m.get(j + 1) > 1) {
        t += 1 << m.get(j);
        res.add(pack(t, n - t));
      }
    }

    return res;
  }


  private Collection<Long> partitions(final int n) {
    final Collection<Long> res = qb(n);
    final int p = Integer.highestOneBit(n);
    if (p != n) {
      res.add(pack(p, n - p));
    }
    return res;
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n <= 1) {
      return Z.ONE;
    }

    Z sum = Z.ZERO;
    for (final long p : partitions(n)) {
      final int b = (int) (p >>> 32);
      final int c = (int) p;
      sum = sum.add(a(b).multiply(a(c)));
    }

    if ((n & 1) == 0) {
      final Z x = a(n / 2);
      sum = sum.add(x.multiply(x.subtract(1)).divide2());
    }
    return sum;
  }
}
