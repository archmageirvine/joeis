package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398337 a(n) is the largest k &lt; n such that gpf(2^(k*n) - 1) = gpf(2^n - 1), for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A398337 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long k = ++mN;
    final Z gpf = Functions.GPF.z(Z.ONE.shiftLeft(mN).subtract(1));
    while (true) {
      --k;
      if (Functions.GPF.z(Z.ONE.shiftLeft(k * mN).subtract(1)).equals(gpf)) {
        return Z.valueOf(k);
      }
    }
  }
}
