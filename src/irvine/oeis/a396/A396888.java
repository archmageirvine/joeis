package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396888 Even integers whose ratio of the sum of their nontrivial even divisors to the sum of their nontrivial odd divisors is itself a divisor.
 * @author Sean A. Irvine
 */
public class A396888 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396888() {
    super(1, 12, 2, k -> {
      Z even = Z.valueOf(-k);
      Z odd = Z.ZERO;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!d.isOne()) {
          if (d.isEven()) {
            even = even.add(d);
          } else {
            odd = odd.add(d);
          }
        }
      }
      return !odd.isZero() && even.mod(odd).isZero() && k % even.divide(odd).longValueExact() == 0;
    });
  }
}
