package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A398712 Numbers k such that all of the digits of k are not represented in the Collatz pathway from n to 1.
 * @author Sean A. Irvine
 */
public class A398712 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398712() {
    super(1, k -> {
      final int[] cnts = ZUtils.digitCounts(k);
      final int[] c = new int[cnts.length];
      Z t = Z.valueOf(k);
      while (!t.isOne()) {
        t = Functions.COLLATZ.z(t);
        final int[] s = ZUtils.digitCounts(t);
        boolean done = true;
        for (int j = 0; j < s.length; ++j) {
          c[j] += s[j];
          if (c[j] < cnts[j]) {
            done = false;
          }
        }
        if (done) {
          return false;
        }
      }
      return true;
    });
  }
}
