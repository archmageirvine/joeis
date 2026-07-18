package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397828 Reduced Dedekind psi function: a(p1^e1*...*pN^eN) = lcm((p1+1)*p1^(e1-1), ..., (pN+1)*pN^(eN-1)).
 * @author Sean A. Irvine
 */
public class A397828 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = Jaguar.factor(mN);
    Z lambda = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      lambda = lambda.lcm(p.add(1).multiply(p.pow(e - 1)));
    }
    return lambda;
  }
}
