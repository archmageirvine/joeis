package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401858 a(1) = 3; for n &gt; 1, a(n) is the smallest positive integer not yet in the sequence that, together with some earlier term, forms two sides of a Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A401858 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();

  @Override
  public Z next() {
    if (mUsed.isEmpty()) {
      mUsed.add(Z.THREE);
      return Z.THREE;
    }
    Z y = Z.ZERO;
    while (true) {
      y = y.add(1);
      if (!mUsed.contains(y)) {
        final Z y2 = y.square();
        for (final Z x : mUsed) {
          final Z x2 = x.square();
          if (Predicates.SQUARE.is(y2.add(x2))) {
            mUsed.add(y);
            return y;
          }
          if (Predicates.SQUARE.is(y2.subtract(x2).abs())) {
            mUsed.add(y);
            return y;
          }
        }
      }
    }
  }
}
