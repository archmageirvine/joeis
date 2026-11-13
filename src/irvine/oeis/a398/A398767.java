package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a090.A090025;

/**
 * A398767 a(n) is the number of grid points in an n X n X n cube that cannot be connected by a straight line to a given corner without passing through another grid point.
 * @author Sean A. Irvine
 */
public class A398767 extends Sequence1 {

  private final Sequence mA = new A090025().skip();
  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).subtract(mA.next()).subtract(1);
  }
}

