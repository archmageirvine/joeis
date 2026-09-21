package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A397296 a(n) is the least nonnegative integer which is not equal to F(x,y) for some x,y being earlier terms of the sequence, where F(x,y) = lcm(x,y) + |x-y|.
 * @author Sean A. Irvine
 */
public class A397296 extends CachedSequence {

  private final LongDynamicBooleanArray mBlocked = new LongDynamicBooleanArray();

  /** Construct the sequence. */
  public A397296() {
    super(1);
  }

  @Override
  protected Z compute(final Z m) {
    final long n = m.longValueExact();
    long k = n == 1 ? -1 : a(n - 1).longValueExact();
    while (true) {
      if (!mBlocked.isSet(++k)) {
        for (long j = 1; j < n; ++j) {
          final long aj = a(j).longValue();
          mBlocked.set(Functions.LCM.l(aj, k) + Math.abs(aj - k));
        }
        mBlocked.set(k);
        return Z.valueOf(k);
      }
    }
  }
}
