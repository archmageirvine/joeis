package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397483 Numbers k such that tau(k - d) = tau(k) = tau(k + d), where 1 &lt;= d &lt;= k/4 is some divisor of k and tau(i) = A000005(i).
 * @author Sean A. Irvine
 */
public class A397483 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397483() {
    super(1, k -> {
      final Z t = Functions.SIGMA0.z(k);
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (d.multiply(4).compareTo(k) <= 0 && Functions.SIGMA0.z(k - d.longValue()).equals(t) && Functions.SIGMA0.z(k + d.longValue()).equals(t)) {
          return true;
        }
      }
      return false;
    });
  }
}
