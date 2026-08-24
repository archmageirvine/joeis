package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398995 The binomial matrix of the Pell numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398995 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A398995() {
    super(0, k -> Functions.PELL.z(k + 1));
  }
}
