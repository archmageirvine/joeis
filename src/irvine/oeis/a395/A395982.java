package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395982 Primes p such that the Fermat quotient q = (2^(p-1) - 1)/p mod p satisfies 1 &lt; q &lt; p and q divides p - 1.
 * @author Sean A. Irvine
 */
public class A395982 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.square();
      final Z q = Z.TWO.modPow(p.subtract(1), p2).add(p2.subtract(1)).divide(p).mod(p);
      if (q.compareTo(Z.ONE) > 0 && p.subtract(1).mod(q).isZero()) {
        return p;
      }
    }
  }
}
