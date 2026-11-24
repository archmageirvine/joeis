package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A402181 Numbers k such that the decimal concatenation of the sum and product of the digits of 2^k, in either order (allowing leading zeros), is a power of 2.
 * @author Sean A. Irvine
 */
public class A402181 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A402181() {
    super(1, k -> {
      final Z t = Z.ONE.shiftLeft(k);
      final String s = Functions.DIGIT_SUM.z(t).toString();
      final String p = Functions.DIGIT_PRODUCT.z(t).toString();
      return Predicates.POWER_OF_TWO.is(new Z(s + p)) || Predicates.POWER_OF_TWO.is(new Z(p + s));
    });
  }
}
