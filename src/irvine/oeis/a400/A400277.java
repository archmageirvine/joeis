package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400277 allocated for Sajid Khan Hussain.
 * @author Sean A. Irvine
 */
public class A400277 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PHI.z(++mN).modSquare(Z.valueOf(mN + 1));
  }
}
