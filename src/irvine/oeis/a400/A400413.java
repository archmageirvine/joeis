package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007814;

/**
 * A400413 a(n) = Sum_{k=1..n} (2^A007814(floor(n/k)) - 1).
 * @author Sean A. Irvine
 */
public class A400413 extends Sequence1 {

  private final DirectSequence mA = new A007814();
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Z.TWO.pow(mA.a(mN / k)).subtract(1));
  }
}
