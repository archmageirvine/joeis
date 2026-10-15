package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a069.A069268;

/**
 * A400687 a(n) = Sum_{k=1..n} gcd(k!, k*(k+1)/2)^2.
 * @author Sean A. Irvine
 */
public class A400687 extends A069268 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().square());
    return mSum;
  }
}
