package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a179.A179502;

/**
 * A398403 Primes r such that r and (r^2+2)/3 are both terms of A179502.
 * @author Sean A. Irvine
 */
public class A398403 extends FilterSequence {

  /** Construct the sequence. */
  public A398403() {
    super(1, new A179502(), k -> {
      final Z r2 = k.square().add(2).divide(3).square();
      return Predicates.SEMIPRIME.is(r2) && Predicates.SEMIPRIME.is(r2.add(1)) && Predicates.SEMIPRIME.is(r2.add(2));
    });
  }
}
