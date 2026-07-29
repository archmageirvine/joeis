package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005651;

/**
 * A396229 Number of fixed-content bracelets of length 2*n, summed over all integer partitions of 2*n, whose cyclic orbit contains exactly two linear-palindrome representatives and has full rotational period.
 * @author Sean A. Irvine
 */
public class A396229 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A005651());
  private final DirectSequence mB = DirectSequence.create(new A396085());
  private long mN = 1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> mA.a(d).subtract(mB.a(2 * d)).multiply(Functions.MOBIUS.i(mN / d)))
      .divide2();
  }
}

