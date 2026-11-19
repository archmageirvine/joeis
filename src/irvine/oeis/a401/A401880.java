package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046080;
import irvine.oeis.a056.A056137;

/**
 * A401880 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A401880 extends Sequence1 {

  private final Sequence mA = new A046080();
  private final Sequence mB = new A056137();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mA.next().multiply(3).add(mB.next()));
    return mSum;
  }
}
