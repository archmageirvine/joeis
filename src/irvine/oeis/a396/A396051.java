package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;

/**
 * A396051 Number of fixed-content bracelets of length 2*n, summed over all integer partitions of 2*n, whose mirror image is a non-identity rotation, with no linear-palindrome representative and a nontrivial rotational symmetry.
 * @author Sean A. Irvine
 */
public class A396051 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A396632());
  private long mN = 1;

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        sum = sum.add(mA.a(d));
      }
    }
    return sum;
  }
}

