package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a275.A275314;

/**
 * A397104 Triangle read by rows: T(n, k) = n + A275314(k) - 1, for 1 &lt;= k &lt;= n and gcd(n, k) = 1.
 * @author Sean A. Irvine
 */
public class A397104 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A275314());
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      if (Functions.GCD.l(mN, mM) == 1) {
        return mA.a(mM).add(mN - 1);
      }
    }
  }
}
