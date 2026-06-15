package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A396764 Nonprimes whose average of aliquot divisors and average of divisors are both integers.
 * @author Sean A. Irvine
 */
public class A396764 extends FilterSequence {

  /** Construct the sequence. */
  public A396764() {
    super(1, new A002808(), k -> {
      final Z s1 = Functions.SIGMA1.z(k);
      final long s0 = Functions.SIGMA0.l(k);
      return s1.mod(s0) == 0 && s1.subtract(k).mod(s0 - 1) == 0;
    });
  }
}

