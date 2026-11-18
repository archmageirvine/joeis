package irvine.oeis.a402;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402188 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A402188 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;


  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(5);
      if (Predicates.SQUARE_FREE.is(mA.subtract(1).divide(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
