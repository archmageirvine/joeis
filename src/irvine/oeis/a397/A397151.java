package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397151 allocated for Mohammad F. Marashdeh.
 * @author Sean A. Irvine
 */
public class A397151 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> Binomial.binomial(Math.max(mN - 1 - 2 * k * (k - 1), 0), k - 1));
  }
}

