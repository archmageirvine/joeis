package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078765.
 * @author Sean A. Irvine
 */
public class A397063 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.TAU.multiply(CR.valueOf(Z.valueOf(++mN).multiply(mN + 1).multiply(2 * mN + 1).divide(6)).sqrt()).ceil();
  }
}

