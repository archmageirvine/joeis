package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A400292 Length of the common period length of the smallest n-tuple (for the sup norm) of primes whose reciprocals have the same period length in base 10.
 * @author Sean A. Irvine
 */
public class A400292 extends A400291 {

  @Override
  public Z next() {
    step();
    Z prod = Z.ONE;
    for (final Z p : mRow) {
      prod = prod.lcm(Functions.ORDER.z(p, 10));
    }
    return prod;
  }
}

