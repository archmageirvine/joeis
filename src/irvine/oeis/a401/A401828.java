package irvine.oeis.a401;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401828 allocated for Alper Ferudun.
 * @author Alper Ferudun
 * @author Sean A. Irvine (Java port)
 */
public class A401828 extends Sequence0 {

  private static final int TILE_HEIGHT = 8;

  private static class Board {
    private long[] mFiring;
    private long[] mState2;
    private long[] mState3;
    private int[] mActive = new int[16];
    private int mActiveSize = 0;

    private Board(final int rows, final int stride) {
      final int size = rows * stride;
      mFiring = new long[size];
      mState2 = new long[size];
      mState3 = new long[size];
    }

    void addActive(final int tile) {
      if (mActiveSize == mActive.length) {
        mActive = Arrays.copyOf(mActive, mActive.length * 2);
      }
      mActive[mActiveSize++] = tile;
    }
  }

  private int mTilesX = 1;
  private int mTilesY = 1;
  private int mStride = 2;
  private Board mCurrent = new Board(TILE_HEIGHT + 1, mStride);
  private Board mNext = new Board(TILE_HEIGHT + 1, mStride);
  private long[] mCandidates = new long[1];
  private final long[] mHorizontal = new long[9];
  private final long[] mMasks = new long[3];
  private int mN = 0;

  /** Construct the sequence. */
  public A401828() {
    mCurrent.mFiring[0] = 1;
    mCurrent.addActive(0);
  }

  private void resizeBoard(final Board board, final int newTilesX, final int newTilesY) {
    final int newStride = newTilesX + 1;
    final int oldStride = mStride;
    final int oldTilesX = mTilesX;
    final int oldRows = mTilesY * TILE_HEIGHT + 1;
    final int newRows = newTilesY * TILE_HEIGHT + 1;
    final long[] firing = new long[newRows * newStride];
    final long[] state2 = new long[newRows * newStride];
    final long[] state3 = new long[newRows * newStride];
    for (int y = 0; y < oldRows; ++y) {
      System.arraycopy(board.mFiring, y * oldStride, firing, y * newStride, oldTilesX);
      System.arraycopy(board.mState2, y * oldStride, state2, y * newStride, oldTilesX);
      System.arraycopy(board.mState3, y * oldStride, state3, y * newStride, oldTilesX);
    }
    board.mFiring = firing;
    board.mState2 = state2;
    board.mState3 = state3;

    // Active tile indices depend on the horizontal tile count.
    for (int i = 0; i < board.mActiveSize; ++i) {
      final int tile = board.mActive[i];
      final int x = tile % oldTilesX;
      final int y = tile / oldTilesX;
      board.mActive[i] = y * newTilesX + x;
    }
  }

  private void ensureCapacity(final int generation) {
    final int requiredX = generation / 64 + 1;
    final int requiredY = generation / TILE_HEIGHT + 1;
    if (requiredX <= mTilesX && requiredY <= mTilesY) {
      return;
    }
    final int newTilesX = Math.max(requiredX, mTilesX);
    final int newTilesY = Math.max(requiredY, mTilesY);
    resizeBoard(mCurrent, newTilesX, newTilesY);
    resizeBoard(mNext, newTilesX, newTilesY);
    mTilesX = newTilesX;
    mTilesY = newTilesY;
    mStride = mTilesX + 1;
    mCandidates = new long[(mTilesX * mTilesY + 63) / 64];
  }

  private void horizontal(final long[] row, final int offset, final int word, final int k) {
    final long center = row[offset + word];
    mHorizontal[k] = (center << 1) | (word == 0 ? center & 1 : row[offset + word - 1] >>> 63);
    mHorizontal[k + 1] = center;
    mHorizontal[k + 2] = (center >>> 1) | (row[offset + word + 1] << 63);
  }

  private void neighborMasks() {
    long ones = 0;
    long twos = 0;
    long fours = 0;
    long eights = 0;
    for (int i = 0; i < 9; ++i) {
      if (i == 4) {
        continue; // Exclude the centre cell
      }
      final long bits = mHorizontal[i];
      final long carry1 = ones & bits;
      ones ^= bits;
      final long carry2 = twos & carry1;
      twos ^= carry1;
      final long carry3 = fours & carry2;
      fours ^= carry2;
      eights ^= carry3;
    }
    final long low = ~fours & ~eights;
    mMasks[0] = ~ones & twos & low;
    mMasks[1] = ones & twos & low;
    mMasks[2] = ~ones & ~twos & fours & ~eights;
  }

  private long step() {
    // Clear all nonzero tiles in the reused output buffer.
    for (int i = 0; i < mNext.mActiveSize; ++i) {
      final int tile = mNext.mActive[i];
      final int word = tile % mTilesX;
      final int firstRow = tile / mTilesX * TILE_HEIGHT;
      for (int y = firstRow; y < firstRow + TILE_HEIGHT; ++y) {
        final int index = y * mStride + word;
        mNext.mFiring[index] = 0;
        mNext.mState2[index] = 0;
        mNext.mState3[index] = 0;
      }
    }
    mNext.mActiveSize = 0;
    Arrays.fill(mCandidates, 0);

    // Mark tiles which might change.
    for (int i = 0; i < mCurrent.mActiveSize; ++i) {
      final int tile = mCurrent.mActive[i];
      final int x = tile % mTilesX;
      final int y = tile / mTilesX;
      for (int yy = Math.max(0, y - 1); yy <= Math.min(mTilesY - 1, y + 1); ++yy) {
        for (int xx = Math.max(0, x - 1); xx <= Math.min(mTilesX - 1, x + 1); ++xx) {
          final int t = yy * mTilesX + xx;
          mCandidates[t >>> 6] |= 1L << (t & 63);
        }
      }
    }

    long quadrantPopulation = 0;
    long axisPopulation = 0;
    for (int group = 0; group < mCandidates.length; ++group) {
      long pending = mCandidates[group];
      while (pending != 0) {
        final int bit = Long.numberOfTrailingZeros(pending);
        final int tile = group * 64 + bit;
        pending &= pending - 1;
        final int word = tile % mTilesX;
        final int firstRow = tile / mTilesX * TILE_HEIGHT;
        long occupied = 0;
        for (int y = firstRow; y < firstRow + TILE_HEIGHT; ++y) {
          final int north = y == 0 ? 1 : y - 1;
          horizontal(mCurrent.mFiring, north * mStride, word, 0);
          horizontal(mCurrent.mFiring, y * mStride, word, 3);
          horizontal(mCurrent.mFiring, (y + 1) * mStride, word, 6);
          neighborMasks();
          final int index = y * mStride + word;
          final long old = mCurrent.mFiring[index];
          final long old2 = mCurrent.mState2[index];
          final long old3 = mCurrent.mState3[index];
          final long ready = ~(old | old2 | old3);
          final long survives = old & (mMasks[1] | mMasks[2]);
          final long firing = (ready & mMasks[0]) | survives;
          final long state2 = old & ~survives;
          final long state3 = old2;
          mNext.mFiring[index] = firing;
          mNext.mState2[index] = state2;
          mNext.mState3[index] = state3;
          occupied |= firing | state2 | state3;
          quadrantPopulation += Long.bitCount(firing);
          if (y == 0) {
            axisPopulation += Long.bitCount(firing);
          }
        }
        if (occupied != 0) {
          mNext.addActive(tile);
        }
      }
    }
    return 4 * quadrantPopulation - 2 * axisPopulation;
  }

  @Override
  public Z next() {
    if (mN++ == 0) {
      return Z.TWO;
    }
    ensureCapacity(mN);
    final long population = step();
    final Board tmp = mCurrent;
    mCurrent = mNext;
    mNext = tmp;
    return Z.valueOf(population);
  }
}
