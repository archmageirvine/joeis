package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399493 a(1) = a(2) = 1, a(n) = gcd((n-1)*(n-2), a(n-1)+a(n-2)) for n &gt; 2.
 * @author Sean A. Irvine
 */
public class A399493 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 2) {
      final Z t = Functions.GCD.z(Z.valueOf(mN - 1).multiply(mN - 2), mA.add(mB));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

