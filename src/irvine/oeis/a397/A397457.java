package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A397457 allocated for Thomas Scheuerle.
 * @author Sean A. Irvine
 */
public class A397457 extends Sequence0 {

  private final Sequence mPrimes = new A000040();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Q p = new Q(mPrimes.next());
    return Rationals.SINGLETON.product(1, mN, k -> p.add(new Q(1, k))).toZ();
  }
}
