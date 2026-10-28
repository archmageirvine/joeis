package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400885 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A400885 extends Sequence2 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    final Z t = Functions.SIGMA0.z(n).subtract(m) ;
    return t.divide(Functions.GCD.z(t, Z.valueOf(n * m).subtract(Functions.SIGMA1.z(n))));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM);
  }
}

