package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A395942 Number of inequivalent tilings of an n X n grid by 1 X p rectangles using the prime partitions of n^2 into prime parts p &lt;= n up to symmetry.
 * @author Sean A. Irvine
 */
public class A395942 extends Sequence0 {

  private int mN = -1;
  private Z mFull;
  private int[] mPrimes;
  private final Sequence mUnrestricted = new A395943().skip(2);
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private long search180(final Z board, int pos) {
    if (board.equals(mFull)) {
      return 1;
    }
    while (board.testBit(pos)) {
      ++pos;
    }
    assert pos < mN * mN;
    final int r = pos / mN;
    final int c = pos % mN;
    long total = 0;
    for (final int p : mPrimes) {
      // Horizontal
      if (c + p <= mN) {
        final Z block = Z.valueOf((1L << p) - 1);
        Z mask = block.shiftLeft(pos);
        final int rr = mN - 1 - r;
        final int cc = mN - 1 - c;
        final int pos2 = rr * mN + cc;
        mask = mask.or(block.shiftLeft(pos2 - p + 1));
        final int size = mask.bitCount();
        if ((size == p || size == 2 * p) && board.and(mask).isZero()) {
          total += search180(board.or(mask), pos + p);
        }
      }
      // Vertical
      if (r + p <= mN) {
        Z mask = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(pos + k * mN);
        }
        final int rr = mN - 1 - r;
        final int cc = mN - 1 - c;
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit((rr - k) * mN + cc);
        }
        final int size = mask.bitCount();
        if ((size == p || size == 2 * p) && board.and(mask).isZero()) {
          total += search180(board.or(mask), pos + 1);
        }
      }
    }
    return total;
  }


  private long searchAxis(final Z board, int pos) {
    if (board.equals(mFull)) {
      return 1;
    }
    while (board.testBit(pos)) {
      ++pos;
    }
    assert pos < mN * mN;
    final int r = pos / mN;
    final int c = pos % mN;
    long total = 0;
    for (final int p : mPrimes) {
      // Horizontal bar
      if (c + p <= mN) {
        final Z block = Z.valueOf((1L << p) - 1);
        final Z mask1 = block.shiftLeft(pos);
        final int cc = mN - c - p;
        final Z mask2 = block.shiftLeft(r * mN + cc);
        if (mask1.equals(mask2) || mask1.and(mask2).isZero()) {
          final Z mask = mask1.or(mask2);
          if (board.and(mask).isZero()) {
            total += searchAxis(board.or(mask), pos + p);
          }
        }
      }
      // Vertical bar
      if (r + p <= mN) {
        final int cc = mN - 1 - c;
        Z mask = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(pos + k * mN).setBit((r + k) * mN + cc);
        }
        if (board.and(mask).isZero()) {
          total += searchAxis(board.or(mask), pos + 1);
        }
      }
    }
    return total;
  }

  private long search90(final Z board, int pos) {
    if (board.equals(mFull)) {
      return 1;
    }
    while (board.testBit(pos)) {
      ++pos;
    }
    assert pos < mN * mN;
    final int r = pos / mN;
    final int c = pos % mN;
    long total = 0;
    for (final int p : mPrimes) {
      if (c + p <= mN) {
        final Z block = Z.valueOf((1L << p) - 1);
        // Horizontal
        Z mask = block.shiftLeft(pos);
        // rotate 90 vertical
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit((c + j) * mN + (mN - 1 - r));
        }
        // rotate 180 horizontal
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit((mN - 1 - r) * mN + (mN - c - p + j));
        }
        // rotate 270 vertical
        for (int j = 0; j < p; ++j) {
          mask = mask.setBit((mN - c - p + j) * mN + r);
        }
        if (mask.bitCount() == 4 * p) {
          if (board.and(mask).isZero()) {
            total += search90(board.or(mask), pos + p);
          }
        }
      }
      // Vertical
      if (r + p <= mN) {
        Z mask = Z.ZERO;
        // original vertical
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(pos + k * mN);
        }
        // rotate 90 horizontal
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit((mN - 1 - c) * mN + (r + k));
        }
        // rotate 180 vertical
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit((mN - r - p + k) * mN + (mN - 1 - c));
        }
        // rotate 270 horizontal
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(c * mN + (mN - r - p + k));
        }
        if (mask.bitCount() == 4 * p && board.and(mask).isZero()) {
          total += search90(board.or(mask), pos + 1);
        }
      }
    }
    return total;
  }


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
    if (mVerbose) {
      StringUtils.message(mN + " Raw count from A395943 " + fe);
    }
    // If n is odd, there can never be a 90 degree rotation because the center cell cannot have it
    final long f90 = (mN & 1) == 1 ? 0 : search90(Z.ZERO, 0);
    if (mVerbose) {
      StringUtils.message(mN + " Contribution of cases with rotation by 90 degrees symmetry " + f90);
    }
    final long f180 = search180(Z.ZERO, 0);
    if (mVerbose) {
      StringUtils.message(mN + " Contribution of cases with rotation by 180 degrees symmetry " + f180);
    }
    final long fax = searchAxis(Z.ZERO, 0);
    if (mVerbose) {
      StringUtils.message(mN + " Contribution of cases with axial symmetry " + fax);
    }

    // Use Burnside to put all the pieces together
    final Z total = Z.valueOf(fe).add(2 * f90).add(f180).add(2 * fax);
    assert total.mod(8) == 0 : "Total: " + total + " should be disible by 8";
    return total.divide(8);
  }
}
