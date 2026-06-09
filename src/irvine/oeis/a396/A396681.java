package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396681 allocated for Jose O. del Toro Barroso.
 * @author Sean A. Irvine
 */
public class A396681 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (p.compareTo(Z.TWO) > 0) {
      p = Functions.LPF.z(p.multiply(5).add(1).makeOdd());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
