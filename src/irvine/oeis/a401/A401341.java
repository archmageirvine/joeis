package irvine.oeis.a401;

import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051022;
import irvine.oeis.a343.A343550;

/**
 * A401341 a(n) is the least term k in A401339 that produces the primitive quotient A401340(n).
 * @author Sean A. Irvine
 */
public class A401341 extends Sequence1 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private final DirectSequence mF = new A051022();
  private long mN = 0;

  private boolean is(final long n) {
    if (!A343550.is(n)) {
      return false;
    }
    final int p = Functions.VALUATION.i(n, 10);
    if (p > 0) {
      for (int i = p; i > 0; --i) {
        if (A343550.is(n / LongUtils.pow(10, i))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.firstKey().multiply(100).compareTo(mN) > 0) {
      if (is(++mN)) {
        mA.putIfAbsent(mF.a(mN).divide(mN), Z.valueOf(mN));
      }
    }
    return mA.pollFirstEntry().getValue();
  }
}
