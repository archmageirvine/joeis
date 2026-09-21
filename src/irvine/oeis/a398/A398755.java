package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398755 Number of steps to reach 1 starting from n when the function f(x) = x/7 if 7 divides x, and x+ceiling(x/7) otherwise is iterated, or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A398755 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.isOne()) {
      m = m.mod(7) == 0 ? m.divide(7) : m.add(m.add(6).divide(7));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
