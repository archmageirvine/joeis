package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398300 allocated for Dimas Saputra.
 * @author Sean A. Irvine
 */
public class A398300 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * Functions.CEIL_SQRT.l(28 * ++mN - 12));
  }
}
