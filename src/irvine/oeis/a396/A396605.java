package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396605 The smallest difference between n and the product of a nontrivial divisor of n with the totient of that divisor.
 * @author Sean A. Irvine
 */
public class A396605 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z min = Z.valueOf(++mN).square();
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.isOne()) {
        min = min.min(d.multiply(Functions.PHI.l(d)).subtract(mN).abs());
      }
    }
    return min;
  }
}
