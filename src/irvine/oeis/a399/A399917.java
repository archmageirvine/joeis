package irvine.oeis.a399;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence0;

/**
 * A399917 Irregular triangle read by rows: T(n,k) is the number of triangle-free graphs on n unlabeled nodes with exactly k edges, 0 &lt;= k &lt;= floor(n^2/4).
 * @author Sean A. Irvine
 */
public class A399917 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN * mN / 4) {
      ++mN;
      mM = 0;
    }
    if (mN <= 3) {
      return Z.ONE;
    }
    final ParallelGenerateGraphsSequence s = new ParallelGenerateGraphsSequence(mN - 1, mN - 1, GenerateGraphs.TRIANGLE_FREE, () -> Counter.ONE) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(mM);
          gg.setMaxEdges(mM);
          gg.setConnectionLevel(0);
        }
      };
    return s.next();
  }
}

