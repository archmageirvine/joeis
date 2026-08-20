package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a396.A396781;
import irvine.oeis.a397.A397879;

/**
 * A398415 Numbers k such that A396781(k) = A397879(k).
 * @author Sean A. Irvine
 */
public class A398415 extends Sequence1 {

  private final Sequence mA = new A396781();
  private final Sequence mB = new A397879();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
