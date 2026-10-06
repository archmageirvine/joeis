package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400181 allocated for Dieter Renz.
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
