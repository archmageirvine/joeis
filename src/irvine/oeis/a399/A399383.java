package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399383 allocated for Meghanto Majumder.
 * @author Sean A. Irvine
 */
public class A399383 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z k = Z.valueOf(mM);
    return Integers.SINGLETON.sum(0, mN - mM, i -> Binomial.binomial(mN, i).multiply(Functions.STIRLING1.z(mN - i, mM).abs()).multiply(k.pow(i)));
  }
}

