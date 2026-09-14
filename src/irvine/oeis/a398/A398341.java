package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398341 a(n) is the number of die sizes &lt; n that can produce n as the product of two identical dice.
 * @author Sean A. Irvine
 */
public class A398341 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long d = Functions.SQRT.l(++mN);
    while (mN % d != 0) {
      --d;
    }
    return Z.valueOf(mN - mN / d);
  }
}
