package irvine.oeis.a399;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A399563 allocated for Yu-Wen Wang.
 * @author Sean A. Irvine
 */
public class A399563 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399563() {
    super(1, 0, k -> LongUtils.modPow(k, 2, 100) / 10 == (2 * k) % 10);
  }
}
