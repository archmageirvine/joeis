package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a090.A090885;

/**
 * A399967 Positive integers k such that the sum of the squares of the exponents in the prime factorization of k is a square.
 * @author Sean A. Irvine
 */
public class A399967 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A399967() {
    super(1, 1, new A090885(), Predicates.SQUARE::is);
  }
}
