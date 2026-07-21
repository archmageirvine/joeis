package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397585 allocated for Hartmut F. W. Hoft.
 * @author Sean A. Irvine
 */
public class A397585 extends Sequence2 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).multiply(mN + mM);
  }
}

