package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398899 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A398899 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398899() {
    super(1, k -> {
      final long omega = Functions.BIG_OMEGA.l(k);
      for (final Z dd : Jaguar.factor(k).divisors()) {
        final long d = dd.longValue();
        if (omega == Functions.BIG_OMEGA.l(k / d + d)) {
          return true;
        }
      }
      return false;
    });
  }
}
