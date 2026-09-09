package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399391 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A399391 extends Sequence0 {

  private final Convergents mConvergents = new Convergents(CR.HALF_PI);
  private long mN = 0;
  private CR mBest = CR.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z num = mConvergents.next().num();
      final CR p = CR.valueOf(num);
      final CR sin = p.sin();
      if (sin.abs().compareTo(CR.HALF) >= 0) {
        final CR s = sin.abs().pow(p);
        if (s.compareTo(mBest) > 0) {
          mBest = s;
          return Z.valueOf(mN);
        }
      }
    }
  }
}
