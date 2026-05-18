package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395942 Number of ways to partition an n X n square
 * into 1 X p rectangles, where p is prime,
 * counted up to rotations/reflections of the square.
 *
 * Uses:
 *  - occupancy-only memoization
 *  - rectangle id board only for leaf symmetry test
 *  - first-empty-cell branching
 *
 * @author Sean A. Irvine
 */
public class A395942 extends Sequence1 {

  private int mN = 0;
  private Z mFull;
  private int[] mPrimes;

  /**
   * Compare transformed board against original.
   * Returns:
   *   negative if transform < original
   *   positive if transform > original
   *   zero if equal
   *
   * Uses canonical relabeling during comparison.
   *
   * @param b board
   * @param transform transform number
   * @return comparison
   */
  private int compareTransform(final int[][] b, final int transform) {

    final int[] mapA = new int[mN * mN + 1];
    final int[] mapB = new int[mN * mN + 1];

    int nextA = 1;
    int nextB = 1;

    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {

        //
        // Original cell
        //
        int a = b[r][c];

        if (mapA[a] == 0) {
          mapA[a] = nextA++;
        }

        a = mapA[a];

        //
        // Transformed coordinates
        //
        final int tr;
        final int tc;

        switch (transform) {

          case 0:
            tr = r;
            tc = c;
            break;

          case 1: // rot90
            tr = mN - 1 - c;
            tc = r;
            break;

          case 2: // rot180
            tr = mN - 1 - r;
            tc = mN - 1 - c;
            break;

          case 3: // rot270
            tr = c;
            tc = mN - 1 - r;
            break;

          case 4: // reflect vertical
            tr = r;
            tc = mN - 1 - c;
            break;

          case 5:
            tr = mN - 1 - c;
            tc = mN - 1 - r;
            break;

          case 6:
            tr = mN - 1 - r;
            tc = c;
            break;

          case 7:
            tr = c;
            tc = r;
            break;

          default:
            throw new IllegalStateException();
        }

        int d = b[tr][tc];

        if (mapB[d] == 0) {
          mapB[d] = nextB++;
        }

        d = mapB[d];

        //
        // Lexicographic comparison
        //
        if (d < a) {
          return -1;
        }

        if (d > a) {
          return 1;
        }
      }
    }

    return 0;
  }

  private boolean isCanonical(final int[][] board) {
      for (int t = 1; t < 8; ++t) {
        if (compareTransform(board, t) < 0) {
          return false;
        }
      }
      return true;
    }

  /**
   * Recursive search.
   * @param board occupancy board
   * @param ids rectangle ids
   * @param pos lower bound for next empty position
   * @param nextId next rectangle id
   * @return number of completions
   */
  private long search(final Z board,
                      final int[][] ids,
                      int pos,
                      final int nextId) {

    // Completely tiled
    if (board.equals(mFull)) {
      return isCanonical(ids) ? 1 : 0;
    }

    while (board.testBit(pos)) {
      ++pos;
    }

    final int r = pos / mN;
    final int c = pos % mN;

    long total = 0;

    // Try every prime length
    for (final int p : mPrimes) {

      // Horizontal
      if (c + p <= mN) {
        final Z mask = Z.valueOf((1L << p) - 1).shiftLeft(pos);

        if (board.and(mask).isZero()) {
          for (int j = 0; j < p; ++j) {
            ids[r][c + j] = nextId;
          }

//          if (isCanonical(ids)) {
            total += search(board.or(mask), ids, pos + p, nextId + 1);
//          }

          for (int j = 0; j < p; ++j) {
            ids[r][c + j] = 0;
          }
        }
      }

      // Vertical
      if (r + p <= mN) {
        Z mask = Z.ZERO;

        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(pos + k * mN);
        }

        if (board.and(mask).isZero()) {

          for (int k = 0; k < p; ++k) {
            ids[r + k][c] = nextId;
          }

//          if (isCanonical(ids)) {
            total += search(board.or(mask), ids, pos + 1, nextId + 1);
//          }

          for (int k = 0; k < p; ++k) {
            ids[r + k][c] = 0;
          }
        }
      }
    }
    return total;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }

    // Set up for n, determine primes
    mFull = Z.ONE.shiftLeft((long) mN * mN).subtract(1);
    mPrimes = new int[Functions.PRIME_PI.i(mN)];
    mPrimes[0] = 2;
    for (int k = 1; k < mPrimes.length; ++k) {
      mPrimes[k] = Functions.NEXT_PRIME.i(mPrimes[k - 1]);
    }
    return Z.valueOf(search(Z.ZERO, new int[mN][mN], 0, 1));
  }
}


