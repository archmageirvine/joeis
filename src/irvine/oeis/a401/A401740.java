package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002144;

/**
 * A401740 Pythagorean primes p for which the semiperimeter s and inradius r of the primitive Pythagorean triangle with hypotenuse p give another Pythagorean prime q = s^2 + r^2.
 * @author Sean A. Irvine
 */
public class A401740 extends FilterSequence {

  /** Construct the sequence. */
  public A401740() {
    super(1, new A002144(), p -> {
      long y = 0;
      while (true) {
        final Z y2 = Z.valueOf(++y).square();
        final Z x2 = p.subtract(y2);
        final Z[] xs = x2.sqrtAndRemainder();
        if (xs[1].isZero()) {
          final Z x = xs[0];
          final Z q = x2.multiply(x.add(y).square()).add(y2.multiply(x.subtract(y).square()));
          return q.isProbablePrime();
        }
      }
    });
  }
}

