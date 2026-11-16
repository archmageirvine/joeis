package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401684 Number of lattice points on the complete edge skeleton of a stella octangula.
 * @author Sean A. Irvine
 */
public class A401684 extends Sequence1 {

  private long mN = -22;

  @Override
  public Z next() {
    mN += 36;
    return Z.valueOf(mN);
  }
}
