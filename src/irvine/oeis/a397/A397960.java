package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A397960 a(n) is the maximum number of distinct positive differences of an n-element subset of {0, 1, ..., n*(n-1)/2}.
 * @author Sean A. Irvine
 */
public class A397960 extends Sequence3 {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));
  private int mN = 2;

  private static class Search {

    private final int mN;
    private final int mM;
    private final int[] mPos;
    private final AtomicInteger mGlobalBest;

    private int mBest;

    Search(final int n, final int m, final AtomicInteger globalBest) {
      mN = n;
      mM = m;
      mPos = new int[n];
      mGlobalBest = globalBest;
    }

    private void search(final int d, final int lo, final BitSet seen) {
      final int card = seen.cardinality();

      if (d == mN) {
        if (card > mBest) {
          mBest = card;
          mGlobalBest.accumulateAndGet(card, Math::max);
        }
        return;
      }

      final int rem = (mN - d) * (mN - d - 1) / 2
        + d * (mN - d);

      final int best = Math.max(mBest, mGlobalBest.get());
      if (card + Math.min(rem, mM - card) <= best) {
        return;
      }

      final int[] added = new int[d];

      for (int v = lo; v <= mM - (mN - 1 - d); ++v) {
        mPos[d] = v;

        int addedCount = 0;
        for (int i = 0; i < d; ++i) {
          final int diff = v - mPos[i];
          if (!seen.get(diff)) {
            seen.set(diff);
            added[addedCount++] = diff;
          }
        }

        search(d + 1, v + 1, seen);

        for (int i = 0; i < addedCount; ++i) {
          seen.clear(added[i]);
        }
      }
    }

    int run(final int v1, final int v2) {
      mPos[1] = v1;
      mPos[2] = v2;

      final BitSet seen = new BitSet(mM + 1);
      seen.set(v1);
      seen.set(v2);
      seen.set(v2 - v1);

      mBest = seen.cardinality();
      return searchAndGet(3, v2 + 1, seen);
    }

    private int searchAndGet(final int d, final int lo, final BitSet seen) {
      search(d, lo, seen);
      return mBest;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int m = mN * (mN - 1) / 2;
    final AtomicInteger globalBest = new AtomicInteger();
    final ExecutorService pool = Executors.newFixedThreadPool(THREADS);
    final List<Future<Integer>> futures = new ArrayList<>();
    try {
      for (int v1 = 1; v1 <= m - (mN - 2); ++v1) {
        for (int v2 = v1 + 1; v2 <= m - (mN - 3); ++v2) {
          final int u1 = v1;
          final int u2 = v2;
          futures.add(pool.submit(() -> new Search(mN, m, globalBest).run(u1, u2)));
        }
      }
      int best = 0;
      for (final Future<Integer> future : futures) {
        best = Math.max(best, future.get());
      }
      return Z.valueOf(best);
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (final ExecutionException e) {
      throw new RuntimeException(e.getCause());
    } finally {
      pool.shutdown();
    }
  }
}
