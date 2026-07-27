package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A397134 Primes p such that p divides the numerator of the Bernoulli number B_{p-5}.
 * @author Sean A. Irvine
 */
public class A397134 extends FilterSequence {

  /** Construct the sequence. */
  public A397134() {
    super(1, new A000040(), p -> {
      if (p.compareTo(Z.SEVEN) < 0) {
        return false;
      }
      final Z p2 = p.square();
      Z sum = Z.ZERO;
      for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
        final Z t = k.modInverse(p2).modPow(4, p2);
        sum = sum.add(t);
      }
      return sum.mod(p2).isZero();
    });
  }
}

