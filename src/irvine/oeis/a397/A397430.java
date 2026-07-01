package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a161.A161601;
import irvine.oeis.a161.A161603;

/**
 * A397430 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397430 extends Sequence1 {

  private final Sequence mA = new A161601();
  private final Sequence mB = new A161603();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().isProbablePrime() && !mB.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
