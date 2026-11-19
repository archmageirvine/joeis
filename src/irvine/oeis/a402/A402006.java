package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002144;

/**
 * A402006 allocated for Edward Schmidt.
 * @author Sean A. Irvine
 */
public class A402006 extends FilterSequence {

  /** Construct the sequence. */
  public A402006() {
    super(1, new A002144(), p -> {
      long y = 0;
      while (true) {
        final Z y2 = Z.valueOf(++y).square();
        final Z x2 = p.subtract(y2);
        final Z[] xs = x2.sqrtAndRemainder();
        if (xs[1].isZero()) {
          final Z x = xs[0];
          final Z u = x2.subtract(y2);
          final Z v = x.multiply(y).multiply2();
          final Z q = u.add(v).pow(4).add(p.pow(4)).divide2();
          return q.isProbablePrime();
        }
      }
    });
  }
}

