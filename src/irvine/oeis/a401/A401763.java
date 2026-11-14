package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A401763 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    Z r = Functions.TRINV.z(k);
    if (Functions.TRIANGULAR.z(r).compareTo(k) < 0) {
      r = r.add(1);
    }
    final Z s = Z.valueOf(k).subtract(Functions.TRIANGULAR.z(r.subtract(1)));
    final Z rr = r;
    return Integers.SINGLETON.sum(0, n, i -> rr.pow(n - i).multiply(s.pow(i)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}
