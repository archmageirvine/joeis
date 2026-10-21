package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399250 allocated for Jens Ahlstr\u00f6m.
 * @author Sean A. Irvine
 */
public class A399250 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRODUCT.z(ZUtils.ulamCoords(Z.valueOf(++mN)));
  }
}

