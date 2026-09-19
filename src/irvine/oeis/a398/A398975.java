package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a010.A010060;

/**
 * A397121.
 * @author Sean A. Irvine
 */
public class A398975 extends Sequence1 {

  private final Sequence mF = new A010060();
  private Z mA = mF.next();
  private Z mB = mF.next();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mF.next().subtract(++mN == 1 ? 1 : 0);
    return mA.multiply(mN).add(Z.ONE.subtract(mA).multiply(Z.ONE.add(t.multiply(mB).multiply2())));
  }
}

