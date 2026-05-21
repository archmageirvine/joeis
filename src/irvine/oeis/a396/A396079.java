package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a395.A395579;

/**
 * A396079 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A396079 extends A395579 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
