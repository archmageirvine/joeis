package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A402462 allocated for Edward Schmidt.
 * @author Sean A. Irvine
 */
public class A402462 extends A002144 {

  @Override
  public Z next() {
    final Z p = super.next();
    long y = 0;
    while (true) {
      final Z y2 = Z.valueOf(++y).square();
      final Z x2 = p.subtract(y2);
      final Z[] xs = x2.sqrtAndRemainder();
      if (xs[1].isZero()) {
        final Z x = xs[0];
        final Z u = x2.subtract(y2);
        final Z v = x.multiply(y).multiply2();
        return p.pow(4).add(u.subtract(v).pow(4)).divide2();
      }
    }
  }
}

