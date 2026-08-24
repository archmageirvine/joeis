package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398993 The binomial matrix of the Bell numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398993 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A398993() {
    super(0, Functions.BELL::z);
  }
}
