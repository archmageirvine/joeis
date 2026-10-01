package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400362 allocated for Dario T. de Castro.
 * @author Sean A. Irvine
 */
public class A400362 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long b = 2; b < mN - 1; ++b) {
        if (Predicates.REPDIGIT.is(b, mN)) {
          return Z.valueOf(b);
        }
      }
    }
  }
}
