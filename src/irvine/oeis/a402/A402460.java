package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A402460 allocated for Abhiram Binu.
 * @author Sean A. Irvine
 */
public class A402460 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A402460() {
    super(1, k -> Functions.DIGIT_SUM.l(k / 10) < k % 10);
  }
}
