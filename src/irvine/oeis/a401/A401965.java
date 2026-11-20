package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401965 a(n) is the smallest number k such that 2*(k+n) = sigma(k) + n*tau(k).
 * @author Sean A. Irvine
 */
public class A401965 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA1.z(++k).add(Functions.SIGMA0.l(k) * mN).equals(2 * (k + mN))) {
        return Z.valueOf(k);
      }
    }
  }
}

