package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000026;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398543 a(n) = A008683(A000026(n)), where A008683 is M\u00f6bius function mu, and A000026 is multiplicative with a(p^e) = p*e.
 * @author Sean A. Irvine
 */
public class A398543 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A398543() {
    super(1, new A000026(), Functions.MOBIUS::z);
  }
}
