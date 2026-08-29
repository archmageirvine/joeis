package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A399133 Superior factor-dense numbers: where records are set for d(k)/exp(log(k)/(1+log(1+log(k)))), where d(k) = A000005(k), the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A399133 extends A002182 {

  private CR mBest = CR.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final CR log = CR.valueOf(n).log();
      final CR v = CR.valueOf(Functions.SIGMA0.z(n)).divide(log.divide(log.add(1).log().add(1)).exp());
      if (v.compareTo(mBest) > 0) {
        mBest = v;
        return n;
      }
    }
  }
}

