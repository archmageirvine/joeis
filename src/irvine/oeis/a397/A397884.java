package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397884 Irregular triangle of divisors of prime(n)^2 + 1.
 * @author Sean A. Irvine
 */
public class A397884 extends A000040 {

  private Z[] mD = {};
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mD.length) {
      final Z p = super.next();
      mD = Jaguar.factor(p.square().add(1)).divisorsSorted();
      mN = 0;
    }
    return mD[mN];
  }
}
