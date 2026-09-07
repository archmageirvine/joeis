package irvine.oeis.a399;

import java.util.LinkedList;

import irvine.math.graph.Graph;
import irvine.math.graph.MaximumIndependentSet;
import irvine.math.graph.VertexConnectivity;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence2;

/**
 * A399459 allocated for Allan Bickle.
 * @author Sean A. Irvine
 */
public class A399459 extends Sequence2 {

  private int mDegree = 1;
  private int mOrder = 1;
  private boolean mNonzero = false;
  private final LinkedList<Z> mA = new LinkedList<>();

  private int maxOrder(final int degree) {
    return 4 * degree; // todo needs refinement
  }

  private boolean is(final Graph g) {
    return g.diameter() == 2 && MaximumIndependentSet.size(g) == VertexConnectivity.connectivity(g);
  }

  private Z t(final int degree, final int order) {
    if (degree == 1) {
      return order == 2 ? Z.ONE : Z.ZERO;
    }
    final ParallelGenerateGraphsSequence s = new ParallelGenerateGraphsSequence(order - 1, order - 1, GenerateGraphs.TRIANGLE_FREE, () -> g -> is(g) ? 1 : 0) {
      @Override
      protected void graphGenInit(final GenerateGraphs gg) {
        gg.setVertices(order);
        gg.setMinDeg(degree);
        gg.setMaxDeg(degree);
        gg.setMinEdges(0);
        gg.setMaxEdges(order * (order - 1) / 2);
        gg.setConnectionLevel(1);
      }
    };
    return s.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (!mA.isEmpty()) {
        return mA.pollFirst();
      }
      while (true) {
        if (++mOrder > maxOrder(mDegree)) {
          // Prune off any trailing zeros in pending results
          while (!mA.isEmpty() && mA.peekLast().isZero()) {
            mA.pollLast();
          }
          ++mDegree;
          mOrder = 1;
          mNonzero = false;
          break;
        }
        final Z t = t(mDegree, mOrder);
        if (!t.isZero()) {
          // Found a nonzero result, we can now safely output
          mNonzero = true;
          mA.add(t);
          break;
        }
        if (mNonzero) {
          mA.add(t);
        }
      }
    }
  }

  /**
   * Run a specific point.
   * @param args degree order
   */
  public static void main(final String... args) {
    final A399459 s = new A399459();
    System.out.println(s.t(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}

