package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401685 Triangle read by rows: T(n, k) = (n + 1)*2^k, with k = 0..n.
 * @author Sean A. Irvine
 */
public class A401685 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN + 1).shiftLeft(mM);
  }
}
