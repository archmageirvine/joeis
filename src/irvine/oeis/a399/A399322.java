package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399322 allocated for Ivan Damnjanovi\u0107.
 * @author Sean A. Irvine
 */
public class A399322 extends ParallelGenerateGraphsSequence {

  // todo apparently does not match definition

  private static boolean isTransmissionIrregular(final Graph graph) {
    if (graph.order() == 1) {
      return true;
    }
//    if (graph.order() < 7) {
//      return false;
//    }
    final int sum = Functions.SUM.i(graph.distanceVector(0));
    System.out.println(graph + " " + sum);
    for (int u = 1; u < graph.order(); ++u) {
      if (Functions.SUM.i(graph.distanceVector(u)) != sum) {
        return true;
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A399322() {
    super(0, 0, 0, () -> graph -> isTransmissionIrregular(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setMaxDeg(mN - 1);
    gg.setConnectionLevel(1);
  }
}
