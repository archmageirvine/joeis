package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002321;

/**
 * A395914 a(n) is the smallest k such that 2^(n-1) &lt;= k &lt; 2^n at which |M(k)|/sqrt(k) attains its maximum value in that interval, where M is the Mertens function A002321.
 * @author Sean A. Irvine
 */
public class A395914 extends Sequence1 {

  private final Sequence mMertens = new A002321();
  private long mLim = 1;
  private long mN = 1;

  @Override
  public Z next() {
    mLim *= 2;
    CR best = CR.NEG_ONE;
    long bestN = mN;
    while (mN < mLim) {
      final CR v = CR.valueOf(mMertens.next().abs()).divide(CR.valueOf(mN).sqrt());
      if (v.compareTo(best) > 0) {
        best = v;
        bestN = mN;
      }
      ++mN;
    }
    return Z.valueOf(bestN);
  }
}

