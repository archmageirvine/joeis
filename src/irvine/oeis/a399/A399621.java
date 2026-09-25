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
 * A399621 Triangle T(n,k), 1 &lt;= k &lt;= n, read by rows: minimum number of monochromatic axis-parallel rectangles in a 2-coloring of a k X n grid.
 * @author Sean A. Irvine
 */
public class A399621 extends Sequence1 {

  protected static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  private int mN = 0;
  private int mM = 0;

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

  /**
   * Per-thread search state.
   */
  private static final class State {
    private final boolean[][] mS;
    private final int mN;
    private final int mM;
    private final AtomicLong mGlobalMin;
    private long mMin = Long.MAX_VALUE;
    private long mNodes = 0;

    private State(final int n, final int m, final AtomicLong globalMin) {
      mN = n;
      mM = m;
      mGlobalMin = globalMin;
      mS = new boolean[n][m];
    }

    private void search(final int x, final int y, final long cnt) {
      // Periodically update our local minimum from the global minimum
      // This reduces contention between threads by not constantly
      // consulting the global minimum
      if ((++mNodes & 0xFFFF) == 0) {
        final long global = mGlobalMin.get();
        if (global < mMin) {
          mMin = global;
        }
      }
      if (cnt >= mMin) {
        return;
      }
      if (y >= mM) {
        mMin = mGlobalMin.accumulateAndGet(cnt, Math::min);
        return;
      }
      if (x >= mN) {
        search(0, y + 1, cnt);
        return;
      }
      mS[x][y] = false;
      search(x + 1, y, cnt + count(mS, x, y, false));
      if (cnt < mMin) {
        mS[x][y] = true;
        search(x + 1, y, cnt + count(mS, x, y, true));
      }
    }

    void run(final long mask) {
      /*
       * (0,0) is WLOG false.
       * The rest of row 0 is specified by mask.
       */
      for (int x = 1; x < mN; ++x) {
        mS[x][0] = (mask & (1L << (x - 1))) != 0;
      }
      mMin = mGlobalMin.get(); // get current min from so far
      search(0, 1, 0); // start now on row 1
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long jobs = 1L << (mN - 1);
    final AtomicLong globalMin = new AtomicLong(Long.MAX_VALUE);
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    try {
      final List<Future<?>> futures = new ArrayList<>();
      for (long mask = 0; mask < jobs; ++mask) {
        final long rowMask = mask;
        futures.add(executor.submit(() -> new State(mN, mM, globalMin).run(rowMask)));
      }
      for (final Future<?> future : futures) {
        try {
          future.get();
        } catch (final InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        } catch (final ExecutionException e) {
          throw new RuntimeException(e.getCause());
        }
      }
      return Z.valueOf(globalMin.get());
    } finally {
      executor.shutdown();
    }
  }
}
