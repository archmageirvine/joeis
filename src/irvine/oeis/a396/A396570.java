package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a006.A006512;

/**
 * A396570 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A396570 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A006512());
  private final Sequence mS = new TwoParameterFormSequence(1, 1, 2, (x, y) -> x < y ? mA.a(x).add(mA.a(y)) : null);
  private Z mT = mS.next();
  private Z mN = Z.valueOf(-4);


  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      while (mN.compareTo(mT) > 0) {
        mT = mS.next();
      }
      if (!mN.equals(mT)) {
        return mN;
      }
    }
  }
}
