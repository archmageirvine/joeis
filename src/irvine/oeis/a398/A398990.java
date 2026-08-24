package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398990 The binomial matrix of the partition numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398990 extends BinomialMatrixTransform {

  /** Construct the sequence. */
  public A398990() {
    super(0, Functions.PARTITIONS::z);
  }
}
