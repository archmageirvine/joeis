package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007947;

/**
 * A400418 a(n) = Sum_{k=1..n} A007947(floor(n/k)).
 * @author Sean A. Irvine
 */
public class A400418 extends Sequence1 {

  private final DirectSequence mA = new A007947();
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mA.a(mN / k));
  }
}
