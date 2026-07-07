package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A397111 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397111 extends Sequence1 {

  private final Sequence mA = new A000201();
  private final Sequence mB = new A001950();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s = mA.next();
      final Z t = mB.next();
      if (s.isProbablePrime() && t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
