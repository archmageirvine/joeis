package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import irvine.math.function.Functions;
import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399617 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399617 extends ParallelGenerateGraphsSequence {
  
  // Individual graphs here exceed long, hence some contortions

  private static final class MyCounter implements Counter {
    private Z mCount = Z.ZERO;

    @Override
    public long getCount(final Graph graph) {
      mCount = mCount.add(Z.valueOf(CountIndependentSets.count(graph)).pow(graph.order()).multiply(Z.NEG_ONE.pow(graph.size())).multiply(Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph))));
      return 0;
    }
  }

  private static final class MySupplier implements Supplier<Counter> {

    private final List<MyCounter> mCounters = new ArrayList<>();

    @Override
    public Counter get() {
      final MyCounter counter = new MyCounter();
      mCounters.add(counter);
      return counter;
    }

    private void clear() {
      mCounters.clear();
    }

    private Z total() {
      Z sum = Z.ZERO;
      for (final MyCounter c : mCounters) {
        sum = sum.add(c.mCount);
      }
      return sum;
    }
  }

  private static final MySupplier SUPPLIER = new MySupplier();

  /** Construct the sequence. */
  public A399617() {
    super(0, 0, 0, SUPPLIER);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }

  @Override
  public Z next() {
    SUPPLIER.clear();
    super.next();
    return SUPPLIER.total();
  }
}
