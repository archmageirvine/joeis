package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a394.A394611;

/**
 * A394611 allocated for Joshua B. Weinstein.
 * @author Sean A. Irvine
 */
public class A397174 extends A394611 {

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
