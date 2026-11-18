package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401837 Numbers k such that two distinct integers can be removed from 1 through k so that the sum of their cubes equals the sum of the remaining integers.
 * @author Sean A. Irvine
 */
public class A401837 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401837() {
    super(1, k -> {
      final Z t = Functions.TRIANGULAR.z(k);
      for (long a = 2; a <= k; ++a) {
        final Z a3 = Z.valueOf(a).pow(3).add(a);
        if (a3.compareTo(t) > 0) {
          break;
        }
        for (long b = 1; b < a; ++b) {
          final Z u = a3.add(Z.valueOf(b).pow(3)).add(b);
          final int c = u.compareTo(t);
          if (c >= 0) {
            if (c == 0) {
              return true;
            }
            break;
          }
        }
      }
      return false;
    });
  }
}
