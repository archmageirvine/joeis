package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396377 Smallest k so that at least one of the k+1 integers in {n, n+1, n+2, ..., n+k} divides the product of the other integers.
 * @author Sean A. Irvine
 */
public class A396377 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (A396378.is(k, mN) == 0) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
