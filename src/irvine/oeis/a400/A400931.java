package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400931 Numbers all of whose divisors are undulating numbers (A355301).
 * @author Sean A. Irvine
 */
public class A400931 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400931() {
    super(1, k -> {
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!Predicates.DIGIT_UNDULATE.is(d)) {
          return false;
        }
      }
      return true;
    });
  }
}

