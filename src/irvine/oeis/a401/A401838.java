package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401838 allocated for Pieter Post.
 * @author Sean A. Irvine
 */
public class A401838 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401838() {
    super(1, n -> {
      final Z t = Functions.TRIANGULAR.z(n).add(1);
      for (final Z d : Jaguar.factor(t).divisors()) {
        final Z c = t.divide(d);
        if (!c.equals(d) && c.max(d).compareTo(n) < 0) {
          return true;
        }
      }
      return false;
    });
  }
}
