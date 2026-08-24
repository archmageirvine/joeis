package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398999 The binomial matrix of the factorial numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398999 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A398999() {
    super(0, Functions.FACTORIAL::z);
  }
}
