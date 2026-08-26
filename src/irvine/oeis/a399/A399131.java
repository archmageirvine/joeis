package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399131 allocated for Eric Desbiaux.
 * @author Sean A. Irvine
 */
public class A399131 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final int omega = fs.omega();
    Z sum = Z.ZERO;
    int k = 0;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Z.valueOf(fs.getExponent(p)).shiftLeft(omega - 1 - k++));
    }
    return sum;
  }
}
