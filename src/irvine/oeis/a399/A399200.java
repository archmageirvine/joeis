package irvine.oeis.a399;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399200 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A399200 extends Sequence0 {

  private final TreeSet<Z> mCands = new TreeSet<>();
  {
    mCands.add(Z.ZERO);
    mCands.add(Z.ONE);
    mCands.add(Z.TWO);
  }
  private CR mRunningMin = CR.NEG_ONE;
  private final Convergents mC = new Convergents(CR.PI);
  private Q mConv = mC.next();
  private Z mPrev = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      while (mCands.isEmpty()) {
        ++mN;
        final Q conv0 = mConv;
        mConv = mC.next();
        for (int i = 0; i <= mN; ++i) {
          final Z p = conv0.num().add(mConv.num().multiply(i));
          final Z q = conv0.den().add(mConv.den().multiply(i));
          if (p.compareTo(Z.TWO) > 0 && p.isOdd() && q.isOdd()) {
            mCands.add(p);
          }
        }
      }
      final Z k = mCands.pollFirst();
      if (k.compareTo(Z.TWO) <= 0) {
        return k;
      }
      if (k.compareTo(mPrev) > 0) {
        final CR x = CR.valueOf(k).cos().abs().log().multiply(k);
        if (x.compareTo(mRunningMin) > 0) {
          mRunningMin = x;
          mPrev = k;
          return k;
        }
      }
    }
  }
}
