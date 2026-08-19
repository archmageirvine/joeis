package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398636 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A398636 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z m = Binomial.binomial(++mN, 3);
    return Functions.FACTORIAL.z(m.add(mN)).multiply(Functions.FACTORIAL.z(mN))
      .divide(Integers.SINGLETON.product(1, mN, k -> m.add(k).subtract(Binomial.binomial(mN - k, 3))));
  }
}

