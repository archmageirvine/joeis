package irvine.oeis.a398;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398257 Number of unlabeled digraphs with n nodes containing a global source and a global sink, self-loops allowed.
 * @author Gregory Morse
 */
public class A398257 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final List<List<Q>> graphs = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, ++mN, Edges.DIGRAPH_WITH_LOOPS, e -> Q.TWO);
    return GraphUtils.initiallyFinallyV(Rationals.SINGLETON, graphs, e -> Q.TWO).coeff(mN).toZ();
  }
}
