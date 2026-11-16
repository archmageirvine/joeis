package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401866 a(n) = Sum_{d|n} d * floor(sqrt(d-1)).
 * @author Sean A. Irvine
 */
public class A401866 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.SQRT.z(d - 1).multiply(d));
  }
}
