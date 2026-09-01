package irvine.oeis.a399;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399232 a(n) = Sum_{k=1..4*n+2} (k^(4*n+1) mod (2*n+1)).
 * @author Sean A. Irvine
 */
public class A399232 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z mod = Z.valueOf(2 * ++mN + 1);
    final long e = 4 * mN + 1;
    return Integers.SINGLETON.sum(1, e + 1, k -> Z.valueOf(k).modPow(e, mod));
  }
}
