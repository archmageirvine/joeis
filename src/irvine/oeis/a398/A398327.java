package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398327 allocated for Daniel Holliday.
 * @author Sean A. Irvine
 */
public class A398327 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398327() {
    super(1, 0, k -> Z.TEN.shiftLeft(2 * k).subtract(1).divide(3).isProbablePrime());
  }
}

