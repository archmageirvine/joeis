package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002033;

/**
 * A398628 Square array T(n,k), n &gt;= 0, k &gt;= 1, read by antidiagonals: T(n,k) is the number of multiplicative perfect partitions of (p_1 * p_2 * ... * p_k)^n into parts &gt; 1, for k distinct primes.
 * @author Sean A. Irvine
 */
public class A398628 extends Sequence0 {

  private final DirectSequence mS = new A002033();
  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mS.a(mM).pow(mN - mM + 1);
  }
}
