package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a122.A122045;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398998 The binomial matrix of the Euler secant numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398998 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A398998() {
    super(0, DirectSequence.create(new A122045())::a);
  }
}
