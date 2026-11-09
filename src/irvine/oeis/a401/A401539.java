package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A401539 Semiprime residuals: a(n) = q (mod p), where p &lt;= q are the prime factors of the n-th semiprime S_n = p*q.
 * @author Sean A. Irvine
 */
public class A401539 extends A001358 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return p[p.length - 1].mod(p[0]);
  }
}

