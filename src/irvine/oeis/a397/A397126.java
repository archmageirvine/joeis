package irvine.oeis.a397;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A394611.
 * @author Sean A. Irvine
 */
public class A397126 extends Sequence1 {

  private final DirectSequence mPowerful = DirectSequence.create(new A001694());
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mForbid = Z.TWO;
  private Z mRequired = Z.ONE;

  @Override
  public Z next() {
    //System.out.println("forbid=" + mForbid + " req=" + mRequired);
    long k = 0;
    while (true) {
      final Z p = mPowerful.a(++k);
      if (!mUsed.contains(p) && p.mod(mRequired).isZero() && (mForbid.isOne() || p.gcd(mForbid).isOne())) {
        mForbid = mRequired;
        final FactorSequence fs = Jaguar.factor(p);
        mRequired = Z.ONE;
        for (final Z q : fs.toZArray()) {
          if (q.gcd(mForbid).isOne()) {
            mRequired = mRequired.multiply(q);
          }
        }
        mUsed.add(p);
        return p;
      }
    }
  }
}
