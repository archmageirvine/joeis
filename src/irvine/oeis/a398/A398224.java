package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398224 Numbers k such that there is a square bigger than k among divisors of triangular(k), and a triangular number bigger than k among divisors of k^2.
 * @author Sean A. Irvine
 */
public class A398224 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398224() {
    super(1, k -> {
      final Z t = Functions.TRIANGULAR.z(k);
      final Z s = t.divide(Functions.CORE.l(t));
      if (s.compareTo(k) > 0) {
        for (final Z d : Jaguar.factor(k * k).divisors()) {
          if (d.compareTo(k) > 0 && Predicates.TRIANGULAR.is(d)) {
            return true;
          }
        }
      }
      return false;
    });
  }
}
