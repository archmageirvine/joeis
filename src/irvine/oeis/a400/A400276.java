package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046660;
import irvine.oeis.a056.A056169;

/**
 * A400276 Numbers k such that A046660(k) &gt;= A056169(k).
 * @author Sean A. Irvine
 */
public class A400276 extends Sequence1 {

  private final Sequence mA = new A046660();
  private final Sequence mB = new A056169();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().compareTo(mB.next()) >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
