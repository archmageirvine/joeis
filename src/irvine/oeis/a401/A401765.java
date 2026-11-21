package irvine.oeis.a401;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401765 Largest m such that an n X m rectangle can be tiled with Culik's 13 Wang tiles so that every column wraps around (its bottom edge matches its top edge).
 * @author Sean A. Irvine
 */
public class A401765 extends Sequence1 {

  // After Pietro Tiaraju Giavarina dos Santos

  // Tile: top, left, bottom, right
  private static final String TILES = "GGBR GBGR GBBG RRGG RRBB RGGB YYRY BYGY GKRY GKYY YKRK BKGK GYGK";

  private static final int[][][] T = new int[2][][];

  static {
    final String[] tiles = TILES.split(" ");
    final String[] colors = {"RGB", "YK"};
    for (int k = 0; k < 2; ++k) {
      final int count = k == 0 ? 6 : 7;
      T[k] = new int[count][4];
      for (int j = 0; j < count; ++j) {
        final String s = tiles[j + (k == 0 ? 0 : 6)];
        T[k][j][0] = "RYGB".indexOf(s.charAt(0));
        T[k][j][1] = colors[k].indexOf(s.charAt(3));
        T[k][j][2] = "RYGB".indexOf(s.charAt(2));
        T[k][j][3] = colors[k].indexOf(s.charAt(1));
      }
    }
  }

  /**
   * Primitive long hash set. Zero is represented by key 1.
   */
  private static class LongSet {
    private long[] mTable;
    private int mSize;

    LongSet(final int expected) {
      int capacity = 16;
      while (capacity < expected * 1.5 && capacity < (1 << 29)) {
        capacity <<= 1;
      }
      mTable = new long[capacity];
    }

    private static int hash(final long x) {
      long z = x;
      z = (z ^ (z >>> 30)) * 0xbf58476d1ce4e5b9L;
      z = (z ^ (z >>> 27)) * 0x94d049bb133111ebL;
      z ^= z >>> 31;
      return (int) z;
    }

    boolean add(final long value) {
      if (mSize * 10 >= mTable.length * 7) {
        resize();
      }
      final long key = value + 1;
      final int mask = mTable.length - 1;
      int p = hash(key) & mask;
      while (mTable[p] != 0) {
        if (mTable[p] == key) {
          return false;
        }
        p = (p + 1) & mask;
      }
      mTable[p] = key;
      ++mSize;
      return true;
    }

    private void resize() {
      final long[] old = mTable;
      mTable = new long[old.length << 1];
      final int mask = mTable.length - 1;
      for (final long key : old) {
        if (key != 0) {
          int p = hash(key) & mask;
          while (mTable[p] != 0) {
            p = (p + 1) & mask;
          }
          mTable[p] = key;
        }
      }
    }

    int size() {
      return mSize;
    }

    long get(final int p) {
      return mTable[p] - 1;
    }

    int capacity() {
      return mTable.length;
    }

    boolean occupied(final int p) {
      return mTable[p] != 0;
    }
  }

  private int[] mRad;
  private long[] mMul;
  private LongSet mNext;
  private int mN = 0;

  /*
   * Generate all possible transitions through a column.
   */
  private void extend(final int row, final int c, final long state, final int x) {
    if (row == mRad.length) {
      if (c == x) {
        mNext.add(state);
      }
      return;
    }

    final int d = (int) (state / mMul[row] % mRad[row]);
    final int kind = mRad[row] == 3 ? 0 : 1;
    for (final int[] tile : T[kind]) {
      if (tile[0] == c && tile[1] == d) {
        final long s = state + (tile[3] - d) * mMul[row];
        extend(row + 1, tile[2], s, x);
      }
    }
  }

  /*
   * Widest closed strip with the given row types.
   */
  private int width(final String w) {
    final int n = w.length();
    mRad = new int[n];
    mMul = new long[n];
    long total = 1;
    for (int i = 0; i < n; ++i) {
      mRad[i] = w.charAt(i) == 'U' ? 3 : 2;
      mMul[i] = total;
      total *= mRad[i];
    }
    if (total > Integer.MAX_VALUE) {
      throw new ArithmeticException("State space too large");
    }
    LongSet current = new LongSet((int) total);
    for (long s = 0; s < total; ++s) {
      current.add(s);
    }

    int m = 0;
    while (current.size() != 0) {
      mNext = new LongSet((int) total);
      for (int p = 0; p < current.capacity(); ++p) {
        if (current.occupied(p)) {
          final long s = current.get(p);
          for (int x = 0; x < 4; ++x) {
            extend(0, x, s, x);
          }
        }
      }
      current = mNext;
      ++m;
    }
    return m - 1;
  }

  /*
   * Lexicographically smallest cyclic rotation.
   */
  private String canonical(final String w) {
    String best = w;
    for (int i = 1; i < w.length(); ++i) {
      final String r = w.substring(i) + w.substring(0, i);
      if (r.compareTo(best) < 0) {
        best = r;
      }
    }
    return best;
  }

  /*
   * Check the cyclic restrictions.
   */
  private boolean restricted(final String w) {
    final int n = w.length();
    for (int i = 0; i < n; ++i) {
      if (w.charAt(i) == 'U' && w.charAt((i + 1) % n) == 'U') {
        return false;
      }
      if (w.charAt(i) == 'L' && w.charAt((i + 1) % n) == 'L' && w.charAt((i + 2) % n) == 'L') {
        return false;
      }
    }
    return w.indexOf('U') >= 0;
  }

  @Override
  public Z next() {
    ++mN;
    final long limit = 1L << mN;
    final Set<String> words = new HashSet<>();
    for (long mask = 0; mask < limit; ++mask) {
      final StringBuilder w = new StringBuilder(mN);
      for (int i = 0; i < mN; ++i) {
        w.append((mask & (1L << i)) == 0 ? 'L' : 'U');
      }
      words.add(canonical(w.toString()));
    }

    int best = 0;
    int restrictedBest = 0;
    for (final String w : words) {
      final int b = width(w);
      if (b > best) {
        best = b;
      }
      if (restricted(w) && b > restrictedBest) {
        restrictedBest = b;
      }
    }
    return Z.valueOf(restrictedBest >= 6 ? restrictedBest : best);
  }
}
