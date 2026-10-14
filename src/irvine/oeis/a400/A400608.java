package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A400608 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A400608 extends ThreeParameterFormSequence {

  private long mRes = 0;

  /** Construct the sequence. */
  public A400608() {
    super(1, 2, 3, 4, (r, q, p) -> p > q && q > r ? Functions.FACTORIAL.z(p).multiply(Functions.FACTORIAL.z(q)).multiply(Functions.FACTORIAL.z(r)) : null);
  }

  @Override
  protected Z select(final long r, final long q, final long p, final Z n) {
    mRes = q; // remember the q value for return if this value is accepted by next
    return super.select(r, q, p, n);
  }

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE.is(super.next())) {
        return Z.valueOf(mRes);
      }
    }
  }
}
