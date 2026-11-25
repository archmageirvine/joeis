
package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402406 allocated for Jacek Szymkowiak.
 * @author Sean A. Irvine
 */
public class A402406 extends Sequence1 {

  private int mN = 0;

  // Small primes used for the modular sieve.
  private static final int[] PRIMES = {3, 5, 7, 11, 13, 17, 19};

  /**
   * Update a subset-sum residue mask by adding a generator.
   * @param mask old mask
   * @param a generator modulo p
   * @param p modulus
   * @return new mask
   */
  private int rotate(final int mask, final int a, final int p) {
    if (a == 0) {
      return mask;
    }
    final int all = (1 << p) - 1;
    final int shifted = ((mask << a) | (mask >>> (p - a))) & all;
    return mask | shifted;
  }

  /**
   * Recursive generator search.
   * @param n dimension
   * @param k number of generators already selected
   * @param last previous generator
   * @param rem remaining sum of generators
   * @param m initial vertex
   * @param step minimum increment between generators
   * @param offsets current subset sums
   * @param used set of current subset sums
   * @param forbidden forbidden residues for each small prime
   * @param masks current subset-sum residue masks
   * @return true if a solution exists
   */
  private boolean search(final int n, final int k, final Z last, final Z rem, final Z m, final int step, final List<Z> offsets, final Set<Z> used, final int[] forbidden, final int[] masks) {

    if (k == n) {
      return rem.isZero();
    }

    final int r = n - k;
    final Z rr = Z.valueOf(r);
    final Z triangular = rr.multiply(rr.subtract(1)).divide2();
    final Z stepZ = Z.valueOf(step);
    // The next generator must be at least last + step.
    Z s = last.add(step);
    // Try generators in increasing order.
    while (rr.multiply(s).add(stepZ.multiply(triangular)).compareTo(rem) <= 0) {
      // First apply the modular sieve.
      final int[] nextMasks = new int[PRIMES.length];
      boolean ok = true;
      for (int j = 0; j < PRIMES.length; ++j) {
        final int p = PRIMES[j];
        if (forbidden[j] < 0) {
          nextMasks[j] = masks[j];
          continue;
        }

        final int a = s.mod(Z.valueOf(p)).intValue();
        final int mask = rotate(masks[j], a, p);
        // Reject if a forbidden residue is now reachable.
        if ((mask & (1 << forbidden[j])) != 0) {
          ok = false;
          break;
        }
        nextMasks[j] = mask;
      }

      if (ok) {
        // Construct the translated subset sums.
        final List<Z> added = new ArrayList<>();
        for (final Z t : offsets) {
          final Z v = t.add(s);
          // The new translated set must be disjoint from the old one.
          if (used.contains(v)) {
            ok = false;
            break;
          }
          // Every new vertex must be prime.
          if (!Predicates.PRIME.is(m.add(v))) {
            ok = false;
            break;
          }
          added.add(v);
        }

        if (ok) {
          // Add the new layer.
          for (final Z v : added) {
            used.add(v);
            offsets.add(v);
          }
          if (search(n, k + 1, s, rem.subtract(s), m, step, offsets, used, forbidden, nextMasks)) {
            return true;
          }
          // Backtrack.
          for (int j = added.size() - 1; j >= 0; --j) {
            final Z v = added.get(j);
            used.remove(v);
            offsets.remove(offsets.size() - 1);
          }
        }
      }
      s = s.add(step);
    }
    return false;
  }

  /*
   * Test whether X and m admit an n-dimensional prime Hilbert cube.
   */
  private boolean test(final int n, final Z x, final Z m) {

    // For n >= 2 all generators must be even.
    final int step = n == 1 ? 1 : 2;

    // Compute forbidden residues modulo the small primes.
    // -1 means that the prime is not smaller than m.
    final int[] forbidden = new int[PRIMES.length];
    final int[] masks = new int[PRIMES.length];

    for (int j = 0; j < PRIMES.length; ++j) {
      final int p = PRIMES[j];
      masks[j] = 1; // Initially only subset sum zero is reachable.
      if (m.compareTo(Z.valueOf(p)) > 0) {
        final int residue = m.mod(Z.valueOf(p)).intValue();
        forbidden[j] = (p - residue) % p;
      } else {
        forbidden[j] = -1;
      }
    }

    final List<Z> offsets = new ArrayList<>();
    offsets.add(Z.ZERO);
    final Set<Z> used = new HashSet<>();
    used.add(Z.ZERO);
    return search(n, 0, Z.ZERO, x.subtract(m), m, step, offsets, used, forbidden, masks);
  }

  @Override
  public Z next() {
    ++mN;
    Z x = Z.TWO;
    while (true) {
      x = Functions.NEXT_PRIME.z(x);
      // For n >= 2, m must be an odd prime.
      Z m = Z.valueOf(mN == 1 ? 1 : 2);
      while (true) {
        m = Functions.NEXT_PRIME.z(m);
        if (m.compareTo(x) >= 0) {
          break;
        }
        if (test(mN, x, m)) {
          return x;
        }
      }
    }
  }
}

