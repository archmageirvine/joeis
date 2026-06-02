package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A396203 allocated for Sajid Hussain.
 * @author Sean A. Irvine
 */
public class A396203 extends FilterSequence {

  /** Construct the sequence. */
  public A396203() {
    super(1, new A000040(), p -> p.bitLength() - 1 == Functions.NEXT_PRIME.z(p).subtract(p).longValue());
  }
}
