package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401146 allocated for Carlos Alberto Terencio de Bastos.
 * @author Sean A. Irvine
 */
public class A401146 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (Predicates.POWER_OF_TWO.is(mA)) {
      mA = Z.valueOf(++mN);
      return mA;
    }
    mA = mA.multiply(3).add(Z.ONE.shiftLeft(Functions.VALUATION.l(mA, 2)));
    return mA;
  }
}
