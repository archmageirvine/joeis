package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402114 a(n) is the number of tangential quadrilaterals, up to congruence, with integer side lengths, integer inradius, and semiperimeter n.
 * @author Sean A. Irvine
 */
public class A402114 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  @Override
  public Z next() {
    final long h = ++mN / 2;
    Z a = Z.ZERO;
    for (long i = 1; i <= h; ++i) {
      for (long j = i; j <= h; ++j) {
        final Z p = Z.valueOf(i * j).multiply(mN - i).multiply(mN - j);
        final Z l = Z.valueOf(i).multiply(mN).multiply(mN - j).multiply(j - i);
        final Z q = Functions.SQRT.z(p);
        final Z s = Functions.SQRT.z(l);
        if (2 * j == mN) {
          a = a.add(q.divide(mN)).subtract(s.divide(mN));
        } else {
          final Z u = Z.valueOf(i * j).multiply(mN).multiply(mN - i - j);
          final Z t = Functions.SQRT.z(u);
          a = a.add(q.divide(mN).multiply2()).subtract(s.divide(mN)).subtract(t.divide(mN));
          if (q.square().equals(p) && q.mod(mN) == 0) {
            a = a.subtract(1);
          }
        }
      }
    }
    return a;
  }
}
