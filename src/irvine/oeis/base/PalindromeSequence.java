package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * Return the palindromic terms of another sequence.
 * @author Sean A. Irvine
 */
public class PalindromeSequence implements Sequence {

  private final Sequence mSeq;

  /**
   * Construct the sequence.
   * @param seq underlying source of terms
   */
  public PalindromeSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
