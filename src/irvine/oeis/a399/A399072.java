package irvine.oeis.a399;

import java.util.List;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399072 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A399072 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  private long count(final long n, final List<Long> divs, final int pos) {
    if (n == 0) {
      return 1;
    }
    if (pos >= divs.size()) {
      return 0;
    }
    long cnt = count(n, divs, pos + 1);
    final long m = n - divs.get(pos);
    if (m >= 0) {
      cnt += count(m, divs, pos + 1);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final long cnt = count(++mM, FactorUtils.antidivisors(mM), 0);
      if (mA.get(cnt) == 0) {
        mA.set(cnt, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

