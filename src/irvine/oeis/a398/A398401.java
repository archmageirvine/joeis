package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398401 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A398401 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    return Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.BIG_OMEGA.z(n).pow(7)));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
