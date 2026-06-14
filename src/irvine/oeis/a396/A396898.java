package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A396898 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A396898 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A396898() {
    super(1, new A000040(), p -> Functions.NEXT_PRIME.z(p).multiply2().add(p).isProbablePrime());
  }
}
