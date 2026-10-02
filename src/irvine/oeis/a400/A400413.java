package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007814;

/**
 * A400413 allocated for Ctibor O. Zizka.
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
