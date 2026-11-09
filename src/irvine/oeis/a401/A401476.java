package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a267.A267124;

/**
 * A401476 Primes p such that 2^p - 2 is a primitive practical number.
 * @author Sean A. Irvine
 */
public class A401476 extends FilterSequence {

  /** Construct the sequence. */
  public A401476() {
    super(1, new A000040(), p -> {
      final Z t = Z.TWO.pow(p).subtract(2);
      return Predicates.PRACTICAL.is(t) && A267124.isPrimitivePractical(t);
    });
  }
}

