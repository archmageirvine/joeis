package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400621 allocated for Nishant R. Gautam.
 * @author Sean A. Irvine
 */
public class A400621 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long gpf = Functions.GPF.l(++mN);
    long sum = 0;
    for (long p = 2; p < gpf; p = Functions.NEXT_PRIME.l(p)) {
      if (mN % p != 0) {
        sum += p;
      }
    }
    return Z.valueOf(sum);
  }
}
