package irvine.oeis.a396;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396340 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A396340 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      if (Predicates.FIBONACCI.is(mP.subtract(q))) {
        return mP;
      }
    }
  }
}
