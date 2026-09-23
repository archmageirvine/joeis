package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399621.
 * @author Sean A. Irvine
 */
public class A399621 extends Sequence1 {

  // Number of worker threads.
  protected static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  private int mN = 0;
  private int mM = 0;

  /*
   * Count the new configurations caused by setting (x,y) to v.
   */
  private static long count(final boolean[][] s, final int x, final int y, final boolean v) {
    long cnt = 0;
    for (int k = 0; k < x; ++k) {
      for (int j = 0; j < y; ++j) {
        if (s[x][j] == v && s[k][j] == v && s[k][y] == v) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  /*
   * Search one first-row configuration.
   */
  private static void search(final boolean[][] s, final int n, final int m,
                             final int x, final int y, final long count,
                             final AtomicLong globalMin) {
    final long best = globalMin.get();
    if (count >= best) {
      return;
    }
    if (y >= m) {
      globalMin.accumulateAndGet(count, Math::min);
      return;
    }
    if (x >= n) {
      search(s, n, m, 0, y + 1, count, globalMin);
      return;
    }
    s[x][y] = false;
    search(s, n, m, x + 1, y, count + count(s, x, y, false), globalMin);

    // A better result may have been found by another thread.
    if (count < globalMin.get()) {
      s[x][y] = true;
      search(s, n, m, x + 1, y, count + count(s, x, y, true), globalMin);
    }
  }

  /*
   * Search for a particular first row.
   */
  private static long searchFirstRow(final int n, final int m, final long mask, final AtomicLong globalMin) {
    final boolean[][] s = new boolean[n][m];

    // (0,0) is WLOG false.  The remaining entries of row 0 are specified by mask.
    for (int y = 1; y < m; ++y) {
      s[0][y] = (mask & (1L << (y - 1))) != 0;
    }
    search(s, n, m, 1, 0, 0, globalMin);
    return globalMin.get();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }

    /*
     * There are 2^(mM-1) possible first rows, since (0,0)
     * can be assumed to be false.
     *
     * Use a long mask, so this implementation supports up to
     * mM = 64.  In practice the number of jobs becomes enormous
     * well before that.
     */
    if (mM > Long.SIZE) {
      throw new UnsupportedOperationException();
    }

    final long jobs = 1L << (mM - 1);
    final AtomicLong globalMin = new AtomicLong(Long.MAX_VALUE);

    final ExecutorService executor =
      Executors.newFixedThreadPool(Math.min(THREADS, (int) Math.min(jobs, Integer.MAX_VALUE)));

    try {
      final List<Future<Long>> futures = new ArrayList<>();
      for (long mask = 0; mask < jobs; ++mask) {
        final long row = mask;
        futures.add(executor.submit(() -> searchFirstRow(mN, mM, row, globalMin)));
      }
      // Wait for all first-row searches to finish.
      for (final Future<Long> future : futures) {
        try {
          future.get();
        } catch (final InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        } catch (final ExecutionException e) {
          throw new RuntimeException(e.getCause());
        }
      }
    } finally {
      executor.shutdown();
    }
    return Z.valueOf(globalMin.get());
  }
}

//package irvine.oeis.a399;
//
//import irvine.math.z.Z;
//import irvine.oeis.Sequence1;
//
///**
// * A399621.
// * @author Sean A. Irvine
// */
//public class A399621 extends Sequence1 {
//
//  private int mN = 0;
//  private int mM = 0;
//  private long mMin = 0;
//  private boolean[][] mS = null;
//
//  private long count(final int x, final int y, final boolean v) {
//    long cnt = 0;
//    for (int k = 0; k < x; ++k) {
//      for (int j = 0; j < y; ++j) {
//        if (mS[x][j] == v && mS[k][j] == v && mS[k][y] == v) {
//          ++cnt;
//        }
//      }
//    }
//    return cnt;
//  }
//
//  private void search(final int x, final int y, final long count) {
//    if (count > mMin) {
//      return;
//    }
//    if (y >= mM) {
//      mMin = count;
//      return;
//    }
//    if (x >= mN) {
//      search(0, y + 1, count);
//      return;
//    }
//    mS[x][y] = false;
//    search(x + 1, y, count + count(x, y, false));
//    // min could have changed to check again before trying other possibility
//    if (count < mMin) {
//      mS[x][y] = true;
//      search(x + 1, y, count + count(x, y, true));
//    }
//  }
//
//  @Override
//  public Z next() {
//    if (++mM > mN) {
//      ++mN;
//      mM = 1;
//    }
//    mMin = Long.MAX_VALUE;
//    mS = new boolean[mN][mM];
//    // WLOG can assume (0,0) is false
//    search(1, 0, 0);
//    return Z.valueOf(mMin);
//  }
//}
