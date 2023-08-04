package irvine.oeis.prime;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A sequence consisting of the primes in the underlying sequence.
 * @author Georg Fischer
 */
public class PrimeSubsequence extends FilterSequence {

  /**
   * Creates a sequence of the primes in another sequence.
   * @param seq underlying sequence
   */
  public PrimeSubsequence(final Sequence seq) {
    super(1, seq, Z::isProbablePrime);
  }

  /**
   * Creates a sequence of the primes in another sequence.
   * @param seq underlying sequence
   * @param start ignored, for compatibility
   */
  public PrimeSubsequence(final Sequence seq, final int start) {
    super(1, seq, Z::isProbablePrime);
  }

  /**
   * Creates a sequence of the primes in the sequence defined by a holonomic recurrence.
   * @param matrix    polynomials as coefficients of <code>n^i, i=0..m</code>,
   *                  as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   *                  in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   *                  The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   */
  public PrimeSubsequence(final String matrix, final String initTerms) {
    this(new HolonomicRecurrence(0, matrix, initTerms, 0), 0);
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
  public PrimeSubsequence(final String matrix, final String initTerms, final int start) {
    this(new HolonomicRecurrence(0, matrix, initTerms, 0), start);
  }
}
