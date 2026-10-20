package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.List;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;
import irvine.util.array.DynamicIntArray;

/**
 * A400804 allocated for Vicenzo P DeMaar.
 * @author Sean A. Irvine
 */
public class A400804 extends Sequence1 {

  // After Vicenzo P DeMaar

  private int mM = 35;
  private long mHighest = 0;

  private long b(final int m) {
    final List<Point> edges = new ArrayList<>();
    for (int d = 2; d <= m / 2; ++d) {
      for (int j = 2 * d; j <= m; j += d) {
        edges.add(new Point(d, j));
      }
    }
    // Remap to remove isolated values
    int vertices = 0;
    final DynamicIntArray pos = new DynamicIntArray();
    for (final Point pt : edges) {
      if (pos.get(pt.left()) == 0) {
        pos.set(pt.left(), ++vertices);
      }
      if (pos.get(pt.right()) == 0) {
        pos.set(pt.right(), ++vertices);
      }
    }
    // Build adjacency matrix without isolated vertices
    final Matrix<Q> mat = new DefaultMatrix<>(vertices, vertices, Q.ZERO);
    for (final Point pt : edges) {
      final int x = pos.get(pt.left()) - 1;
      final int y = pos.get(pt.right()) - 1;
      mat.set(x, y, Q.ONE);
      mat.set(y, x, Q.ONE);
    }
    final MatrixField<Q> fld = new MatrixField<>(vertices, Rationals.SINGLETON);
    return vertices - fld.rank(mat);
  }

  @Override
  public Z next() {
    while (true) {
      final long value = b(++mM);
      if (mHighest < value) {
        ++mHighest;
        return Z.valueOf(mM);
      }
    }
  }
}
