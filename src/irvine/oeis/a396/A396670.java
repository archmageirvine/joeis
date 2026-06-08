package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence3;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A396670 allocated for Robert P. P. McKone.
 * @author Sean A. Irvine
 */
public class A396670 extends Sequence3 {

  private final DirectSequence mB = DirectSequence.create(new LinearRecurrence(0, new long[] {1, 3, 1}, new long[] {4, 0, 8}));
  private long mN = 2;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.PHI.z(mN / d).multiply(mB.a(d))).divide(mN);
  }
}

