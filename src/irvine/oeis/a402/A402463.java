package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A402463 allocated for Edward Schmidt.
 * @author Sean A. Irvine
 */
public class A402463 extends A002144 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      long y = 0;
      while (true) {
        final Z y2 = Z.valueOf(++y).square();
        final Z x2 = p.subtract(y2);
        if (x2.compareTo(y2) < 0) {
          break;
        }
        final Z[] xs = x2.sqrtAndRemainder();
        if (xs[1].isZero()) {
          final Z x = xs[0];
          final Z h = x2.subtract(y2).subtract(x.multiply(y).multiply2()).abs();
          final Z q = p.pow(4).add(h.pow(4)).divide2();
          final Z bigQ = p.multiply(q);
          final Z r = h.pow(4).subtract(p.pow(4).multiply(3)).multiply(h).divide2();
          if (r.square().compareTo(bigQ.square().multiply(2)) < 0) {
            return bigQ;
          }
        }
      }
    }
  }
}
