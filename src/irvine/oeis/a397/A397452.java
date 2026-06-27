package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051037;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394611.
 * @author Sean A. Irvine
 */
public class A397452 extends Sequence1 {

  private final Sequence mS;
  private final LongDynamicBooleanArray mSmoothChar = new LongDynamicBooleanArray();
  private final LongDynamicLongArray mSmooth = new LongDynamicLongArray();
  private long mN = 0;
  private long mLast = 0;

  protected A397452(final Sequence s) {
    mS = s;
  }

  /** Construct the sequence. */
  public A397452() {
    this(new A051037());
  }

  private long s(final long k) {
    while (k >= mSmooth.length()) {
      final long s = mS.next().longValueExact();
      mSmooth.set(mSmooth.length(), s);
      mSmoothChar.set(s);
      mLast = s;
    }
    return mSmooth.get(k);
  }

  private boolean is(final long s) {
    while (s > mLast) {
      s(mSmooth.length());
    }
    return mSmoothChar.isSet(s);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; 2 * s(k) <= mN; ++k) {
      if (is(mN - s(k))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
