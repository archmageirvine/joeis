package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006325;

/**
 * A396882 a(n) is the number of distinct triplets of triangles chosen from n^2 unit triangles of a triangular grid up to rotation and reflection such that all three triangles lie in the same row parallel to a side of the grid.
 * @author Sean A. Irvine
 */
public class A396882 extends Combiner {

  /** Construct the sequence. */
  public A396882() {
    super(1, new A396761(), new A006325().skip(), SUBTRACT);
  }
}
