package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A397571 Field trace Tr_{Q(zeta_p)/Q}(T_p(zeta_p)) of the p-term truncation of Ramanujan's third-order mock theta function f(q) at a primitive p-th root of unity, where p = prime(n+1).
 * @author Sean A. Irvine
 */
public class A397571 extends A065091 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.equals(Z.THREE) ? Z.THREE : p.mod(6) == 1 ? p.multiply2().subtract(1) : p.subtract(1);
  }
}
