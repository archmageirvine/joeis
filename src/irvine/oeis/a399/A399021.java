package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A399021 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399021 extends Sequence2 {

  // After Felix Huber

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z n2 = Z.valueOf(mN).square().multiply2();
    Z a = n2;
    final long r = Functions.SQRT.l(a);
    long m = r;
    while (m > mN) {
      if ((m & 1) == 1 && Functions.GCD.l(m, mN) == 1) {
        a = Z.valueOf(m).square().subtract(n2).abs();
        break;
      }
      --m;
    }
    m = r + 1;
    while (m < 2 * mN) {
      if ((m & 1) == 1 && Functions.GCD.l(m, mN) == 1) {
        final Z v = Z.valueOf(m).square().subtract(n2).abs();
        if (v.compareTo(a) < 0) {
          a = v;
        }
        break;
      }
      ++m;
    }
    return a;
  }
}

