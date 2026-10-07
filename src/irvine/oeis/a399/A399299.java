package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A399299 Numbers that cannot be obtained by removing the first and last digits of a square.
 * @author Sean A. Irvine
 */
public class A399299 extends FilterNumberSequence {

  private static final char[] SUFFIX = {'0', '1', '4', '5', '6', '7', '9'};

  /** Construct the sequence. */
  public A399299() {
    super(1, k -> {
      final String s = String.valueOf(k);
      for (char pre = '1'; pre <= '9'; ++pre) {
        for (final char suf : SUFFIX) {
          if (Predicates.SQUARE.is(Long.parseLong(pre + s + suf))) {
            return false;
          }
        }
      }
      return true;
    });
  }
}
