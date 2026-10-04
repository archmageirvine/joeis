package irvine.oeis.a400;

import irvine.oeis.FilterNumberSequence;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A400375 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400375() {
    super(1, 0, k -> {
      final String s = String.valueOf(k);
      long sum = 0;
      for (int j = 0; j < s.length(); ++j) {
        final int c = s.charAt(j) - '0';
        if (sum - c >= 0) {
          sum -= c;
        } else {
          sum += c;
        }
      }
      return sum == 0;
    });
  }
}
