package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396458 Integers x such that there exist two integers 0&lt;y&lt;=z such that sigma(x)*psi(x)*phi(x)^2 = x^3 + y^3 + z^3.
 * @author Sean A. Irvine
 */
public class A396458 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396458() {
    super(1, k -> {
      final Z d = Functions.SIGMA1.z(k).multiply(Functions.DEDEKIND_PSI.z(k)).multiply(Functions.PHI.z(k).square()).subtract(Z.valueOf(k).pow(3));
      for (long y = 1; y <= Functions.CBRT.l(d); ++y) {
        final Z y3 = Z.valueOf(y).pow(3);
        final Z t = d.subtract(y3);
        if (t.compareTo(y3) < 0) {
          break;
        }
        if (Predicates.CUBE.is(t)) {
          return true;
        }
      }
      return false;
    });
  }
}
