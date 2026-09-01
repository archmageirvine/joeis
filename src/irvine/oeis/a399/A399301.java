package irvine.oeis.a399;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a398.A398545;

/**
 * A399301 allocated for Soroosh Hemmati.
 * @author Sean A. Irvine
 */
public class A399301 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A399301() {
    super(1, new A000040(), new A398545());
  }
}
