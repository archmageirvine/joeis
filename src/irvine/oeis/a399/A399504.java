package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399504 b - c - d where b &gt;= c &gt;= d &gt;= 0 ordered by b then c then d.
 * @author Sean A. Irvine
 */
public class A399504 extends Sequence1 {

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
    return Z.valueOf(mB - mC - mD);
  }
}

