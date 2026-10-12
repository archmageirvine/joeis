package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400181 a(n) = D_n - A_n, where D_n is the descending permutation and A_n is the ascending permutation of n copies of each decimal digit 0..9.
 * @author Sean A. Irvine
 */
public class A400181 extends Sequence1 {

  private static final String DIGITS = "9876543210";
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = new Z(DIGITS.repeat(++mN));
    return Functions.DIGIT_SORT_DESCENDING.z(t).subtract(Functions.DIGIT_SORT_ASCENDING.z(t));
  }
}
