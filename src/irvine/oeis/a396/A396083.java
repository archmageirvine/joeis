package irvine.oeis.a396;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396083 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A396083 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396083() {
    super(1, k -> {
      Z t = Z.valueOf(k);
      final HashSet<Z> seen = new HashSet<>();
      while (seen.add(t)) {
        t = Functions.SIGMA.z(t).subtract(t.multiply2()).abs();
        if (t.isZero()) {
          return true;
        }
      }
      return false;
    });
  }
}

