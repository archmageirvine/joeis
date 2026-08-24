package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399000 The binomial matrix of the Catalan numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399000 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A399000() {
    super(0, Functions.CATALAN::z);
  }
}
