package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398743 Triangle by rows: T(n,1) = 1, T(n,k) = (A000217(k-1) + 1) mod n, for k &gt; 1. Row T(n) contains n terms if n is odd, or 2*n terms if n is even.
 * @author Sean A. Irvine
 */
public class A398743 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * (2 - (mN & 1))) {
      ++mN;
      mM = 1;
    }
    return mM == 1 ? Z.ONE : Functions.TRIANGULAR.z(mM - 1).add(1).modZ(mN);
  }
}
