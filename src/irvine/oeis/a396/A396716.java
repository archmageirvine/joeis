package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396716 Number of composite numbers m, Omega(m) &gt;= 3, with k &lt;= m &lt;= k^2 such that the largest divisor of k*m that is &lt;= sqrt(k*m) equals k.
 * @author Sean A. Irvine
 */
public class A396716 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fn = Jaguar.factor(++mN);
    long cnt = 0;
    final Z n = Z.valueOf(mN);
    for (Z m = n; m.compareTo(n.square()) <= 0; m = m.add(1)) {
      final FactorSequence f = Jaguar.factor(m);
      if (f.bigOmega() >= 3) {
        final FactorSequence fm = new FactorSequence(f);
        fm.merge(fn);
        final Z lim = Functions.SQRT.z(m.multiply(mN));
        Z best = Z.ONE;
        for (final Z d : fm.divisors()) {
          if (d.compareTo(best) > 0 && d.compareTo(lim) <= 0) {
            best = d;
          }
        }
        if (best.equals(mN)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
