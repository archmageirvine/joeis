package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061211 Number of nonempty subsets of {1..n} whose sum divides their least common multiple.
 * @author Sean A. Irvine
 */
public class A402183 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private void search(final long sum, final Z lcm, final long k) {
    if (k > mN) {
      if (sum != 0 && lcm.mod(sum) == 0) {
        ++mCount;
      }
      return;
    }
    search(sum, lcm, k + 1);
    search(sum + k, Functions.LCM.z(lcm, k), k + 1);
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(0, Z.ONE, 1);
    return Z.valueOf(mCount);
  }
}
