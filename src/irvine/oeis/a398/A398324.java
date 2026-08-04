package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;

/**
 * A398324 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A398324 extends Sequence1 {

  private final Sequence mK = new A000002();
  private long mEven = 0;
  private long mOdd = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mK.next().isOne()) {
        ++mOdd;
      } else {
        ++mEven;
      }
      if ((mOdd & 1) == 0 && ((mEven & 1) == 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}

