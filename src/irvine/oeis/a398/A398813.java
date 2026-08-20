package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001055;
import irvine.util.array.LongDynamicByteArray;

/**
 * A398813 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A398813 extends Sequence1 {

  private final A001055 mA = new A001055();
  private final LongDynamicByteArray mIterations = new LongDynamicByteArray();
  private int mN = -1;
  private long mM = 0;

  private int iterations(final long m) {
    if (mIterations.get(m) == 0) {
      mIterations.set(m, (byte) (m == 1 ? 1 : mIterations.get(mA.a(m).longValueExact()) + 1));
    }
    return mIterations.get(m);
  }

  private boolean is(long m, final int n) {
    return iterations(m) == n + 1;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(++mM, mN)) {
      // do nothing
    }
    return Z.valueOf(mM);
  }
}

