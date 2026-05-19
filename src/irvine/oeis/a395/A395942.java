package irvine.oeis.a395;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A395942 allocated for Chuck Seggelin.
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
public class A395942 extends Sequence0 {

  // todo this version is currently broken

  private int mN = -1;
  private Z mFull;
  private int[] mPrimes;

  private long search180(final Z board, int pos) {

//    final Long cached = mMemo180.get(board);
//    if (cached != null) {
//      return cached;
//    }

    if (board.equals(mFull)) {
      return 1;
    }

    while (board.testBit(pos)) {
      ++pos;
    }

    final int r = pos / mN;
    final int c = pos % mN;

    long total = 0;
    for (final int p : mPrimes) {
      // horizontal
      if (c + p <= mN) {
        Z mask1 = Z.ZERO;
        for (int j = 0; j < p; ++j) {
          mask1 = mask1.setBit(pos + j);
        }
        final int rr = mN - 1 - r;
        final int cc = mN - c - p;
        Z mask2 = Z.ZERO;
        for (int j = 0; j < p; ++j) {
          mask2 = mask2.setBit(rr * mN + cc + j);
        }
        if (mask1.equals(mask2) || mask1.and(mask2).isZero()) {
          final Z mask = mask1.or(mask2);
          if (board.and(mask).isZero()) {
            total += search180(board.or(mask), pos + 1);
          }
        }
      }

      // vertical
      if (r + p <= mN) {
        Z mask1 = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask1 = mask1.setBit(pos + k * mN);
        }
        final int rr = mN - r - p;
        final int cc = mN - 1 - c;
        Z mask2 = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask2 = mask2.setBit((rr + k) * mN + cc);
        }

        if (mask1.equals(mask2) || mask1.and(mask2).isZero()) {
          final Z mask = mask1.or(mask2);
          if (board.and(mask).isZero()) {
            total += search180(board.or(mask), pos + 1);
          }
        }
      }
    }

    //mMemo180.put(board, total);
    return total;
  }

  private long searchAxis(final Z board, int pos) {
//    final Long cached = mMemoAxis.get(board);
//    if (cached != null) {
//      return cached;
//    }
    if (board.equals(mFull)) {
      return 1;
    }
    while (board.testBit(pos)) {
      ++pos;
    }
    final int r = pos / mN;
    final int c = pos % mN;

    long total = 0;
    for (final int p : mPrimes) {
      // horizontal
      if (c + p <= mN) {
        Z mask1 = Z.ZERO;
        for (int j = 0; j < p; ++j) {
          mask1 = mask1.setBit(pos + j);
        }
        final int cc = mN - c - p;
        Z mask2 = Z.ZERO;
        for (int j = 0; j < p; ++j) {
          mask2 = mask2.setBit(r * mN + cc + j);
        }
        if (mask1.equals(mask2) || mask1.and(mask2).isZero()) {
          final Z mask = mask1.or(mask2);
          if (board.and(mask).isZero()) {
            total += searchAxis(board.or(mask), pos + 1);
          }
        }
      }
      // vertical
      if (r + p <= mN) {
        Z mask1 = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask1 = mask1.setBit(pos + k * mN);
        }
        final int cc = mN - 1 - c;
        Z mask2 = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask2 = mask2.setBit((r + k) * mN + cc);
        }
        if (mask1.equals(mask2) || mask1.and(mask2).isZero()) {
          final Z mask = mask1.or(mask2);
          if (board.and(mask).isZero()) {
            total += searchAxis(board.or(mask), pos + 1);
          }
        }
      }
    }

    //mMemoAxis.put(board, total);
    return total;
  }

  private long searchDiag(final Z board, int pos) {

//    final Long cached = mMemoDiag.get(board);
//    if (cached != null) {
//      return cached;
//    }

    if (board.equals(mFull)) {
      return 1;
    }

    while (board.testBit(pos)) {
      ++pos;
    }

    final int r = pos / mN;
    final int c = pos % mN;

    long total = 0;

    for (final int p : mPrimes) {

      // horizontal placement
      if (c + p <= mN) {

        Z mask1 = Z.ZERO;

        for (int j = 0; j < p; ++j) {
          mask1 = mask1.setBit(pos + j);
        }

        Z mask2 = Z.ZERO;

        for (int j = 0; j < p; ++j) {
          mask2 = mask2.setBit((c + j) * mN + r);
        }

        if (mask1.equals(mask2) || mask1.and(mask2).isZero()) {
          final Z mask = mask1.or(mask2);
          if (board.and(mask).isZero()) {
            total += searchDiag(board.or(mask), pos + 1);
          }
        }
      }
    }

//    mMemoDiag.put(board, total);

    return total;
  }

  private long search90(final Z board, int pos) {

//    final Long cached = mMemo90.get(board);
//    if (cached != null) {
//      return cached;
//    }

    if (board.equals(mFull)) {
      return 1;
    }

    while (board.testBit(pos)) {
      ++pos;
    }

    final int r = pos / mN;
    final int c = pos % mN;

    long total = 0;

    for (final int p : mPrimes) {

      if (c + p <= mN) {

        Z mask = Z.ZERO;

        // original horizontal
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit(pos + j);
        }

        // rot90 vertical
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit((c + j) * mN + (mN - 1 - r));
        }

        // rot180 horizontal
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit((mN - 1 - r) * mN + (mN - c - p + j));
        }

        // rot270 vertical
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit((mN - c - p + j) * mN + r);
        }

        if (mask.bitCount() == 4 * p) {
          if (board.and(mask).isZero()) {
            total += search90(board.or(mask), pos + 1);
          }
        }
      }
    }

//    mMemo90.put(board, total);

    return total;
  }

  private final Map<Z, Long> mMemo90 = new HashMap<>();
  private final Map<Z, Long> mMemoDiag = new HashMap<>();
  private final Map<Z, Long> mMemoAxis = new HashMap<>();
  private final Map<Z, Long> mMemo180 = new HashMap<>();
  private final Sequence mUnrestricted = new A395943().skip(); // skip n==1 case

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 1 ? Z.ZERO : Z.ONE;
    }

    mFull = Z.ONE.shiftLeft((long) mN * mN).subtract(1);
    mPrimes = new int[Functions.PRIME_PI.i(mN)];
    mPrimes[0] = 2;
    for (int k = 1; k < mPrimes.length; ++k) {
      mPrimes[k] = Functions.NEXT_PRIME.i(mPrimes[k - 1]);
    }

    final long fe = mUnrestricted.next().longValueExact();
    final long f90 = (mN & 1) == 1 ? 0 : search90(Z.ZERO, 0); // rotate by 90 only possible with center cell
    final long f180 = search180(Z.ZERO, 0);
    final long fax = searchAxis(Z.ZERO, 0);
    final long fdiag = searchDiag(Z.ZERO, 0);

    System.out.println("n=" + mN);
    System.out.println("fe=" + fe);
    System.out.println("f90=" + f90);
    System.out.println("f180=" + f180);
    System.out.println("fax=" + fax);
    System.out.println("fdiag=" + fdiag);

    return Z.valueOf((fe + 2 * f90 + f180 + 2 * fax + 2 * fdiag) / 8);
  }
}


