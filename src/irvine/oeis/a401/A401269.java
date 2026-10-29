package irvine.oeis.a401;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A399323.
 * @author Sean A. Irvine
 */
public class A401269 extends A000040 {

  private boolean is(final Q n) {
    final List<Z> cf = ContinuedFractionUtils.continuedFraction(n);
    int k = 0;
    for (final Z t : cf) {
      if (++k > 2 && !t.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (is(new Q(p, q))) {
        return p;
      }
    }
  }
}

