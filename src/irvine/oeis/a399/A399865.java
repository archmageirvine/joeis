package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a000.A000372;

/**
 * A399865 Number of preclosures on an n-element labeled set; equivalently, number of extensive order-preserving self-maps of the Boolean lattice of rank n.
 * @author Sean A. Irvine
 */
public class A399865 extends A000372 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : super.next().pow(mN);
  }
}
