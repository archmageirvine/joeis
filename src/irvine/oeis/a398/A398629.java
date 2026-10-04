package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A398629 Numbers that can be obtained by removing the first and last digits of a square.
 * @author Sean A. Irvine
 */
public class A398629 extends FilterNumberSequence {

  private static final char[] SUFFIX = {'0', '1', '4', '5', '6', '7'};

  /** Construct the sequence. */
  public A398629() {
    super(1, 0, k -> {
      final String s = String.valueOf(k);
      for (char pre = '1'; pre <= '9'; ++pre) {
        for (final char suf : SUFFIX) {
          if (Predicates.SQUARE.is(Long.parseLong(pre + s + suf))) {
            return true;
          }
        }
      }
      return false;
    });
  }
}
