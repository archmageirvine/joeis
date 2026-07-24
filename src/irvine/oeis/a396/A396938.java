package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396938 a(1) = 1, a(n) = Product_{i=1..omega(n)} prime(i)^(m_i-1), with n = Product_{i=1..omega(n)} p_i^m_i, omega = A001221, and p_i &lt; p_(i+1).
 * @author Sean A. Irvine
 */
public class A396938 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z q = Z.TWO;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(q.pow(fs.getExponent(p) - 1));
      q = mPrime.nextPrime(q);
    }
    return prod;
  }
}
