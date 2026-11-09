package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A398220 Minimum diameter of an admissible nondegenerate Hilbert cube of dimension n: least s(1) + ... + s(n) over positive integers s(1) &lt; ... &lt; s(n) such that all 2^n subset sums are distinct and, for every prime p, they miss at least one residue class modulo p.
 * @author Sean A. Irvine
 */
public class A398220 extends Sequence1 {

  // After Jacek Szymkowiak

  private int mN = 0;
  private final DynamicIntArray mPrimes = new DynamicIntArray();
  private long mP = 2;

  /**
   * Test whether every prime modulus has at least one missing residue.
   * @param sums subset sums
   * @return true if admissible
   */
  private boolean admissible(final Set<Long> sums) {
    for (int k = 0; k < mPrimes.length(); ++k) {
      final int p = mPrimes.get(k);
      final boolean[] seen = new boolean[p];
      int count = 0;
      for (final long x : sums) {
        final int r = (int) (x % p);
        if (!seen[r]) {
          seen[r] = true;
          if (++count == p) {
            return false;
          }
        }
      }
    }
    return true;
  }

  /**
   * Add x to every existing subset sum.
   * @param sums existing subset sums
   * @param x value to add
   * @return the new subset sums, or null if there is a collision
   */
  private Set<Long> extend(final Set<Long> sums, final long x) {
    final Set<Long> added = new HashSet<>();
    for (final long s : sums) {
      final long t = s + x;
      if (sums.contains(t)) {
        return null;
      }
      added.add(t);
    }
    return added;
  }

  private boolean search(final int n, final int k, final long lo, final long rem, final Set<Long> sums) {
    if (k == n - 1) {
      if (rem < lo) {
        return false;
      }
      final Set<Long> added = extend(sums, rem);
      if (added == null) {
        return false;
      }
      final Set<Long> all = new HashSet<>(sums);
      all.addAll(added);
      return admissible(all);
    }

    final int left = n - 1 - k;
    final long triangular = (long) left * (left + 1) / 2;
    final long max = (rem - triangular) / (left + 1);

    for (long x = lo; x <= max; ++x) {
      final Set<Long> added = extend(sums, x);
      if (added == null) {
        continue;
      }
      final Set<Long> all = new HashSet<>(sums);
      all.addAll(added);
      if (admissible(all) && search(n, k + 1, x + 1, rem - x, all)) {
        return true;
      }
    }
    return false;
  }

  private boolean search(final int n, final long d) {
    final Set<Long> sums = new HashSet<>();
    sums.add(0L);
    return search(n, 0, 1, d, sums);
  }

  @Override
  public Z next() {
    ++mN;
    while (mP <= 1L << mN) {
      mPrimes.set(mPrimes.length(), (int) mP);
      mP = Functions.NEXT_PRIME.l(mP);
    }
    long d = 1;
    while (!search(mN, d)) {
      ++d;
    }
    return Z.valueOf(d);
  }
}
