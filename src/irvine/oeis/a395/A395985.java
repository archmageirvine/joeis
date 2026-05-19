package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A395985 Smallest base such that n is a repunit in that base.
 * @author Sean A. Irvine
 */
public class A395985 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long b = 1;
    while (true) {
      if (Predicates.REPUNIT.is(++b, mN)) {
        return Z.valueOf(b);
      }
    }
  }
}
