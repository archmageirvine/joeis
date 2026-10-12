package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a102.A102548;

/**
 * A400227 Number of distinct positive distances from the origin to points of (1/n)*Z^2 in the closed disc of radius sqrt(2) that do not occur for (1/m)*Z^2 with any m &lt; n.
 * @author Sean A. Irvine
 */
public class A400227 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A102548());
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> mA.a(2 * d * d).multiply(Functions.MOBIUS.l(mN / d)));
  }
}
