package irvine.oeis.a398;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A398545 allocated for Soroosh Hemmati.
 * @author Sean A. Irvine
 */
public class A398545 extends Sequence1 {

  /*
   * Candidate primes.  These are extended dynamically when
   * necessary; there is deliberately no fixed upper bound.
   */
  private final DynamicIntArray mPrimes = new DynamicIntArray();

  // Current upper bound on the candidate primes.
  private int mLimit = 100;

  /*
   * The primes r for which congruence conditions are imposed.
   * These are precisely the primes 3 <= r <= n.
   */
  private int[] mR;

  /*
   * kill[d][r] is the mask of candidate primes p such that
   * p == residue (mod r).
   */
  private Z[][] mKill = null;
  private int mN = 0;

  /*
   * Make sure mPrimes contains all primes <= limit.
   */
  private void extendPrimes(final int limit) {
    if (mPrimes.length() == 0) {
      mPrimes.set(0, 3);
    }
    while (mPrimes.get(mPrimes.length() - 1) <= limit) {
      mPrimes.set(mPrimes.length(),
        Functions.NEXT_PRIME.i(mPrimes.get(mPrimes.length() - 1)));
    }
  }

  /*
   * Construct the residue masks for the current candidate-prime list.
   */
  private void makeMasks(final int n) {
    final int nr = Math.max(0, Functions.PRIME_PI.i(n) - 1);
    mR = new int[nr];
    mKill = new Z[nr][];

    int d = 0;
    for (int k = 0; k < mPrimes.length(); ++k) {
      final int r = mPrimes.get(k);
      if (r > n) {
        break;
      }
      mR[d] = r;
      mKill[d] = new Z[r];
      Arrays.fill(mKill[d], Z.ZERO);
      ++d;
    }

    /*
     * For every candidate prime p and every modulus r, put p
     * into the mask corresponding to p mod r.
     */
    for (int i = 0; i < mPrimes.length(); ++i) {
      final int p = mPrimes.get(i);
      for (int d2 = 0; d2 < nr; ++d2) {
        final int r = mR[d2];
        final int residue = p % r;
        mKill[d2][residue] =
          mKill[d2][residue].setBit(i);
      }
    }
  }

  /*
   * Return the n-th surviving prime, or 0 if fewer than n candidates survive.
   */
  private int nthPrime(final Z alive, final int n) {
    Z x = alive;
    for (int k = 0; k < n; ++k) {
      if (x.signum() == 0) {
        return 0;
      }
      final int i = x.getLowestSetBit();
      if (k == n - 1) {
        return mPrimes.get(i);
      }
      x = x.clearBit(i);
    }
    return 0;
  }

  /*
   * Obtain an immediate upper bound by choosing residue 0 for every modulus.
   * Since all candidate primes are prime, choosing residue 0
   * modulo r removes only the candidate p = r.
   */
  private int zeroResidueBound(final int n) {
    Z alive = Z.ONE.shiftLeft(mPrimes.length()).subtract(Z.ONE);

    for (int d = 0; d < mR.length; ++d) {
      alive = alive.andNot(mKill[d][0]);
    }

    return nthPrime(alive, n);
  }

  /*
   * Depth-first search.
   *
   * best[0] contains the best n-th surviving prime found so far.
   *
   * Residues are tried in descending order of the number of
   * currently surviving candidates which they eliminate.
   * This is deliberately computed at each node, since the
   * usefulness of a residue changes as candidates are removed.
   */
  private void dfs(final int d, final Z alive, final int n, final int[] best) {

    /*
     * Find the current n-th survivor.
     * If it cannot beat best, the entire branch can be discarded.
     */
    final int q = nthPrime(alive, n);

    if (q == 0 || q >= best[0]) {
      return;
    }

    // All congruence conditions have now been imposed
    if (d == mR.length) {
      best[0] = q;
      return;
    }

    final int r = mR[d];

    /*
     * Rank residue classes according to how many currently
     * surviving candidates they eliminate.
     * residueOrder[0] is the most promising residue.
     */
    final int[] residueOrder = new int[r];
    final int[] score = new int[r];

    for (int residue = 0; residue < r; ++residue) {
      residueOrder[residue] = residue;
      score[residue] = alive.and(mKill[d][residue]).bitCount();
    }

    /*
     * r is small for the moduli involved here, so insertion sort
     * is preferable to allocating comparator objects.
     */
    for (int i = 1; i < r; ++i) {
      final int residue = residueOrder[i];
      final int s = score[residue];

      int j = i - 1;
      while (j >= 0 && score[residueOrder[j]] < s) {
        residueOrder[j + 1] = residueOrder[j];
        --j;
      }

      residueOrder[j + 1] = residue;
    }

    /*
     * Try the most destructive residue first.  Finding a good
     * answer early is valuable because it tightens best[0].
     */
    for (final int residue : residueOrder) {
      dfs(d + 1,
        alive.andNot(mKill[d][residue]),
        n,
        best);
    }
  }

  /*
   * Compute a(n), using the current candidate-prime limit.
   */
  private int search(final int n) {
    extendPrimes(mLimit);
    makeMasks(n);
    final Z alive = Z.ONE.shiftLeft(mPrimes.length()).subtract(Z.ONE);
    // We now have a guaranteed initial upper bound.
    final int bound = zeroResidueBound(n);
    if (bound == 0) {
      return 0;
    }
    final int[] best = {bound};
    dfs(0, alive, n, best);
    return best[0];
  }

  /*
   * The candidate-prime bound is increased until the answer is
   * certified.  Once best <= mLimit, every prime that could
   * possibly improve best has already been included.
   */
  private int compute(final int n) {
    while (true) {
      final int best = search(n);
      if (best != 0 && best <= mLimit) {
        return best;
      }
      /*
       * There were not enough candidate primes in the current
       * range to obtain an upper bound.  Increase the range.
       */
      mLimit *= 2;
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(compute(++mN));
  }
}
