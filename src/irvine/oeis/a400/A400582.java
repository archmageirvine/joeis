package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400582 Convolution of the number of dissections of a convex (n+2)-gon into triangles and quadrilaterals by nonintersecting diagonals (A001002).
 * @author Sean A. Irvine
 */
public class A400582 extends CachedSequence {

  /** Construct the sequence. */
  public A400582() {
    super(0, Long.class, (self, n) -> {
      if (n < 3) {
        return Z.valueOf(n + 1);
      }
      return self.a(n - 2).multiply(3 * n - 8).multiply(3 * n - 7).multiply(3)
        .add(self.a(n - 1).multiply(11 * n - 14).multiply(2 * n - 2))
        .divide(5 * (n - 1)).divide(n);
    });
  }
}
