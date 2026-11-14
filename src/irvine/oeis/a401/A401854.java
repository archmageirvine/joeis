package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401854: Maximum cycle length of the global map induced by an elementary cellular automaton with periodic boundary conditions.
 * @author Sean A. Irvine
 */
public class A401854 extends Sequence1 {

  private final int mRule;
  private int mN = 0;

  /**
   * Construct with a specified elementary cellular automaton rule
   * @param rule the rule number (0 to 255)
   */
  protected A401854(final int rule) {
    mRule = rule;
  }

  /** Construct the sequence. */
  public A401854() {
    this(45);
  }

  @Override
  public Z next() {
    ++mN;
    final long size = 1L << mN;
    final LongDynamicLongArray f = new LongDynamicLongArray();
    // Construct the global map
    for (long s = 0; s < size; ++s) {
      long t = 0;
      for (int i = 0; i < mN; ++i) {
        final long left = (s >>> ((i + mN - 1) % mN)) & 1;
        final long centre = (s >>> i) & 1;
        final long right = (s >>> ((i + 1) % mN)) & 1;
        final long index = (right << 2) | (centre << 1) | left;
        if (((mRule >>> index) & 1) != 0) {
          t |= 1L << i;
        }
      }
      f.set(s, t);
    }
    // Find the maximum cycle length
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    long best = 0;
    for (long s = 0; s < size; ++s) {
      if (seen.isSet(s)) {
        continue;
      }
      final LongDynamicLongArray path = new LongDynamicLongArray();
      final LongDynamicLongArray position = new LongDynamicLongArray();
      long len = 0;
      long v = s;
      while (!seen.isSet(v) && position.get(v) == 0) {
        position.set(v, len + 1);
        path.set(len++, v);
        v = f.get(v);
      }
      if (position.get(v) > 0) {
        best = Math.max(best, len - (position.get(v) - 1));
      }
      for (int k = 0; k < len; ++k) {
        seen.set(path.get(k));
      }
    }
    return Z.valueOf(best);
  }
}
