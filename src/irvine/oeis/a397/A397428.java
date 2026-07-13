package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A397428 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397428 extends FilterSequence {

  /** Construct the sequence. */
  public A397428() {
    super(1, new A000040(), k -> CR.PHI.multiply(k).floor().isProbablePrime() && CR.PHI.multiply(k.square()).floor().isProbablePrime());
  }
}
