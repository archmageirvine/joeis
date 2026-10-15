package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A400666 The smallest integer k greater than n such that c(k) is divisible by c(n), where c(n) is formed by concatenating 1, 2, 3, ..., n.
 * @author Sean A. Irvine
 */
public class A400666 extends A007908 {

  @Override
  public Z next() {
    final Z mod = super.next();
    long mul = 10;
    while (mul <= mN) {
      mul *= 10;
    }
    long k = mN;
    Z t = mod;
    do {
      if (++k == mul) {
        mul *= 10;
      }
      t = t.modMultiply(mul, mod).add(k).mod(mod);
    } while (!t.isZero());
    return Z.valueOf(k);
  }
}
