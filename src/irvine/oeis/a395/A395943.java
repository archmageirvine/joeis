package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A392575.
 * @author Sean A. Irvine
 */
public class A395943 extends Sequence1 {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<int[]> mPartitions = new ArrayList<>();
  private int mN = 0;
  private Z mCount;

  static class RectanglePackings {

    private static boolean canPlaceHorizontal(final boolean[][] board, final int r, final int c, final int len, final int n) {
      if (c + len > n) {
        return false;
      }
      for (int j = 0; j < len; ++j) {
        if (board[r][c + j]) {
          return false;
        }
      }
      return true;
    }

    private static boolean canPlaceVertical(final boolean[][] board, final int r, final int c, final int len, final int n) {
      if (r + len > n) {
        return false;
      }
      for (int i = 0; i < len; ++i) {
        if (board[r + i][c]) {
          return false;
        }
      }
      return true;
    }

    private static void placeHorizontal(final boolean[][] board, final int r, final int c, final int len, final boolean value) {
      for (int j = 0; j < len; ++j) {
        board[r][c + j] = value;
      }
    }

    private static void placeVertical(final boolean[][] board, final int r, final int c, final int len, final boolean value) {
      for (int i = 0; i < len; ++i) {
        board[r + i][c] = value;
      }
    }

    /**
     * Count packings of 1 x k rectangles into an n x n square.
     * @param list tile lengths
     * @param n side length of square
     * @return number of packings
     */
    public static long countPackings(final int[] list, final int n) {
      // assumes sum of list is n^2, list elements > 1 (they're actually prime in A395943)
      // Multiplicity map so equal tiles are indistinguishable
      final TreeMap<Integer, Integer> counts = new TreeMap<>();
      for (final int v : list) {
        counts.merge(v, 1, Integer::sum);
      }
      final boolean[][] board = new boolean[n][n];
      return search(board, counts, n, 0);
    }

    /**
     * Recursive search.
     */
    private static long search(final boolean[][] board, final TreeMap<Integer, Integer> counts, final int n, final int filled) {
      if (filled == n * n) {
        return 1;
      }
      // Find first empty cell
      int r = -1;
      int c = -1;
      outer:
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          if (!board[i][j]) {
            r = i;
            c = j;
            break outer;
          }
        }
      }

      long total = 0;
      // Try each distinct tile length
      for (final Map.Entry<Integer, Integer> e : counts.entrySet()) {
        final int len = e.getKey();
        final int cnt = e.getValue();
        if (cnt == 0) {
          continue;
        }
        // consume one copy
        counts.put(len, cnt - 1);
        // Horizontal placement (1 x len)
        if (canPlaceHorizontal(board, r, c, len, n)) {
          placeHorizontal(board, r, c, len, true);
          total += search(board, counts, n, filled + len);
          placeHorizontal(board, r, c, len, false);
        }
        // Vertical placement (len x 1), assumes len!=1
        if (canPlaceVertical(board, r, c, len, n)) {
          placeVertical(board, r, c, len, true);
          total += search(board, counts, n, filled + len);
          placeVertical(board, r, c, len, false);
        }
        // restore
        counts.put(len, cnt);
      }
      return total;
    }

  }

  private void buildPartitions(final int remaining, final int side, final int p, final ArrayList<Integer> partition) {
    if (remaining == 0) {
      mPartitions.add(IntegerUtils.toInt(partition));
      return;
    }
    for (int q = p; q <= Math.min(remaining, side); q = Functions.NEXT_PRIME.i(q)) {
      partition.add(q);
      buildPartitions(remaining - q, side, q, partition);
      partition.remove(partition.size() - 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mPartitions.clear();
    mCount = Z.ZERO;
    buildPartitions(mN * mN, mN, 2, new ArrayList<>());
    if (mVerbose) {
      StringUtils.message("n=" + mN + " number of partitions " + mPartitions.size());
    }
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    for (int t = 0; t < THREADS; ++t) {
      final int threadId = t;
      executor.submit(() -> {
        Z total = Z.ZERO;
        for (int k = mPartitions.size() - 1 - threadId; k >= 0; k -= THREADS) {
          final long cnt = RectanglePackings.countPackings(mPartitions.get(k), mN);
          if (mVerbose) {
            for (final int[] p : mPartitions) {
              StringUtils.message("n=" + mN + " partition " + Arrays.toString(p) + " count " + cnt);
            }
          }
          total = total.add(cnt);
        }
        synchronized (A395943.this) {
          mCount = mCount.add(total);
        }
      });
    }
    executor.shutdown();
    try {
      // Ten years!
      if (!executor.awaitTermination(3650, TimeUnit.DAYS)) {
        throw new RuntimeException("Timeout");
      }
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();  // Restore interrupt status
      throw new RuntimeException(e);
    }
    return mCount;
  }

}
