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
 * A395943 allocated for Chuck Seggelin.
 * @author Sean A. Irvine
 */
public class A395943 extends Sequence1 {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<int[]> mPartitions = new ArrayList<>();
  private int mN = 0;
  private Z mCount;

  // Pack a row of the rectangle into a long
  static class RectanglePackingsBit {

    static long countPackings(final int[] list, final int n) {
      int sum = 0;
      final TreeMap<Integer, Integer> counts = new TreeMap<>(Comparator.reverseOrder());
      for (final int v : list) {
        sum += v;
        counts.merge(v, 1, Integer::sum);
      }
      if (sum != n * n) {
        return 0; // sum of items is not square size, should not happen in A395943
      }
      return search(new long[n], counts, n, 0);
    }

    private static long search(final long[] rows, final TreeMap<Integer, Integer> counts, final int n, final int filled) {
      if (filled == n * n) {
        return 1;
      }
      final long full = (1L << n) - 1;
      int r = -1;
      int c = -1;

      // Find first empty cell
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

        // Horizontal
        if (c + len <= n) {
          final long mask = ((1L << len) - 1) << c;
          if ((rows[r] & mask) == 0) {
            rows[r] |= mask;
            total += search(rows, counts, n, filled + len);
            rows[r] ^= mask;
          }
        }

        // Vertical
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
            }
            total += search(rows, counts, n, filled + len);
            for (int k = 0; k < len; ++k) {
              rows[r + k] ^= bit;
            }
          }
        }
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
          final long cnt = RectanglePackingsBit.countPackings(mPartitions.get(k), mN);
          if (mVerbose) {
            StringUtils.message("n=" + mN + " partition " + k + " " + Arrays.toString(mPartitions.get(k)) + " count " + cnt);
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
