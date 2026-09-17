package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A397296 allocated for G\u00f6ktu\u011f Omay.
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
