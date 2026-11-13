package irvine.oeis.a400;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002407;

/**
 * A400305 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A400305 extends FilterSequence {

  /** Construct the sequence. */
  public A400305() {
    super(1, new A002407(), p -> p.subtract(2).isProbablePrime());
  }
}
