
package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401078 a(1)=2, a(2)=3, thereafter a(n) is the sum of the two largest primes &lt;= a(n-1).
 * @author Sean A. Irvine
 */
public class A401078 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    if (mA.equals(Z.TWO)) {
      mA = Z.THREE;
      return Z.THREE;
    }
    final Z p = Functions.PREV_PRIME.z(mA.add(1));
    mA = p.add(Functions.PREV_PRIME.z(p));
    return mA;
  }
}
