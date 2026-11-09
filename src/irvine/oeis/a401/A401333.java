package irvine.oeis.a401;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A401333 Numbers k such that the units digit of 5*k equals the tens digit of k^5.
 * @author Sean A. Irvine
 */
public class A401333 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401333() {
    super(1, 0, k -> (5 * k) % 10 == LongUtils.modPow(k, 5, 100) / 10);
  }
}

