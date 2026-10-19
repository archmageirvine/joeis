package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a069.A069268;

/**
 * A398268 Sum of fifth powers of A069268: a(n) = Sum_{k=1..n} gcd(k!, k*(k+1)/2)^5.
 * @author Sean A. Irvine
 */
public class A398268 extends A069268 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(5));
    return mSum;
  }
}
