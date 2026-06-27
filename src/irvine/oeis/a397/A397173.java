package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a394.A394611;

/**
 * A397173.
 * @author Sean A. Irvine
 */
public class A397173 extends A394611 {

  private long mM = 0;
  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length()) {
      mM = 0;
      super.next();
    }
    return Z.valueOf(mCounts.get(mM));
  }
}
