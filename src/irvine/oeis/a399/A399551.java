package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399551 Numbers k, such that Sum_{d|k} gpf(d) is a multiple of gpf(k), where gpf = A006530.
 * @author Sean A. Irvine
 */
public class A399551 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399551() {
    super(1, k -> {
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(k).divisors()) {
        sum = sum.add(Functions.GPF.z(d));
      }
      return sum.mod(Functions.GPF.z(k)).isZero();
    });
  }
}
