package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A399286 Composite numbers whose number of digits and the number of digits in their largest prime factor are the same.
 * @author Sean A. Irvine
 */
public class A399286 extends FilterSequence {

  /** Construct the sequence. */
  public A399286() {
    super(1, new A002808(), k -> Functions.DIGIT_LENGTH.l(k) == Functions.DIGIT_LENGTH.l(Functions.GPF.z(k)));
  }
}
