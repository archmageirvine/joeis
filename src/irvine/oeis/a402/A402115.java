package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402115 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A402115 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  @Override
  public Z next() {
    final long h = ++mN / 2;
    Z a = Z.ZERO;
    for (long i = 1; i <= h; ++i) {
      for (long j = i; j <= h; ++j) {
        final Z p = Z.valueOf(i * j).multiply(mN - i).multiply(mN - j);
        final Z l = Functions.SQRT.z(Z.valueOf(i).multiply(mN).multiply(mN - j).multiply(j - i));
        final Z q = Functions.SQRT.z(p);
        if (2 * j == mN) {
          a = a.add(q).subtract(l);
        } else {
          final Z u = Functions.SQRT.z(Z.valueOf(i * j).multiply(mN).multiply(mN - i - j));
          a = a.add(q.multiply2()).subtract(l).subtract(u);
          if (q.square().equals(p)) {
            a = a.subtract(1);
          }
        }
      }
    }
    return a;
  }
}
