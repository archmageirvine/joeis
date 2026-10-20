package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400485 a(1) = 1; for n &gt; 1: if a(n-1) + n is odd, a(n) = a(n-1) + n else a(n) = (a(n-1) + n)/2.
 * @author Sean A. Irvine
 */
public class A400485 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.add(mN);
      mA = t.isOdd() ? t : t.divide2();
    }
    return mA;
  }
}

