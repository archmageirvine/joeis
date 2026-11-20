package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397899 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A397899 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA1.z(++k).subtract(Functions.SIGMA0.l(k) * mN).equals(2 * (k - mN))) {
        return Z.valueOf(k);
      }
    }
  }
}

