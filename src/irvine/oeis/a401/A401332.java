package irvine.oeis.a401;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A394051.
 * @author Sean A. Irvine
 */
public class A401332 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401332() {
    super(1, 0, k -> (3 * k) % 10 == LongUtils.modPow(k, 3, 100) / 10);
  }
}

