package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399141 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A399141 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.LPF.z(Z.TEN.pow(Z.TEN.pow(++mN)).add(1));
  }
}
