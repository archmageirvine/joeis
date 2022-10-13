package irvine.oeis.base;

import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;

/**
 * Return the palindromic terms of another sequence.
 * @author Sean A. Irvine
 */
public class PalindromeSequence extends FilterSequence {

  /**
   * Construct the sequence.
   * @param seq underlying source of terms
   */
  public PalindromeSequence(final Sequence seq) {
    super(seq, PALINDROME);
  }
}
