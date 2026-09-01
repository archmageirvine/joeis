package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399334 The binomial matrix of the middle binomial coefficients, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399334 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A399334() {
    super(0, k -> Binomial.binomial(k, k / 2));
  }
}
