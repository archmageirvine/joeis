package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400779 a(n) = Sum_{d|n} gcd(n,d+1).
 * @author Sean A. Irvine
 */
public class A400779 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.GCD.z(mN, d + 1));
  }
}
