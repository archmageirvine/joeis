package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397143 allocated for Tomas Laris.
 * @author Sean A. Irvine
 */
public class A397143 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397143() {
    super(1, 14979, k -> Functions.SYNDROME.i(Functions.REVERSE.z(k).multiply(k)) == 0b1111111111);
  }
}
