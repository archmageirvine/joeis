package irvine.oeis.a398;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a002.A002378;
import irvine.oeis.a332.A332785;

/**
 * A398752 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A398752 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A398752() {
    super(new A332785(), new A002378());
  }
}
