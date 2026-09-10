package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397806.
 * @author Sean A. Irvine
 */
public class A397554 extends Sequence1 {

  private long mN = 0;
  private long mM = 2;

  private boolean is(final long n, final long m) {
    return Functions.SIGMA1.z(m).compareTo(Functions.SIGMA1.z(m - 1).multiply(n)) > 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mN, mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
