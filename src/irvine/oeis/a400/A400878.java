package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A400878 Number of halting compressed register-machine programs of total length 7*n bits.
 * @author Gregory Morse
 */
public class A400878 extends NoncomputableSequence {

  /** Number of bits in the largest program length in Table 1. */
  public static final int SUM_BITS = 84;

  /** Construct the sequence. */
  public A400878() {
    // Table 1 of Calude, Dinneen and Shu (2002). The last count is retained as published;
    // the reconstruction of the historical computation did not reproduce it.
    super(1, NONCOMPUTABLE, 1, 1, 3, 8, 50, 311, 1012, 4382, 19164, 99785, 515279, 2559837);
  }

  /**
   * Return the numerator of the finite halting sum with denominator 2^84.
   * @return the numerator
   */
  public static Z haltingSumNumerator() {
    final A400878 counts = new A400878();
    Z sum = Z.ZERO;
    for (int bits = 7; bits <= SUM_BITS; bits += 7) {
      sum = sum.shiftLeft(7).add(counts.next());
    }
    return sum;
  }
}
