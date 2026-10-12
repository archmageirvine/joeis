package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400643 Numbers k such that (k+1)^k-(k+2) is prime.
 * @author Sean A. Irvine
 */
public class A400643 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400643() {
    super(1, k -> Z.valueOf(k + 1).pow(k).subtract(k + 2).isProbablePrime());
  }
}
