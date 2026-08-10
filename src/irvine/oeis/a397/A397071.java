package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a006.A006218;

/**
 * A397071 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A397071 extends A006218 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().multiply2().add(++mN * mN + 6 * mN + 3);
  }
}
