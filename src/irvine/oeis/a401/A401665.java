package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401665 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A401665 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401665() {
    super(1, 2, k -> {
      Z t = Z.valueOf(k).multiply(k + 1).multiply(2 * k + 1);
      for (long r = 1; r < k; ++r) {
        final Z u = t.subtract(Z.valueOf(r).multiply(r - 1).multiply(2 * r - 1));
        final long d = 6 * (k - r + 1);
        final Z[] qr = u.divideAndRemainder(d);
        if (qr[1].isZero() && qr[0].isSquare()) {
          return true;
        }
      }
      return false;
    });
  }
}

