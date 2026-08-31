package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A398494 allocated for A. Lamek.
 * @author Sean A. Irvine
 */
public class A398494 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.multiply2();
      final Z mod = p.square().multiply2();
      final Z t = Z.ONE.shiftLeft(p.longValueExact()).subtract(1);
      for (final Z d : Jaguar.factor(t).divisors()) {
        if (!d.isOne() && !d.equals(t) && d.add(p2).mod(mod).isOne()) {
          return p;
        }
      }
    }
  }
}
