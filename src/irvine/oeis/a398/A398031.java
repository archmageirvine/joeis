package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398031 Least composite k such that the concatenation (k, n, k) is prime.
 * @author Sean A. Irvine
 */
public class A398031 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long k = 8;
    while (true) {
      if (Predicates.PRIME.is(++k)) {
        ++k;
      }
      if (new Z(k + s + k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
