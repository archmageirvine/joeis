package irvine.oeis.a396;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396409 Number of iterations of x -&gt; x XOR 2^A000120(x) from x = n to reach a number of the form 2^m-1.
 * @author Sean A. Irvine
 */
public class A396409 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (!Predicates.POWER_OF_TWO.is(m + 1)) {
      m = m ^ (1L << Long.bitCount(m));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
