package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A400607 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A400607 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A400607() {
    super(1, 2, 3, 4, (r, q, p) -> p > q && q > r ? Functions.FACTORIAL.z(p).multiply(Functions.FACTORIAL.z(q)).multiply(Functions.FACTORIAL.z(r)) : null);
  }

  @Override
  protected Z select(final long x, final long y, final long z, final Z n) {
    final Z[] t = n.sqrtAndRemainder();
    if (t[1].isZero()) {
      return Z.valueOf(z);
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
