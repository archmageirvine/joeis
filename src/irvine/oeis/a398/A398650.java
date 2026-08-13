package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a053.A053144;

/**
 * A398650 allocated for V. Barbera.
 * @author Sean A. Irvine
 */
public class A398650 extends A000040 {

  private final Sequence mA = new A053144();
  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    if (++mN == 1) {
      return Z.ZERO;
    }
    return mA.next().multiply(p).add(1 - mN);
  }
}

