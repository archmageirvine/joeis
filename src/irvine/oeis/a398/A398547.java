package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398547 d^c^b, where b &gt;= c &gt;= d &gt;= 0 ordered by b then c then d.
 * @author Sean A. Irvine
 */
public class A398547 extends Sequence0 {

  private long mB = 0;
  private long mC = 0;
  private long mD = -1;

  @Override
  public Z next() {
    if (++mD > mC) {
      if (++mC > mB) {
        ++mB;
        mC = 0;
      }
      mD = 0;
    }
    return Z.valueOf(mD).pow(Z.valueOf(mC).pow(mB));
  }
}

