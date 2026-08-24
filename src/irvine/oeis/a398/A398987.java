package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398987 The binomial matrix of the Lucas numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398987 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A398987() {
    super(0, Functions.LUCAS::z);
  }
}
