package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399001 The binomial matrix of the Fibonacci numbers, square array read by upward antidiagonals.
 * @author Sean A. Irvine
 */
public class A399001 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A399001() {
    super(0, Functions.FIBONACCI::z);
  }
}
