package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a037.A037077;

/**
 * A401206 Indices in a greedy approximation to the Marvin Ray Burns (MRB) constant using f(m) = 2*m^(-1/m)*sin(Pi/m)/Pi.
 * @author Sean A. Irvine
 */
public class A401206 extends Sequence0 {

  private static final CR MRB = new A037077().getCR();
  private CR mResidual = MRB;

  private CR f(final Z m) {
    final CR x = CR.valueOf(m);
    return CR.TWO.divide(CR.PI).multiply(x.log().divide(x).negate().exp()).multiply(CR.PI.divide(x).sin());
  }

  private Z greedyIndex(final CR t) {
    if (t.compareTo(f(Z.FOUR)) >= 0) {
      return Z.FOUR;
    }
    Z hi = Z.FOUR;
    while (f(hi).compareTo(t) > 0) {
      hi = hi.shiftLeft(1);
    }
    Z lo = hi.shiftRight(1);
    while (hi.subtract(lo).compareTo(Z.ONE) > 0) {
      final Z mid = lo.add(hi).shiftRight(1);
      if (f(mid).compareTo(t) > 0) {
        lo = mid;
      } else {
        hi = mid;
      }
    }
    final CR dlo = t.subtract(f(lo)).abs();
    final CR dhi = t.subtract(f(hi)).abs();
    return dlo.compareTo(dhi) <= 0 ? lo : hi;
  }

  @Override
  public Z next() {
    final Z result = greedyIndex(mResidual.abs());
    mResidual = mResidual.subtract(f(result).multiply(CR.valueOf(mResidual.signum())));
    return result;
  }
}
