package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399598 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399598 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    final CR r = CR.valueOf(new Q(m + 1, m));
    int i = 0;
    while (true) {
      ++i;
      final Z p = Functions.PRIME.z(i + n - 1);
      final Z pi = Functions.PRIME.z(i);
      if (CR.valueOf(p).log().divide(CR.valueOf(pi).log()).compareTo(r) <= 0) {
        return Integers.SINGLETON.product(i, i + n - 1, Functions.PRIME::z).multiply(p.pow(m));
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM + 1, mM + 1);
  }
}
