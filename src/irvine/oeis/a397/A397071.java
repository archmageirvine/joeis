package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a006.A006218;

/**
 * A397071 Number of true statements (x op y) = z, where 0 &lt;= x, y, z &lt;= n, op is in {+,-,*,/}.
 * @author Sean A. Irvine
 */
public class A397071 extends A006218 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().multiply2().add(++mN * mN + 6 * mN + 3);
  }
}
