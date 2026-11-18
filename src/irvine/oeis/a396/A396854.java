package irvine.oeis.a396;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396854 Number of digraphs on n unlabeled nodes with self-loops allowed and a distinguished node from which every node is reachable, counted up to isomorphism fixing the distinguished node.
 * @author Gregory Morse
 */
public class A396854 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final List<List<Q>> graphs = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, ++mN, Edges.DIGRAPH_WITH_LOOPS, e -> Q.TWO);
    return GraphUtils.pointedInitially(Rationals.SINGLETON, graphs, e -> Q.TWO).coeff(mN).toZ();
  }
}
