
package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401460 allocated for Helen Grundman.
 * @author Sean A. Irvine
 */
public class A401460 extends Sequence2 {

  private long mN = 1;

  private static long step(long x, final long base) {
    return 1 + Functions.DIGIT_SUM_SQUARES.l(base, x);
  }

  @Override
  public Z next() {
    final long n = ++mN;
    final long limit = 1 + 3 * (n - 1) * (n - 1);
    final LongDynamicLongArray mark = new LongDynamicLongArray();
    final LongDynamicLongArray path = new LongDynamicLongArray();
    final LongDynamicBooleanArray done = new LongDynamicBooleanArray();
    long cycles = 0;
    for (long start = 0; start <= limit; ++start) {
      if (done.isSet(start)) {
        continue;
      }
      final long tag = start + 1;
      long len = 0;
      long x = start;
      // Follow the orbit until it reaches a previously processed
      // vertex or repeats a vertex in the current traversal
      while (!done.isSet(x) && mark.get(x) != tag) {
        mark.set(x, tag);
        path.set(len++, x);
        x = step(x, n);
      }
      // A repetition in the current traversal identifies one cycle
      if (mark.get(x) == tag) {
        ++cycles;
      }
      // All vertices in this path are now processed
      for (int k = 0; k < len; ++k) {
        done.set(path.get(k));
      }
    }
    return Z.valueOf(cycles);
  }
}
