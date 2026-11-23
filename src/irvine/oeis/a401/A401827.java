package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;

import irvine.oeis.ParallelPermutationSequence;
import irvine.util.Point;

/**
 * A401827 allocated for Marko Radulovic.
 * @author Sean A. Irvine
 */
public class A401827 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A401827() {
    super(1);
  }

  private List<Point> doublyShaded(final int[] sigma) {
    final List<Point> d = new ArrayList<>();
    for (int i = 0; i < sigma.length; i += 2) {
      for (int j = 1; j < sigma.length; j += 2) {
        if (sigma[i] >= j && sigma[j] >= i) {
          d.add(new Point(i, j));
        }
      }
    }
    return d;
  }

  @Override
  protected long count(final int[] sigma) {
    final List<Point> d = doublyShaded(sigma);
    long count = 0;
    for (final Point p : d) {
      boolean isolated = true;
      for (final Point q : d) {
        if (q == p) {
          continue;
        }
        if (Math.max(Math.abs(p.left() - q.left()), Math.abs(p.right() - q.right())) <= 2) {
          isolated = false;
          break;
        }
      }
      if (isolated) {
        ++count;
      }
    }
    return count;
  }
}
