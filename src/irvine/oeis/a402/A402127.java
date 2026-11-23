package irvine.oeis.a402;

import java.util.Arrays;
import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402127 Least number of Wang tile types that tile an n X n square but not an (n+1) X (n+1) square.
 * @author Gregory Morse
 */
public class A402127 extends Sequence1 {
  // The lower bounds for the published sides were independently audited by
  // an exhaustive compatibility-matrix census and board replay. Board
  // checks below verify the individual attaining witnesses.
  private static final int[] MAX_STOP = {0, 1, 2, 3, 4, 6, 8, 16};

  // Ferudun's witnesses, with Yeyito's last two sets, in north/east/south/west order.
  private static final String[] WITNESSES = {
    "0010 1100 1201 1302 0313",
    "0010 1100 1201 1302 0313 2423",
    "0010 1100 1201 1302 1403 0414",
    "0010 1100 1201 1302 1403 0414 2524",
    "0010 1100 1201 1302 1403 1504 0515",
    "0100 0401 0002 0203 1324 2210 2311",
    "4030 3041 5132 5240 4142 4231 3050",
    "0500 0401 0002 0203 1324 2210 2311 0105",
    "0020 0110 1200 0001 2111 1102 0212",
    "0002 2011 1020 2100 0110 1221 2210",
    "4030 3041 3132 5240 4142 4131 3250",
    "4030 3041 3132 5240 4142 4131 3250 0031"
  };

  private int mN = 0;

  private static class Board {
    private final int[][] mUnion;
    private final int[][] mNeighbors;
    private final int[] mDepth;
    private final int[] mQueue;
    private final int mAll;

    Board(final String[] tiles, final int side) {
      mAll = (1 << tiles.length) - 1;
      mUnion = new int[4][mAll + 1];
      for (int d = 0; d < 4; ++d) {
        final int[] allowed = new int[tiles.length];
        for (int p = 0; p < tiles.length; ++p) {
          for (int q = 0; q < tiles.length; ++q) {
            if (tiles[p].charAt(d) == tiles[q].charAt((d + 2) & 3)) {
              allowed[p] |= 1 << q;
            }
          }
        }
        for (int mask = 1; mask <= mAll; ++mask) {
          mUnion[d][mask] = mUnion[d][mask & (mask - 1)] | allowed[Integer.numberOfTrailingZeros(mask)];
        }
      }
      final int cells = side * side;
      mNeighbors = new int[cells][];
      mDepth = new int[cells];
      mQueue = new int[cells * (tiles.length + 1)];
      for (int p = 0; p < cells; ++p) {
        final int x = p % side;
        final int y = p / side;
        mNeighbors[p] = new int[] {y > 0 ? p - side : -1, x + 1 < side ? p + 1 : -1,
                                  y + 1 < side ? p + side : -1, x > 0 ? p - 1 : -1};
        mDepth[p] = Math.min(Math.min(x, y), Math.min(side - x - 1, side - y - 1));
      }
    }

    private boolean solve(final int[] domains, final int changed) {
      int size = 0;
      if (changed < 0) {
        for (int k = 0; k < domains.length; ++k) {
          mQueue[size++] = k;
        }
      } else {
        mQueue[size++] = changed;
      }
      while (size > 0) {
        final int p = mQueue[--size];
        for (int d = 0; d < 4; ++d) {
          final int q = mNeighbors[p][d];
          if (q >= 0) {
            final int keep = domains[q] & mUnion[d][domains[p]];
            if (keep == 0) {
              return false;
            }
            if (keep != domains[q]) {
              domains[q] = keep;
              mQueue[size++] = q;
            }
          }
        }
      }
      int best = -1;
      int choices = Integer.MAX_VALUE;
      for (int k = 0; k < domains.length; ++k) {
        final int count = Integer.bitCount(domains[k]);
        if (count > 1 && (count < choices || count == choices && mDepth[k] > mDepth[best])) {
          best = k;
          choices = count;
        }
      }
      if (best < 0) {
        return true;
      }
      for (int mask = domains[best]; mask != 0; mask &= mask - 1) {
        final int[] trial = domains.clone();
        trial[best] = Integer.lowestOneBit(mask);
        if (solve(trial, best)) {
          return true;
        }
      }
      return false;
    }

    boolean tiles() {
      final int[] domains = new int[mNeighbors.length];
      Arrays.fill(domains, mAll);
      return solve(domains, -1);
    }
  }

  private static boolean partitions(final int[] colors, final int pos, final int count,
                                    final Predicate<int[]> test) {
    if (pos == colors.length) {
      return test.test(colors);
    }
    for (int c = 0; c <= count; ++c) {
      colors[pos] = c;
      if (partitions(colors, pos + 1, Math.max(count, c + 1), test)) {
        return true;
      }
    }
    return false;
  }

  private static boolean stops(final String[] tiles, final int side) {
    return new Board(tiles, side).tiles() && !new Board(tiles, side + 1).tiles();
  }

  /**
   * Compute a term without supplying witnesses or external lower bounds.
   * This is a much slower exhaustive search over independent color
   * partitions on each axis, up to renaming.
   * @param side last side length to be tiled
   * @return minimum tile count
   */
  public static int exhaustive(final int side) {
    if (side < 1 || side > 17) {
      throw new UnsupportedOperationException("Only the published finite range is supported");
    }
    for (int count = 1; count < side; ++count) {
      final int n = count;
      if (partitions(new int[2 * n], 0, 0, vertical ->
        partitions(new int[2 * n], 0, 0, horizontal -> {
          final String[] tiles = new String[n];
          for (int k = 0; k < n; ++k) {
            tiles[k] = new String(new char[] {(char) vertical[k], (char) horizontal[k],
              (char) vertical[k + n], (char) horizontal[k + n]});
          }
          return stops(tiles, side);
        }))) {
        return n;
      }
    }
    // The n-type horizontal chain gives a witness at the remaining bound.
    return side;
  }

  /**
   * Run the exhaustive search without published witnesses or bounds.
   * @param args square side length
   */
  public static void main(final String[] args) {
    System.out.println(exhaustive(Integer.parseInt(args[0])));
  }

  @Override
  public Z next() {
    if (++mN > WITNESSES.length + 5) {
      throw new UnsupportedOperationException("No further verified tile sets");
    }
    int lower = 1;
    while (lower < MAX_STOP.length && mN > MAX_STOP[lower]) {
      ++lower;
    }
    if (mN == 13) {
      // The seven-type census also excludes an exact stop at side 13.
      lower = 8;
    }
    final String[] tiles;
    if (mN <= 5) {
      tiles = new String[mN];
      for (int k = 0; k < mN; ++k) {
        tiles[k] = new String(new char[] {0, (char) (k + 1), 0, (char) k});
      }
    } else {
      tiles = WITNESSES[mN - 6].split(" ");
    }
    if (tiles.length != lower || !stops(tiles, mN)) {
      throw new IllegalStateException("Invalid Wang tile witness");
    }
    return Z.valueOf(lower);
  }
}
