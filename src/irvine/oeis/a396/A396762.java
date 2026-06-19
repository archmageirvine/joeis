package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A396762 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A396762 extends A396761 {

  @Override
  public Z next() {
    return super.next().subtract(Binomial.binomial(mN, 3));
  }
}

