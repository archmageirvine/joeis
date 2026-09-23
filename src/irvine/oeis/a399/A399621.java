package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399621.
 * @author Sean A. Irvine
 */
public class A399621 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long mMin = 0;
  private boolean[][] mS = null;

  private long count(final int x, final int y, final boolean v) {
    long cnt = 0;
    for (int k = 0; k < x; ++k) {
      for (int j = 0; j < y; ++j) {
        if (mS[x][j] == v && mS[k][j] == v && mS[k][y] == v) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  private void search(final int x, final int y, final long count) {
    if (count >= mMin) {
      return;
    }
    if (y >= mM) {
      mMin = count;
      return;
    }
    if (x >= mN) {
      search(0, y + 1, count);
      return;
    }
    mS[x][y] = false;
    search(x + 1, y, count + count(x, y, false));
    // min could have changed to check again before trying other possibility
    if (count < mMin) {
      mS[x][y] = true;
      search(x + 1, y, count + count(x, y, true));
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    mMin = Long.MAX_VALUE;
    mS = new boolean[mN][mM];
    // WLOG can assume (0,0) is false
    search(1, 0, 0);
    return Z.valueOf(mMin);
  }
}

// todo for reasons I do not understand, this parallel version is much slower ...

//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//import java.util.concurrent.atomic.AtomicLong;
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
//  protected static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
//    String.valueOf(Runtime.getRuntime().availableProcessors())));
//
//  private int mN = 0;
//  private int mM = 0;
//
//  private static long count(final boolean[][] s, final int x, final int y, final boolean v) {
//    long cnt = 0;
//    for (int k = 0; k < x; ++k) {
//      for (int j = 0; j < y; ++j) {
//        if (s[x][j] == v && s[k][j] == v && s[k][y] == v) {
//          ++cnt;
//        }
//      }
//    }
//    return cnt;
//  }
//
//  /**
//   * Per-thread search state.
//   */
//  private static final class State {
//    private final boolean[][] mS;
//    private final int mN;
//    private final int mM;
//    private final AtomicLong mGlobalMin;
//    private long mMin;
//
//    State(final int n, final int m, final AtomicLong globalMin) {
//      mN = n;
//      mM = m;
//      mGlobalMin = globalMin;
//      mS = new boolean[n][m];
//      mMin = Long.MAX_VALUE;
//    }
//
//    private void search(final int x, final int y, final long cnt) {
//      if (cnt >= mMin) {
//        return;
//      }
//
//      if (y >= mM) {
//        mMin = mGlobalMin.accumulateAndGet(cnt, Math::min);
//        return;
//      }
//
//      if (x >= mN) {
//        search(0, y + 1, cnt);
//        return;
//      }
//
//      mS[x][y] = false;
//      search(x + 1, y, cnt + count(mS, x, y, false));
//
//      if (cnt < mMin) {
//        mS[x][y] = true;
//        search(x + 1, y, cnt + count(mS, x, y, true));
//      }
//    }
//
//    long run(final long mask) {
//      /*
//       * (0,0) is WLOG false.
//       * The rest of row 0 is specified by mask.
//       */
//      for (int y = 1; y < mM; ++y) {
//        mS[0][y] = (mask & (1L << (y - 1))) != 0;
//      }
//
//      /*
//       * Obtain the best result known before starting this job.
//       * This is only done once.
//       */
//      mMin = mGlobalMin.get();
//
//      search(1, 0, 0);
//      return mMin;
//    }
//  }
//
//  @Override
//  public Z next() {
//    if (++mM > mN) {
//      ++mN;
//      mM = 1;
//    }
//
//    final long jobs = 1L << (mM - 1);
//    final AtomicLong globalMin = new AtomicLong(Long.MAX_VALUE);
//
//    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
//
//    try {
//      final List<Future<Long>> futures = new ArrayList<>();
//
//      for (long mask = 0; mask < jobs; ++mask) {
//        final long rowMask = mask;
//        futures.add(executor.submit(new Callable<Long>() {
//          @Override
//          public Long call() {
//            return new State(mN, mM, globalMin).run(rowMask);
//          }
//        }));
//      }
//
//      long min = Long.MAX_VALUE;
//      for (final Future<Long> future : futures) {
//        try {
//          min = Math.min(min, future.get());
//        } catch (final InterruptedException e) {
//          Thread.currentThread().interrupt();
//          throw new RuntimeException(e);
//        } catch (final ExecutionException e) {
//          throw new RuntimeException(e.getCause());
//        }
//      }
//
//      return Z.valueOf(min);
//
//    } finally {
//      executor.shutdown();
//    }
//  }
//}
