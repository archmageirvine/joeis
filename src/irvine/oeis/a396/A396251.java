package irvine.oeis.a396;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396251 a(n) is the number of 4-ary sequences of length n with characteristic value 0.
 * @author Sean A. Irvine
 */
public class A396251 extends Sequence1 {

  // We pack edges two bits at a time into a long
  // Maps packed edge -> count
  private Map<Long, Long> mStates = null;
  private int mN = 0;
  private final byte mCharacteristic;

  protected A396251(final byte characteristic) {
    mCharacteristic = characteristic;
  }

  /** Construct the sequence. */
  public A396251() {
    this((byte) 0);
  }

  /*
   * Extend an edge of length len by prepending x.
   * Each edge entry occupies 2 bits.
   */
  private static long extend(final long old, final int len, final int x) {
    long res = x;
    int prev = x;
    for (int k = 0; k < len; ++k) {
      final int v = (int) ((old >>> (2 * k)) & 3);
      prev = Math.abs(v - prev);
      res |= (long) prev << (2 * (k + 1));
    }
    return res;
  }

  /*
   * Return the last element of an edge of length len.
   */
  private static int last(final long code, final int len) {
    return (int) ((code >>> (2 * (len - 1))) & 3);
  }

  @Override
  public Z next() {
    if (++mN > 32) {
      // Exhausts what we can store in a long in terms of edges
      throw new UnsupportedOperationException();
    }
    if (mN == 1) {
      mStates = new HashMap<>();
      // Initial edges: (0), (1), (2), (3)
      mStates.put(0L, 1L);
      mStates.put(1L, 1L);
      mStates.put(2L, 1L);
      mStates.put(3L, 1L);
      // Only (0) has characteristic 0
      return Z.ONE;
    }

    // Current states have edge length mN-1
    final int len = mN - 1;
    final int expected = (int) (mStates.size() * 2.2);
    final Map<Long, Long> next = new HashMap<>((int) (expected / 0.75) + 1);
    for (final Map.Entry<Long, Long> e : mStates.entrySet()) {
      final long state = e.getKey();
      final long count = e.getValue();
      for (int x = 0; x < 4; ++x) {
        next.merge(extend(state, len, x), count, Long::sum);
      }
    }
    mStates = next;

    Z sum = Z.ZERO;
    for (final Map.Entry<Long, Long> e : mStates.entrySet()) {
      if (last(e.getKey(), mN) == mCharacteristic) {
        sum = sum.add(e.getValue());
      }
    }
    return sum;
  }
}
