package irvine.oeis.a398;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A398710 Numbers &gt; 100 such that all the substrings of length = 2 are primes and are all distinct.
 * @author Sean A. Irvine
 */
public class A398710 extends FiniteSequence {

  private static void build(final TreeSet<Z> seq, final long k, final HashSet<Long> used) {
    if (k > 100) {
      seq.add(Z.valueOf(k));
    }
    final long j = k * 10;
    for (long d = 1; d < 10; d += 2) {
      final long i = j + d;
      final long r = i % 100;
      if (Predicates.PRIME.is(r) && used.add(r)) {
        build(seq, i, used);
        used.remove(r);
      }
    }
  }

  private static Collection<Z> build() {
    final TreeSet<Z> seq = new TreeSet<>();
    for (long k = 1; k < 10; ++k) {
      build(seq, k, new HashSet<>());
    }
    return seq;
  }

  /** Construct the sequence. */
  public A398710() {
    super(1, FINITE, build());
  }
}
