package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A400208 Integers m such that m^2 = p! * q! * r! for some p &gt; q &gt; r &gt; 1.
 * @author Sean A. Irvine
 */
public class A400208 extends FilterSequence {

  /** Construct the sequence. */
  public A400208() {
    super(1, new ThreeParameterFormSequence(1, 2, 3, 4, (r, q, p) -> p > q && q > r ? Functions.FACTORIAL.z(p).multiply(Functions.FACTORIAL.z(q)).multiply(Functions.FACTORIAL.z(r)) : null), SQUARE);
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
