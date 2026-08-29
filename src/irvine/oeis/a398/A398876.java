package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398876 Primes added to a set starting with {2, 3} by considering successive even numbers k and, if k is not the sum of two members of the set, adjoining k - p, where p is the earliest-added member for which k - p is prime.
 * @author Sean A. Irvine
 */
public class A398876 extends CachedSequence {

  private HashSet<Long> mSums = new HashSet<>();
  private long mLeastUnused = 8;

  /** Construct the sequence. */
  public A398876() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    if (nn.isOne()) {
      return Z.TWO;
    }
    final long n = nn.longValue();
    if (n == 2) {
      return Z.THREE;
    }
    while (mSums.remove(mLeastUnused)) {
      mLeastUnused += 2;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mSums.contains(k)) {
        for (long j = 2; j < n; ++j) {
          final long v = k - a(j).longValueExact();
          if (Predicates.PRIME.is(v)) {
            for (long i = 2; i < n; ++i) {
              mSums.add(v + a(i).longValueExact());
            }
            mSums.add(2 * v);
            return Z.valueOf(v);
          }
        }
      }
      k += 2;
    }
  }
}
