package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a034.A034694;
import irvine.oeis.a061.A061026;

/**
 * A402157 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A402157 extends Sequence1 {

  private final Sequence mA = new A061026();
  private final Sequence mB = new A034694();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().compareTo(mB.next()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
