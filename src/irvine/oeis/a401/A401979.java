package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401979 Number of tilings of a strip of length n using squares (length 1) and dominoes (length 2) such that the number of dominoes is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A401979 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (long k = 2, f; 2 * (f = Functions.FIBONACCI.l(k)) <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - f, f));
    }
    return sum;
  }
}

