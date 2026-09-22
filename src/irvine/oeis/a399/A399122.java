package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399122 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A399122 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.BIG_OMEGA.l(Z.valueOf(++k).square().add(mN - k)) >= 3) {
        return Z.valueOf(k);
      }
    }
  }
}
