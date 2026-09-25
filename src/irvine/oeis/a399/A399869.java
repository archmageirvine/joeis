package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048675;

/**
 * A399869 Number of steps required for n to reach 1 under repeated application of A048675, which encodes the exponents in the prime factorization of n as a binary integer; or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A399869 extends Sequence1 {

  private final DirectSequence mS = new A048675();
  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.isOne()) {
      ++cnt;
      m = mS.a(m);
      //System.out.println(mN + " cnt=" + cnt + " m=" + m);
    }
    return Z.valueOf(cnt);
  }
}
