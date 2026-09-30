package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A400208 allocated for Bernard Schott.
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
