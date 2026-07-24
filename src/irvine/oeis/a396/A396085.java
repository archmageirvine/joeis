package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a395.A395436;

/**
 * A396085 Number of fixed-content bracelets of length n, summed over all integer partitions of n, whose mirror image is a rotation of the original word, with exactly one palindromic rotation and a nontrivial rotational symmetry.
 * @author Sean A. Irvine
 */
public class A396085 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A395436());
  private int mN = 1;

  @Override
  public Z next() {
    Z sum = Z.ONE;
    if (!Predicates.PRIME.is(++mN)) {
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (d.isOdd() && !d.isOne() && !d.equals(mN)) {
          sum = sum.add(mA.a(d.subtract(1).divide2()));
        }
      }
    }
    return sum;
  }
}
