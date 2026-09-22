package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002862.
 * @author Sean A. Irvine
 */
public class A400137 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  private static long gcid(final long n, final long m) {
    long prod = 1;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      prod *= p.pow(fs.getExponent(p) & Functions.VALUATION.l(m, p)).longValueExact();
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(gcid(mN, mM));
  }
}

