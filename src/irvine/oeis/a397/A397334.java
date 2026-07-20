package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397334 Least m such that the chain u_0 = m, u_{k+1} = pi(u_k+prime(u_k)), where u_k + prime(u_k) is prime, has length n.
 * @author Sean A. Irvine
 */
public class A397334 extends Sequence0 {

  private int mN = -1;

  private long f(long n) {
    long k;
    long cnt = 0;
    while (Predicates.PRIME.is(k = n + Functions.PRIME.l(n))) {
      ++cnt;
      n = Functions.PRIME_PI.l(k);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (f(k) != mN) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
