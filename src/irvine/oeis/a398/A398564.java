package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398564 Triangle read by rows: T(n,k) is the greatest common divisor of the numbers of ways to form j simultaneous cross-team handshakes between teams of n and k distinct people, with each person participating in at most one handshake, for 1 &lt;= j &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A398564 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).multiply(mM).divide(Functions.RAD.l(Functions.GCD.l(mN, mM)));
  }
}

