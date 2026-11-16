package irvine.oeis.a401;

import irvine.oeis.FilterSequence;
import irvine.oeis.a174.A174973;

/**
 * A401769 Averages of twin prime pairs that are 2-dense numbers A174973.
 * @author Sean A. Irvine
 */
public class A401769 extends FilterSequence {

  /** Construct the sequence. */
  public A401769() {
    super(1, new A174973(), k -> k.subtract(1).isProbablePrime() && k.add(1).isProbablePrime());
  }
}
