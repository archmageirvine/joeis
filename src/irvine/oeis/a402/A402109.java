package irvine.oeis.a402;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A402109 a(n) is the n-th positive integer k having two distinct composite divisors with equal sums of prime factors (with multiplicity), but no proper divisor of k has this property.
 * @author Sean A. Irvine
 */
public class A402109 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A402109() {
    super(1, k -> {
      if (A402108.c(k) <= 0) {
        return false;
      }
      for (final Z p : Jaguar.factor(k).toZArray()) {
        if (A402108.c(k / p.longValue()) != 0) {
          return false;
        }
      }
      return true;
    });
  }
}
