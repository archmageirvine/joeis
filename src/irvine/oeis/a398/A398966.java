package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398966 allocated for Gordon Hamilton.
 * @author Sean A. Irvine
 */
public class A398966 extends Sequence0 {

  // After Jinyuan Wang

  private long mN = -1;
  private final HashSet<Long> mV = new HashSet<>();

  private void f(final long m, final long s) {
    for (long i = 1; i <= mN; ++i) {
      final long t = s | (m & s << i);
      if (mV.add(t)) {
        f(m, t);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= 63) {
      throw new UnsupportedOperationException();
    }
    mV.clear();
    final long m = (2L << mN) - 1;
    f(m, 1);
    return Z.valueOf(mV.size() + 1);
  }
}
