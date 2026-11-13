package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401840 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A401840 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long i = 0;
    long z = 0;
    while (true) {
      ++z;
      for (long y = 1; y <= z; ++y) {
        for (long x = z - y + 2; x <= y; x += 2) {
          if (Functions.GCD.l(x, y, z) == 1) {
            final long s = (x + y + z) / 2;
            final Z q = Z.valueOf(s).multiply(s - x).multiply(s - y).multiply(s - z);
            if (Predicates.SQUARE.is(q)) {
              if (++i == mN) {
                final Z l = Functions.LCM.z(x, y, z);
                final Z m = q.sqrt();
                return l.divide(Functions.GCD.z(l, m)).square().multiply(m);
              }
            }
          }
        }
      }
    }
  }
}
