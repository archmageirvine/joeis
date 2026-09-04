package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399004 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A399004 extends Sequence0 {

  // After Firdous Ahmad Mala

  private int mN = -1;

  private Z c(final int k) {
    if (k == 1) {
      return Z.TWO;
    }
    if (k == 2) {
      return Z.EIGHT;
    }
    if (k == 3) {
      return Z.valueOf(30);
    }
    final Z res = Functions.FACTORIAL.z(k).multiply(4);
    return (k & 1) == 0 ? res.add(Functions.FACTORIAL.z(k - 1)) : res;
  }

  @Override
  public Z next() {
    final Z[] a = new Z[++mN + 1];
    a[0] = Z.ONE;
    for (int i = 1; i <= mN; ++i) {
      Z total = Z.ZERO;
      for (int k = 1; k <= i; ++k) {
        total = total.add(Binomial.binomial(i - 1, k - 1).multiply(c(k).multiply(a[i - k])));
      }
      a[i] = total;
    }
    return a[mN];
  }
}

