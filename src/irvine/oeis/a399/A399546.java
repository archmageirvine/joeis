package irvine.oeis.a399;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000079;
import irvine.util.Triple;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399546 allocated for Iurii Kirpichev.
 * @author Sean A. Irvine
 */
public class A399546 extends Sequence1 {

  private long mN = 0;
  private final Sequence mElements = new UnionSequence(new A000040(), new A000079().skip());
  private final LongDynamicLongArray mS = new LongDynamicLongArray();
  private final HashMap<Triple<Long>, Boolean> mCache = new HashMap<>();

  private long s(final long k) {
    while (k >= mS.length()) {
      mS.set(mS.length(), mElements.next().longValueExact());
    }
    return mS.get(k);
  }

  @Override
  public Z next() {
    ++mN;

    // Compute the smallest possible sum of n elements
    long m = 0;
    for (int j = 0; j < mN; ++j) {
      m += s(j);
    }

    // Perhaps we are already done?
    if (Predicates.PRIME.is(m)) {
      return Z.valueOf(m);
    }

    // Otherwise, we search
    long k = 0;
    while (true) {
      m = Functions.NEXT_PRIME.l(m);
      while (s(k) <= m) {
        ++k;
      }
      if (is(m, mN, k - 1)) {
        return Z.valueOf(m);
      }
    }
  }

  private boolean is(final long target, final long n, final long k) {
    if (n == 0) {
      return target == 0;
    }
    if (target <= 0 || k < 0 || n > k + 1) {
      return false;
    }
    final Triple<Long> key = new Triple<>(target, n, k);
    final Boolean cache = mCache.get(key);
    if (cache != null) {
      return cache;
    }
    // Try including s(k) in the sum
    if (s(k) <= target && is(target - s(k), n - 1, k - 1)) {
      mCache.put(key, Boolean.TRUE);
      return true;
    }
    final boolean res = is(target, n, k - 1);
    mCache.put(key, res);
    return res;
  }
}
