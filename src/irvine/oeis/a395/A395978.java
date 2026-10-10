package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a397.A397739;
import irvine.util.array.DynamicLongArray;

/**
 * A395978 allocated for Peter Munn.
 * @author Sean A. Irvine
 */
public class A395978 extends Sequence1 {

  private final DirectSequence mR = DirectSequence.create(new A397739());
  private final DynamicLongArray mM = new DynamicLongArray();
  private int mN = 0;
  private int mK = -1;

  private Z t(final int row) {
    final Z r = mR.a(row);
    while (true) {
      final long m = mM.increment(row);
      if (r.mod(Functions.RAD.l(m)) == 0) {
        return r.multiply(m);
      }
    }
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mN - mK + 1);
  }
}
