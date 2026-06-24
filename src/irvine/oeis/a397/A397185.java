package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397185 allocated for Jose Manuel Briceno Mendoza.
 * @author Sean A. Irvine
 */
public class A397185 extends Sequence1 {

  private int mN = 0;
  private long mM = 1;

  private boolean isOk(final long m, final int len, final int v) {
    for (int i = Math.max(1, v - len); i <= Math.min(len, v); ++i) {
      if ((m & (1L << (i - 1))) != 0 && (m & (1L << (v - i - 1))) != 0) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long m, final int max) {
    assert (m & 1) == 1;
    final int len = Functions.DIGIT_LENGTH.i(2, m);
    // 2 is already satisfied because m is odd
    for (int k = 4; k <= max; k += 2) {
      //System.out.println("m=" + m + " k=" + k + " len=" + len + " " + isOk(m, len, k));
      if (!isOk(m, len, k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, 2 * mN)) {
      mM += 2;
    }
    return Z.valueOf(mM);
  }
}
