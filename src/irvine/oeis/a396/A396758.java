package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396758 Larger term of pairs of consecutive primes of the form p, p+6 where both primes eventually reach a value of 1 under iteration of the sums of the squares of their digits and the first iteration of both terms are also prime.
 * @author Sean A. Irvine
 */
public class A396758 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396758() {
    super(1, new A396234(), Z.SIX::add);
  }
}
