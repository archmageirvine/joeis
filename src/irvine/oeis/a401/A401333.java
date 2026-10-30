package irvine.oeis.a401;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A401333 allocated for Yu-Wen Wang.
 * @author Sean A. Irvine
 */
public class A401333 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401333() {
    super(1, 0, k -> (5 * k) % 10 == LongUtils.modPow(k, 5, 100) / 10);
  }
}

