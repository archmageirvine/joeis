package irvine.oeis.a401;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051022;
import irvine.oeis.a343.A343550;

/**
 * A401340 Primitive quotients in increasing order, obtained when a primitive term m of A401339 divides the number formed by inserting a 0 between each pair of consecutive digits of this term m.
 * @author Sean A. Irvine
 */
public class A401340 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
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
    while (mA.isEmpty() || mA.first().multiply(100).compareTo(mN) > 0) {
      if (is(++mN)) {
        mA.add(mF.a(mN).divide(mN));
      }
    }
    return mA.pollFirst();
  }
}
