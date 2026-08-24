package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397734 a(n) is the number of functions f:[n] -&gt; [n] such that f(i) = f(f(i)) = f(n+1-i) for all i in [n].
 * @author Sean A. Irvine
 */
public class A397734 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final long m = ++mN / 2;
    return (mN & 1) == 0
      ? Integers.SINGLETON.sum(0, m, j -> Binomial.binomial(m, j).multiply(Z.valueOf(j).pow(m - j)).shiftLeft(j))
      : Integers.SINGLETON.sum(0, m, j -> Binomial.binomial(m, j).multiply(Z.valueOf(j).pow(m - j + 1).add(Z.valueOf(j + 1).pow(m - j)).shiftLeft(j)));
  }
}
