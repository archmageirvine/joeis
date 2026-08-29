package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399109 Sum of the cubes of the coefficients of (x + y + 2*z)^n.
 * @author Sean A. Irvine
 */
public class A399109 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A399109() {
    super(0, 0, GenerateGraphs.K4_FREE, () -> g -> Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g)).longValueExact());
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }
}
