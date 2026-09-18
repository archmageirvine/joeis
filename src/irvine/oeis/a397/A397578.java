package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397578 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A397578 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private boolean is(final long n, final long k) {
    final Z s = Functions.SIGMA1.z(k);
    return s.compareTo(Functions.SIGMA1.z(k - 1).multiply(n)) > 0 && s.compareTo(Functions.SIGMA1.z(k + 1).multiply(n)) > 0;
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
