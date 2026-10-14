package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A400607 Integers p occurring in solutions of m^2 = p! * q! * r!, with p &gt; q &gt; r &gt; 1, ordered by increasing m (A400208).
 * @author Sean A. Irvine
 */
public class A400607 extends ThreeParameterFormSequence {

  private long mRes = 0;

  /** Construct the sequence. */
  public A400607() {
    super(1, 2, 3, 4, (r, q, p) -> p > q && q > r ? Functions.FACTORIAL.z(p).multiply(Functions.FACTORIAL.z(q)).multiply(Functions.FACTORIAL.z(r)) : null);
  }

  @Override
  protected Z select(final long r, final long q, final long p, final Z n) {
    mRes = p; // remember the p value for return if this value is accepted by next
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
