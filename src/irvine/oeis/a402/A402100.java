package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402100 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A402100 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    return Functions.DEDEKIND_PSI.z(n).equals(Functions.PHI.z(n).add(Functions.BIG_OMEGA.z(n).pow(9)));
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
