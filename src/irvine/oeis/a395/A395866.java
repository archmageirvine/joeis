package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A395866 Numbers k such that k-5 and k+5 are prime and gcd(k, sigma(k)) is prime.
 * @author Sean A. Irvine
 */
public class A395866 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395866() {
    super(1, 18, 2, k-> Predicates.PRIME.is(k - 5) && Predicates.PRIME.is(k + 5) && Predicates.PRIME.is(Functions.GCD.z(k, Functions.SIGMA1.z(k))));
  }
}
