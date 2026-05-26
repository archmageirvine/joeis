package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396059 a(n) is the action of "Rule 90" elementary cellular automaton on the binary representation of n if the cells may only expand into the significant bit.
 * @author Sean A. Irvine
 */
public class A396059 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((2 * ++mN) ^ (mN / 2));
  }
}
