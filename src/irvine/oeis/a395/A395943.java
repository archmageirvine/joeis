package irvine.oeis.a395;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395943 Number of ways to partition an n X n square
 * @author Sean A. Irvine
 */
public class A395943 extends Sequence1 {

  private int mN = 0;
  private Z mFull;
  private int[] mPrimes;
  private final Map<Z, Long> mMemo = new HashMap<>();

  /**
   * Recursive memoized search.
   * @param board occupancy bitboard
   * @param pos lower bound on next empty position
   * @return number of completions
   */
  private long search(final Z board, int pos) {
    final Long cached = mMemo.get(board);
    if (cached != null) {
      return cached;
    }
    // completely tiled
    if (board.equals(mFull)) {
      return 1;
    }

    while (board.testBit(pos)) {
      ++pos;
    }

    final int r = pos / mN;
    final int c = pos % mN;
    long total = 0;

    // Try every prime length that can fit
    for (final int p : mPrimes) {
      // Horizontal placement
      if (c + p <= mN) {
        final Z mask = Z.ONE.shiftLeft(p).subtract(1).shiftLeft(pos);
        if (board.and(mask).isZero()) {
          total += search(board.or(mask), pos + p);
        }
      }
      // Vertical placement
      if (r + p <= mN) {
        Z mask = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(pos + k * mN);
        }
        if (board.and(mask).isZero()) {
          total += search(board.or(mask), pos + 1);
        }
      }
    }

    mMemo.put(board, total);
    return total;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }

    // Set up for n, clear the memory, determine primes
    mMemo.clear();
    mFull = Z.ONE.shiftLeft((long) mN * mN).subtract(1);
    mPrimes = new int[Functions.PRIME_PI.i(mN)];
    mPrimes[0] = 2;
    for (int k = 1; k < mPrimes.length; ++k) {
      mPrimes[k] = Functions.NEXT_PRIME.i(mPrimes[k - 1]);
    }

    // board occupancy -> number of completions
    return Z.valueOf(search(Z.ZERO, 0));
  }

}
