package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400984 Numbers k &gt; 1 whose trajectory under the Collatz map A014682 contains k+1.
 * @author Sean A. Irvine
 */
public class A400984 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400984() {
    super(1, 2, k -> {
      Z m = Z.valueOf(k);
      final Z m1 = Z.valueOf(k + 1);
      final HashSet<Z> seen = new HashSet<>();
      while (seen.add(m)) {
        if (m.equals(m1)) {
          return true;
        }
        m = m.isEven() ? m.divide2() : m.multiply(3).add(1).divide2();
      }
      return false;
    });
  }
}
