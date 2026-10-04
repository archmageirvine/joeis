package irvine.oeis.a400;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.a384.A384225;

/**
 * A400195 Maximum number of odd terms in a 2-dense sublist of divisors of n.
 * @author Sean A. Irvine
 */
public class A400195 extends A384225 {

  @Override
  public Z next() {
    mA.clear();
    step();
    return Z.valueOf(IntegerUtils.max(mA));
  }
}

