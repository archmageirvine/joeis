package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033676;

/**
 * A398333 Number of integers r, 1&lt;=r&lt;n, such that L(n*r) &lt; L(n*r+1) where L(x) is the largest divisor of x &lt;= the square root of x.
 * @author Sean A. Irvine
 */
public class A398333 extends Sequence1 {

  private final DirectSequence mL = DirectSequence.create(new A033676());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 1; r < mN; ++r) {
      if (mL.a(mN * r).compareTo(mL.a(mN * r + 1)) < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
