package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A086811.
 * @author Sean A. Irvine
 */
public class A400874 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400874() {
    super(1, (p, e) -> {
      Z prod = Z.ONE;
      for (long i = 1, k = 0; i <= e; i <<= 1, ++k) {
        if (((e & i) != 0)) {
          prod = prod.multiply(p.pow(1L << k).add(2));
        }
      }
      return prod;
    });
  }
}
