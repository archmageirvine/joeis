package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a069.A069835;

/**
 * A397547 a(n) = numerator of A069835(n)/2^n.
 * @author Sean A. Irvine
 */
public class A397547 extends A069835 {

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(super.next(), Z.ONE.shiftLeft(mN)));
  }
}
