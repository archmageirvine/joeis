package irvine.oeis.a400;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.a384.A384222;

/**
 * A400194 Maximum number of terms in a 2-dense sublist of divisors of n.
 * @author Sean A. Irvine
 */
public class A400194 extends A384222 {

  @Override
  public Z next() {
    mA.clear();
    step();
    return Z.valueOf(IntegerUtils.max(mA));
  }
}

