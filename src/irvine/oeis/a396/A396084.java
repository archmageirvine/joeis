package irvine.oeis.a396;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396084 Numbers k whose orbit under k -&gt; |sigma(k) - 2*k| avoids 0 and 1.
 * @author Sean A. Irvine
 */
public class A396084 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396084() {
    super(1, k -> {
      Z t = Z.valueOf(k);
      final HashSet<Z> seen = new HashSet<>();
      while (seen.add(t)) {
        t = Functions.SIGMA.z(t).subtract(t.multiply2()).abs();
        if (t.isZero() || t.isOne()) {
          return false;
        }
      }
      return true;
    });
  }
}

