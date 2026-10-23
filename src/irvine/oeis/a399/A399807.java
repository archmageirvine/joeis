package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399807 Start with the positive integers; at the k-th sieving step, remove every (2k+1)-th term of the sequence remaining after the (k-1)-st sieving step; iterate.
 * @author Sean A. Irvine
 */
public class A399807 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z p = Z.valueOf(++mN);
    for (long k = mN / 2 + 2; k > 0; --k) {
      p = p.add(p.subtract(1).divide(2 * k));
    }
    return p;
  }
}
