package irvine.oeis.a398;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398207 Number of digraphs on n unlabeled nodes with distinguished nodes r and t (r = t if n = 1, else r != t) such that every node is reachable from r and t is reachable from every node, counted up to isomorphism fixing r and t.
 * @author Gregory Morse
 */
public class A398207 extends Sequence1 {

  private final boolean mLoops;
  private int mN = 0;

  /** Construct the sequence. */
  public A398207() {
    this(false);
  }

  /**
   * Construct the sequence with or without loops.
   * @param loops whether loops are allowed
   */
  protected A398207(final boolean loops) {
    mLoops = loops;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return mLoops ? Z.TWO : Z.ONE;
    }
    final List<List<Q>> graphs = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, mN, mLoops ? Edges.DIGRAPH_WITH_LOOPS : Edges.DIGRAPH_EDGES, e -> Q.TWO);
    return GraphUtils.doublyPointedInitiallyFinally(Rationals.SINGLETON, graphs, e -> Q.TWO).coeff(mN).toZ();
  }
}
