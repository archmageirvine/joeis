package irvine.oeis.a401;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401312 allocated for Mourad Belafsahi.
 * @author Sean A. Irvine
 */
public class A401312 extends A000040 {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).pow(super.next())));
    return select(mSum);
  }
}
