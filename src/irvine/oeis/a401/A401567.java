package irvine.oeis.a401;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A087101.
 * @author Sean A. Irvine
 */
public class A401567 extends Sequence1 {

  private final DirectSequence mC = DirectSequence.create(new A401566());
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> d == mN ? Z.ZERO : mC.a(d));
  }
}
