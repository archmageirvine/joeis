package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a246.A246547;

/**
 * A399632 Numbers k = p*q^2, where p and q are distinct primes, such that k+1 is a prime power with exponent &gt;= 2.
 * @author Sean A. Irvine
 */
public class A399632 extends A246547 {

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      final Z pp1 = pp.subtract(1);
      if (Functions.OMEGA.i(pp1) == 2 && Functions.BIG_OMEGA.i(pp1) == 3) {
        return pp1;
      }
    }
  }
}

