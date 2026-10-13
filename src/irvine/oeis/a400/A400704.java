package irvine.oeis.a400;

import java.util.function.Supplier;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A400704 allocated for Pawe\u0142 Kwaczy\u0144ski.
 * @author Sean A. Irvine
 */
public class A400704 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A400704(final int offset, final Supplier<Counter> counterFactory) {
    super(offset, -1, 12, 0, counterFactory);
  }

  /** Construct the sequence. */
  public A400704(final int offset) {
    this(offset, () -> Counter.ONE);
  }

  /** Construct the sequence. */
  public A400704() {
    this(0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (2 * mN - 1));
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setConnectionLevel(1);
    gg.setPruner((g, n) -> GraphUtils.hasCycle(g, 4) || GraphUtils.hasCycle(g, 8));
  }

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    return super.next();
  }
}
