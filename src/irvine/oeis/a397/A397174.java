package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a399.A399995;

/**
 * A397174 The rows of A397173 converge to this sequence.
 * @author Sean A. Irvine
 */
public class A397174 extends A399995 {

  private long mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    while (super.next().longValueExact() <= 2 * mN) {
      // do nothing
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
