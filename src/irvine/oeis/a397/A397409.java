package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033677;

/**
 * A397409 Irregular triangle read by rows: row n lists, in increasing order, the products n*k such that A033677(n*k) = n.
 * @author Sean A. Irvine
 */
public class A397409 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A033677());
  private long mN = 0;
  private long mR = 0;

  @Override
  public Z next() {
    if (mR >= mN * mN) {
      ++mN;
      mR = 0;
    }
    while (true) {
      final Z t = mA.a(++mR);
      if (t.equals(mN)) {
        return Z.valueOf(mR);
      }
    }
  }
}
