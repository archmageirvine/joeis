package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A396427 allocated for Arkadeep Dutta.
 * @author Sean A. Irvine
 */
public class A396427 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A396606());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Binomial.binomial(mN - 1, k - 1).multiply(mA.a(k))).multiply(mN);
  }
}
