package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397371 a(n) = n times the square root of the smallest square number greater than n.
 * @author Sean A. Irvine
 */
public class A397371 extends Sequence0 {
  
  private long mN = -1;

  @Override
  public Z next() {
    return Functions.SQRT.z(++mN).multiply(mN).add(mN);
  }
}
