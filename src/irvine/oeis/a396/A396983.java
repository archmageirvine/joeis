package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396983 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A396983 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Q sum = Q.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(new Q(Z.ONE, p.negate().pow(fs.getExponent(p))));
    }
    return sum.multiply(-mN).toZ();
  }
}
