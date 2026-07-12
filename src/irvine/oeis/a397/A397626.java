package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397626 Number of vertex clique partitions of a recursively constructed bridged dual-graph sequence starting with a triangle.
 * @author Sean A. Irvine
 */
public class A397626 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.FIVE;
        return mA;
      }
      mB = Z.valueOf(45);
      return mB;
    }
    final Z t = mB.square().add(mB.multiply(mA.square()).multiply2());
    mA = mB;
    mB = t;
    return t;
  }
}
