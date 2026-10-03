package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003226 Automorphic numbers: m^2 ends with m.
 * @author Sean A. Irvine
 */
public class A400433 extends Sequence1 {

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
