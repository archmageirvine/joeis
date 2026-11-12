package irvine.oeis.a400;

import irvine.oeis.FilterSequence;
import irvine.oeis.a238.A238524;

/**
 * A400848 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A400848 extends FilterSequence {

  /** Construct the sequence. */
  public A400848() {
    super(1, new A238524(), k -> k.subtract(1).isProbablePrime() && k.add(1).isProbablePrime());
  }
}
