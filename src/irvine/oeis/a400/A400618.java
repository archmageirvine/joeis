package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400618 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A400618 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(16).add(24).multiply(mN).add(20).multiply(mN).add(3).divide(3);
  }
}

