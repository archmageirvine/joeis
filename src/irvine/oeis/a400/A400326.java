package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A003094.
 * @author Sean A. Irvine
 */
public class A400326 extends ParallelGenerateGraphsSequence {

  private static final class MyCounter implements Counter {
    private Z mSum = Z.ZERO;

    @Override
    public long getCount(final Graph g) {
      mSum = mSum.add(Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g)));
      return 0;
    }
  }

  private static final class MySupplier implements Supplier<Counter> {
    private final List<MyCounter> mCounters = new ArrayList<>();

    private void clear() {
      mCounters.clear();
    }

    @Override
    public Counter get() {
      final MyCounter counter = new MyCounter();
      mCounters.add(counter);
      return counter;
    }

    private Z totalCount() {
      Z total = Z.ZERO;
      for (final MyCounter c : mCounters) {
        total = total.add(c.mSum);
      }
      return total;
    }
  }

  private static final MySupplier SUPPLIER = new MySupplier();


  /** Construct the sequence. */
  public A400326() {
    super(-1, -1, GenerateGraphs.BIPARTITE, SUPPLIER);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(2);
    gg.setPruner((graph, n) -> !graph.isPlanar());
  }

  @Override
  public Z next() {
    SUPPLIER.clear();
    super.next();
    return SUPPLIER.totalCount();
  }
}
