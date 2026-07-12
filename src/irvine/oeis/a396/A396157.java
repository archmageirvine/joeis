package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A396157 Composites k not of the form 8*p or 9*q, odd prime p, prime q != 3, such that rad(k)*bigomega(k) = k, with rad = A007947 and bigomega = A001222.
 * @author Sean A. Irvine
 */
public class A396157 extends FilterSequence {

  /** Construct the sequence. */
  public A396157() {
    super(1, new A396594(), k -> {
      if (k.isProbablePrime()) {
        return false;
      }
      final Z[] qr8 = k.divideAndRemainder(8);
      if (qr8[1].isZero() && qr8[0].isProbablePrime()) {
        return false;
      }
      final Z[] qr9 = k.divideAndRemainder(9);
      if (qr9[1].isZero() && qr9[0].isProbablePrime()) {
        return false;
      }
      return true;
    });
  }
}
