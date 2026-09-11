package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399429 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A399429 extends Sequence0 {

  private final Convergents mConvergents = new Convergents(CR.HALF_PI);
  private long mN = 0;
  private CR mBest = CR.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q c = mConvergents.next();
      if (mN > 2 && c.den().isEven()) {
        return Z.valueOf(mN);
      }
      final Z num = c.num();
      final CR p = CR.valueOf(num);
      final CR sin = p.sin();
      final CR s = sin.abs().pow(p);
      if (s.compareTo(mBest) < 0) {
        mBest = s;
        return Z.valueOf(mN);
      }
    }
  }
}
