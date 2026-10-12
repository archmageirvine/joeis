package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400688 Triangle of the Catalan Pell numbers read by rows: T(n,k) = [x^n] (1 - 2*x - Sum_{h=1..k-1} A000108(h)*x^(h+1))^(-1), with 0 &lt; k &lt;= n.
 * @author Sean A. Irvine
 */
public class A400688 extends Sequence1 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private static final Z NEG2 = Z.valueOf(-2);
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return SZ.pow(new AbstractInfiniteSeries<>() {
      @Override
      public Z coeff(final long n) {
        if (n > mM) {
          return Z.ZERO;
        }
        if (n == 0) {
          return Z.ONE;
        }
        if (n == 1) {
          return NEG2;
        }
        return Functions.CATALAN.z(n - 1).negate();
      }
    }, -1).coeff(mN);
  }
}
