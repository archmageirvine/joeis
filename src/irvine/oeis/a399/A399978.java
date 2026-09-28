package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399978 a(n) = omega(n) + sopf(n), where omega(n) is the number of distinct prime factors of n (A001221) and sopf(n) is the sum of the distinct primes dividing n (A008472).
 * @author Sean A. Irvine
 */
public class A399978 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SOPF.z(++mN).add(Functions.OMEGA.l(mN));
  }
}
