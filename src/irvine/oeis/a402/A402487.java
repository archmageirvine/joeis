package irvine.oeis.a402;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A402487 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A402487 extends CachedSequence {

  /** Construct the sequence. */
  public A402487() {
    super(2, Long.class, (self, n) -> Predicates.PRIME.is(n) ? Z.ONE : self.a(n / 2).add(self.a((n + 1) / 2)));
  }
}
