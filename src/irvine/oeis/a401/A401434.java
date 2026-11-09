package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401434 Primes of the form 3*(p-1)^2 + 1, where p is prime.
 * @author Sean A. Irvine
 */
public class A401434 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1).square().multiply(3).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

