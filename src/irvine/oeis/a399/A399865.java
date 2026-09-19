package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a000.A000372;

/**
 * A399774 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399865 extends A000372 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : super.next().pow(mN);
  }
}
