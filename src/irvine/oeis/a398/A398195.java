package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398195 Semiprimes p*q such that p^2*q is a triangular number.
 * @author Sean A. Irvine
 */
public class A398195 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++mN);
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.omega() == 2 && fs.bigOmega() == 3) {
        final Z[] v = fs.toZArray();
        return v[0].multiply(v[1]);
      }
    }
  }
}
