package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A402229 a(n) is the largest n-digit number from which no earlier term can be obtained by deleting digits.
 * @author Sean A. Irvine
 */
public class A402229 extends Sequence1 {

  // After Alper Ferudun

  private final List<String> mTerms = new ArrayList<>();
  private int mLength = 0;
  private boolean mDone = false;

  /**
   * Test whether the current prefix contains an earlier term.
   * @param prefix current prefix
   * @return true if the prefix is forbidden
   */
  private boolean forbidden(final String prefix) {
    for (final String t : mTerms) {
      if (StringUtils.isSubsequence(t, prefix)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Descending depth-first search for the largest admissible word.
   * @param prefix current prefix
   * @return a completed word, or null if none exists
   */
  private String largest(final String prefix) {
    if (forbidden(prefix)) {
      return null;
    }
    if (prefix.length() == mLength) {
      return prefix;
    }
    for (char d = '9'; d >= '0'; --d) {
      if (prefix.isEmpty() && d == '0') {
        continue;
      }
      final String word = largest(prefix + d);
      if (word != null) {
        return word;
      }
    }
    return null;
  }

  @Override
  public Z next() {
    if (mDone) {
      return null;
    }
    ++mLength;
    final String term = largest("");
    if (term == null) {
      mDone = true;
      return null;
    }
    mTerms.add(term);
    return new Z(term);
  }
}
