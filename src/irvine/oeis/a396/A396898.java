package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A396898 Indices k such that prime(k) + 2*prime(k+1) is prime.
 * @author Sean A. Irvine
 */
public class A396898 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A396898() {
    super(1, new A000040(), p -> Functions.NEXT_PRIME.z(p).multiply2().add(p).isProbablePrime());
  }
}
