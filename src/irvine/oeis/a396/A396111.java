package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396111 allocated for Stanislav Sykora.
 * @author Sean A. Irvine
 */
public class A396111 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).modPow(Z.FOUR, Z.valueOf(2 * mN + 1));
  }
}

