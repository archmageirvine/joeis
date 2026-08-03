package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import irvine.math.graph.Graph;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A398417 allocated for Jaan Allikvere.
 * @author Sean A. Irvine
 */
public class A398417 extends ParallelGenerateGraphsSequence {

  private static final class MyCounter implements Counter {
    private final AtomicInteger mLimit;
    private int mCount;

    private MyCounter(final AtomicInteger limit) {
      mLimit = limit;
    }

    private boolean search(final Graph g, final int maxCycle, final int start, final int first, final int parent, final int v, final int depth, final boolean[] used) {
      if (depth > maxCycle) {
        return false;
      }
      for (int u = g.nextVertex(v, -1); u >= 0; u = g.nextVertex(v, u)) {
        if (u == parent) {
          continue;
        }
        if (u == start) {
          // Found a cycle of length depth.
          if (v > first && depth >= 3 && (depth & (depth - 1)) == 0 && ++mCount > mLimit.get()) {
            return true;
          }
        } else if (u > start && !used[u]) {
          used[u] = true;
          if (search(g, maxCycle, start, first >= 0 ? first : u, v, u, depth + 1, used)) {
            return true;
          }
          used[u] = false;
        }
      }
      return false;
    }

    @Override
    public long getCount(final Graph g) {
      mCount = 0;
      final int n = g.order();
      final boolean[] used = new boolean[n];

      for (int start = 0; start < n; ++start) {
        Arrays.fill(used, false);
        used[start] = true;
        if (search(g, Integer.highestOneBit(g.order()), start, -1, -1, start, 1, used)) {
          return 0;
        }
      }

      mLimit.accumulateAndGet(mCount, Math::min);
      return 0;
    }
  }

  private static final class MySupplier implements Supplier<Counter> {

    private final AtomicInteger mLimit = new AtomicInteger();
    private final List<MyCounter> mCounters = new ArrayList<>();

    @Override
    public Counter get() {
      final MyCounter counter = new MyCounter(mLimit);
      mCounters.add(counter);
      return counter;
    }

    private void clear() {
      mCounters.clear();
      mLimit.set(Integer.MAX_VALUE);
    }

    private int min() {
      return mLimit.get();
    }
  }

  private static final MySupplier SUPPLIER = new MySupplier();

  /** Construct the sequence. */
  public A398417() {
    super(1, 1, 0, SUPPLIER);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setMinEdges(2 * mN - 1);
    gg.setMaxEdges(Integer.MAX_VALUE);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    SUPPLIER.clear();
    super.next();
    return Z.valueOf(SUPPLIER.min());
  }
}
