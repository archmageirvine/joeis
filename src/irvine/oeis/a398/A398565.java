package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398565 allocated for Jos Vromans.
 * @author Sean A. Irvine
 */
public class A398565 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.THREE.pow((1L << ++mN) - 1);
  }
}
