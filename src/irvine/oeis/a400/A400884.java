package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400884 a(n) is the number of distinct placements of two nonoverlapping similar Pythagorean triangles whose acute angles meet to form a right angle at a corner of an n X n square.
 * @author Sean A. Irvine
 */
public class A400884 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long x = 1; x < mN; ++x) {
      for (long y = x + 1; y <= mN; ++y) {
        if (Predicates.SQUARE.is(x * x + y * y) && Functions.GCD.l(x, y) == 1) {
          final long z = Functions.SQRT.l(x * x + y * y);
          final long t = mN / y + mN / z;
          sum = sum.add(t * t);
        }
      }
    }
    return sum;
  }
}

