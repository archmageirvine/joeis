package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006324;

/**
 * A396468 a(n) is the number of distinct triplets of triangles chosen from n^2 unit triangles of a triangular grid, excluding rotationally equivalent configurations and triplets in which all three triangles lie in the same row parallel to a side of the grid.
 * @author Sean A. Irvine
 */
public class A396468 extends Combiner {

  /** Construct the sequence. */
  public A396468() {
    super(1, new A396285(), new A006324().prepend(0), SUBTRACT);
  }
}
