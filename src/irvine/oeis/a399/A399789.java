package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399789 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A399789 extends MultiplicativeSequence {

  private static Z t(final Z p) {
    if (p.mod(4) == 3) {
      return Z.ZERO;
    }
    assert p.mod(4) == 1;
    Z b = Z.ZERO;
    while (true) {
      b = b.add(2);
      final Z a2 = p.subtract(b.square());
      final Z[] a = a2.sqrtAndRemainder();
      if (a[1].isZero() && a[0].isOdd()) {
        final long r = a[0].add(b).mod(4);
        if (r == 1) {
          return a[0].multiply2();
        } else if (r == 3) {
          return a[0].multiply2().negate();
        }
      }
    }
  }

  /** Construct the sequence. */
  public A399789() {
    super(1, (p, e) -> {
      if (p.equals(Z.TWO)) {
        return e == 1 ? Z.TWO : Z.THREE.shiftLeft(e - 1);
      }
      return p.pow(e - 1).multiply(p.subtract(t(p)));
    });
  }
}
