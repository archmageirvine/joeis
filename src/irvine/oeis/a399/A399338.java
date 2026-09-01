package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399338 The binomial matrix of the double factorials, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399338 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A399338() {
    super(0, Functions.MULTIFACTORIAL::z);
  }
}
