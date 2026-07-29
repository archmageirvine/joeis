package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000897;

/**
 * A398186 a(n) = (1/n) * Sum_{k=0..n-1} A000897(k) * A000897(n-1-k), where A000897(k) = (4*k)!/((2*k)!*k!^2).
 * @author Sean A. Irvine
 */
public class A398186 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A000897());
  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mA.a(k).multiply(mA.a(mN - k))).divide(mN + 1);
  }
}

