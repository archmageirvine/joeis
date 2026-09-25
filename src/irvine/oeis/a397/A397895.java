package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397895 a(n) is the least prime q such that gcd(q+1, A400109(n)+1) = 2*n.
 * @author Sean A. Irvine
 */
public class A397895 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = mN;
    while (true) {
      p = Functions.NEXT_PRIME.l(p);
      for (long q = Functions.PREV_PRIME.l(p); q + 1 >= mN; q = Functions.PREV_PRIME.l(q)) {
        if (Functions.GCD.l(q + 1, p + 1) == mN) {
          return Z.valueOf(q);
        }
      }
    }
  }
}
