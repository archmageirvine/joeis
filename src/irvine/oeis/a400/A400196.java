package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A399060.
 * @author Sean
 */
public class A400196 extends Sequence0 {

  private final LongDynamicBooleanArray mUsedPos = new LongDynamicBooleanArray();
  private final LongDynamicBooleanArray mUsedNeg = new LongDynamicBooleanArray();
  private long mA = 0;

  @Override
  public Z next() {
    if (!mUsedPos.isSet(0)) {
      mUsedPos.set(0);
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      ++k;
      final long dp = Math.abs(mA - k);
      if (!mUsedPos.isSet(k) && (dp == 2 || Predicates.SQUARE.is(dp))) {
        mUsedPos.set(k);
        mA = k;
        return Z.valueOf(mA);
      }
      final long dm = Math.abs(mA + k);
      if (!mUsedNeg.isSet(k) && (dm == 2 || Predicates.SQUARE.is(dm))) {
        mUsedNeg.set(k);
        mA = -k;
        return Z.valueOf(mA);
      }
    }
  }
}
