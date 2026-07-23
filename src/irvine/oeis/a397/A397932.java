package irvine.oeis.a397;

import irvine.oeis.FilterSequence;

/**
 * A397932 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397932 extends FilterSequence {

  /** Construct the sequence. */
  public A397932() {
    super(1, new A397221(), COMPOSITE);
  }
}
