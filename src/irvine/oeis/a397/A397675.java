package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a137.A137695;

/**
 * A397675 Table of D(p, n) read by antidiagonals: Difference sequence of the generalized p-peg Tower of Hanoi (Frame-Stewart algorithm).
 * @author Sean A. Irvine
 */
public class A397675 extends A137695 {

  private int mN = 0;
  private int mM = -1;

  @Override
  protected Z t(final long n, final long p) {
    if (n == 0) {
      return Z.ONE;
    }
    return super.t(n + 1, p).subtract(super.t(n, p));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 3);
  }
}
