package irvine.oeis.a396;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A396149 Number of connected graphs on n vertices where every edge is part of at least one triangle.
 * @author Sean A. Irvine
 */
public class A396149 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A396149() {
    super(-1, 0, 0, () -> g -> {
      for (int u = 0; u < g.order(); ++u) {
        for (int v = g.nextVertex(u, u); v >= 0; v = g.nextVertex(u, v)) {
          // Check (u,v) is in a triangle
          boolean ok = false;
          for (int w = g.nextVertex(v, -1); w >= 0; w = g.nextVertex(v, w)) {
            if (g.isAdjacent(w, u)) {
              ok = true;
              break;
            }
          }
          if (!ok) {
            return 0;
          }
        }
      }
      return 1;
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(Math.min(2, mN));
    gg.setConnectionLevel(1);
  }
}
