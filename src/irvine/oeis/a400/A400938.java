package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400938 allocated for Zolt\u00e1n Jo\u00f3.
 * @author Sean A. Irvine
 */
public class A400938 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 1;
    while (m > 1) {
      final long r = Functions.CBRT.l(m);
      sum += m - r * r * r;
      m = r;
    }
    return Z.valueOf(sum);
  }
}
