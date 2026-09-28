package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060715;

/**
 * A400202 Number of integers k, 1 &lt;= k &lt; n, such that (n+k)/gcd(n,k) is prime.
 * @author Sean A. Irvine
 */
public class A400202 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A060715());
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, mA::a);
  }
}

