package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001405;

/**
 * A401031 allocated for Kiran Ananthpur Bacche.
 * @author Sean A. Irvine
 */
public class A401031 extends Sequence0 {

  private final DirectSequence mA = new A001405();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.a((2 * ++mN + 1) / 3);
  }
}
