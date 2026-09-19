package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048675;

/**
 * A399774.
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
    }
    return Z.valueOf(cnt);
  }
}
