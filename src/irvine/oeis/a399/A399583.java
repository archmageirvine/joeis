package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A399583 a(n) = floor((4*p+3)*Product_{q prime, q&lt;=p}(1-1/q)) with p = A001359(n).
 * @author Sean A. Irvine
 */
public class A399583 extends A001359 {

  @Override
  public Z next() {
    final Z p = super.next();
    Q prod = Q.valueOf(p.multiply(4).add(3));
    for (Z q = Z.TWO; q.compareTo(p) <= 0; q = mPrime.nextPrime(q)) {
      prod = prod.multiply(new Q(q.subtract(1), q));
    }
    return prod.floor();
  }
}

