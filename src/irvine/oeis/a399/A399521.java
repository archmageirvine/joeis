package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a401.A401738;

/**
 * A399521 Least eventual period of row n of the array T(x,y) = mex{c: T(x-d,y) = T(x,y-d) = T(x-d,y-d) = c for some 1 &lt;= d &lt;= min(x,y)}, x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A399521 extends Sequence0 {

  private int mN = -1;
  private final A401738.Periods mData = new A401738.Periods();

  @Override
  public Z next() {
    return Z.valueOf(mData.getPeriod(++mN));
  }
}
