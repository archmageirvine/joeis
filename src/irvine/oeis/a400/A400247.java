package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A003094.
 * @author Sean A. Irvine
 */
public class A400247 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A400247() {
    super(0, 0, GenerateGraphs.BIPARTITE, () -> g -> Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g)).longValueExact());
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
    gg.setPruner((graph, n) -> !graph.isPlanar());
  }

  @Override
  public Z next() {
    return super.next();
  }
}
