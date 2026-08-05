package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396925 Numbers k which have a divisor d such that d^2 &lt; k and phi(d) = phi(k/d), where phi = A000010.
 * @author Sean A. Irvine
 */
public class A396925 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396925() {
    super(1, k -> {
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (d.square().compareTo(k) < 0 && Functions.PHI.l(d) == Functions.PHI.l(k / d.longValueExact())) {
          return true;
        }
      }
      return false;
    });
  }
}

