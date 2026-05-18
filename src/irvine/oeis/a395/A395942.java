package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
public class A395942 extends Sequence1 {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<int[]> mPartitions = new ArrayList<>();
  private int mN = 0;
  private Z mCount;

  /**
   * Count packings of 1 x k rectangles into an n x n square,
   * modulo rotations/reflections of the whole square.
   * Equal tile lengths are indistinguishable.
   */
  static class RectanglePackingsSymmetry {

    /**
     * Entry point.
     *
     * @param list tile lengths
     * @param n board size
     * @return number of packings modulo D4 symmetry
     */
    public static long countPackings(final int[] list, final int n) {

      int sum = 0;

      // descending order = huge pruning improvement
      final TreeMap<Integer, Integer> counts =
        new TreeMap<>(Comparator.reverseOrder());

      for (final int v : list) {
        sum += v;
        counts.merge(v, 1, Integer::sum);
      }

      if (sum != n * n) {
        return 0; // should not happen in A395942
      }

      final long[] rows = new long[n];

      // rectangle ids for symmetry testing
      final int[][] ids = new int[n][n];

      return search(rows, ids, counts, n, 0, 1);
    }

    private static long search(final long[] rows, final int[][] ids, final TreeMap<Integer, Integer> counts, final int n, final int filled, final int nextId) {
      if (filled == n * n) {
        return isCanonical(ids, n) ? 1 : 0;
      }
      final long full = (1L << n) - 1;
      int r = -1;
      int c = -1;
      // first empty cell
      for (int i = 0; i < n; ++i) {
        if (rows[i] != full) {
          r = i;
          c = Long.numberOfTrailingZeros(~rows[i]);
          break;
        }
      }

      long total = 0;
      for (final Map.Entry<Integer, Integer> e : counts.entrySet()) {
        final int len = e.getKey();
        final int cnt = e.getValue();
        if (cnt == 0) {
          continue;
        }

        counts.put(len, cnt - 1);
        // Horizontal placement
        if (c + len <= n) {
          final long mask = ((1L << len) - 1) << c;
          if ((rows[r] & mask) == 0) {
            rows[r] |= mask;
            for (int j = 0; j < len; ++j) {
              ids[r][c + j] = nextId;
            }
            total += search(rows, ids, counts, n, filled + len, nextId + 1);
            rows[r] ^= mask;
            for (int j = 0; j < len; ++j) {
              ids[r][c + j] = 0;
            }
          }
        }

        // Vertical placement
        if (len > 1 && r + len <= n) {
          final long bit = 1L << c;
          boolean ok = true;
          for (int k = 0; k < len; ++k) {
            if ((rows[r + k] & bit) != 0) {
              ok = false;
              break;
            }
          }
          if (ok) {
            for (int k = 0; k < len; ++k) {
              rows[r + k] |= bit;
              ids[r + k][c] = nextId;
            }
            total += search(rows, ids, counts, n, filled + len, nextId + 1);
            for (int k = 0; k < len; ++k) {
              rows[r + k] ^= bit;
              ids[r + k][c] = 0;
            }
          }
        }
        counts.put(len, cnt);
      }
      return total;
    }

    // Incrementally check for minimum representative
    private static int compareTransform(final int[][] b, final int n, final int transform) {
      final int[] mapA = new int[n * n + 1];
      final int[] mapB = new int[n * n + 1];
      int nextA = 1;
      int nextB = 1;
      for (int r = 0; r < n; ++r) {
        for (int c = 0; c < n; ++c) {
          int a = b[r][c];
          if (a != 0) {
            if (mapA[a] == 0) {
              mapA[a] = nextA++;
            }
            a = mapA[a];
          }
          final int tr;
          final int tc;
          switch (transform) {
            case 1: // rotate 90
              tr = n - 1 - c;
              tc = r;
              break;
            case 2: // rotate 180
              tr = n - 1 - r;
              tc = n - 1 - c;
              break;
            case 3: // rotate 270
              tr = c;
              tc = n - 1 - r;
              break;
            case 4: // reflect vertical
              tr = r;
              tc = n - 1 - c;
              break;
            case 5: // reflect + rotate 90
              tr = n - 1 - c;
              tc = n - 1 - r;
              break;
            case 6: // reflect + rotate 180
              tr = n - 1 - r;
              tc = c;
              break;
            case 7: // reflect + rotate 270
              tr = c;
              tc = r;
              break;
            default:
              throw new RuntimeException();
          }
          int d = b[tr][tc];
          if (d != 0) {
            if (mapB[d] == 0) {
              mapB[d] = nextB++;
            }
            d = mapB[d];
          }
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

    private static boolean isCanonical(final int[][] board, final int n) {
      for (int t = 1; t < 8; ++t) {
        if (compareTransform(board, n, t) < 0) {
          return false;
        }
      }
      return true;
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
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
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
          final long cnt = RectanglePackingsSymmetry.countPackings(mPartitions.get(k), mN);
          if (mVerbose) {
            StringUtils.message("n=" + mN + " partition " + k + " " + Arrays.toString(mPartitions.get(k)) + " count " + cnt);
          }
          total = total.add(cnt);
        }
        synchronized (A395942.this) {
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
