package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a061.A061260;

/**
 * A400790 allocated for William J. Keith.
 * @author Sean A. Irvine
 */
public class A400790 extends A061260 {

  @Override
  protected Z t(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n - k, j -> super.t(k, j.intValue()));
  }
}
