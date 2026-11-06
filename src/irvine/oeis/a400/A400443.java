package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400443 Numbers k such that k is an automorphic number in at least one base b in the range [2, k-2].
 * @author Sean A. Irvine
 */
public class A400443 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long b = 2; b < mN - 1; ++b) {
        if (Predicates.AUTOMORPHIC.is(b, mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
