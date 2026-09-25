package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399122 a(n) is the smallest positive index k such that k^2 - k + n has at least three prime factors counted with multiplicity.
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
