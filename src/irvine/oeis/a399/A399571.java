package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A399571 Primes p such that 2^p-1 has a divisor d with 1&lt;d&lt;2^p-1 and d == 1 (mod 2*p^2).
 * @author Sean A. Irvine
 */
public class A399571 extends FilterSequence {

  /** Construct the sequence. */
  public A399571() {
    super(1, new A000040(), p -> {
      final Z mod = p.square().multiply2();
      final Z m = Z.TWO.pow(p).subtract(1);
      for (final Z d : Jaguar.factor(m).divisors()) {
        if (!d.isOne() && !d.equals(m) && d.mod(mod).isOne()) {
          return true;
        }
      }
      return false;
    });
  }
}

