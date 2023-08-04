package irvine.oeis.prime;

import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A {@link FilterPositionSequence} consisting of the indices (positions) of the primes in the underlying sequence.
 * @author Georg Fischer
 */
public class PrimePositionSubsequence extends FilterPositionSequence {

  /**
   * Create a predicate to that tests if elements divided by a constant are prime.
   * @param div divisor
   * @return true if element over the divisor is prime.
   */
  public static Predicate<Z> primeDivTest(final Z div) {
    return term -> {
      final Z[] quotRem = term.divideAndRemainder(div);
      return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
    };
  }

  /**
   * Create a predicate to that tests if elements divided by a constant are prime.
   * @param div divisor
   * @return true if element over the divisor is prime.
   */
  public static Predicate<Z> primeDivTest(final long div) {
    return primeDivTest(Z.valueOf(div));
  }

  /**
   * Creates a sequence of the positions of primes in another sequence.
   * @param seq underlying sequence
   * @param start index of first term of the underlying sequence.
   */
  public PrimePositionSubsequence(final Sequence seq, final int start) {
    super(start, seq, Z::isProbablePrime);
  }

  /**
   * Creates a sequence of the primes in the sequence defined by a holonomic recurrence.
   * @param matrix    polynomials as coefficients of <code>n^i, i=0..m</code>,
   *                  as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   *                  in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   *                  The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   * @param start index of first term of the underlying sequence.
   */
  public PrimePositionSubsequence(final String matrix, final String initTerms, final int start) {
    this(new HolonomicRecurrence(0, matrix, initTerms, 0), start);
  }

  /**
   * Creates a sequence of the primes in the sequence defined by a holonomic recurrence.
   * @param matrix    polynomials as coefficients of <code>n^i, i=0..m</code>,
   *                  as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   *                  in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   *                  The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   * @param start index of first term of the underlying sequence.
   */
  public PrimePositionSubsequence(final String matrix, final String initTerms, final int start, final Predicate<Z> predicate) {
    super(start, new HolonomicRecurrence(0, matrix, initTerms, 0), predicate);
  }
}
