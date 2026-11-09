package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401593 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A401593 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return A401592.calculate(++mN)[1];
  }
}
