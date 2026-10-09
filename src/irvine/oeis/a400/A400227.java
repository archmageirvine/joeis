package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a102.A102548;

/**
 * A400227 allocated for Carlo Mitchener.
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
