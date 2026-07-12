package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397407 The number of 2-colorings of the Aztec diamond of order n up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A397407 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(2L * ++mN * (mN + 1)).add(Z.ONE.shiftLeft(mN * (mN + 1) / 2 + 1)).add(Z.THREE.shiftLeft(mN * (mN + 1)));
    return ((mN & 1) == 0
      ? t.add(Z.ONE.shiftLeft(mN * (3 + 2 * mN) / 2 + 1))
      : t.add(Z.ONE.shiftLeft((2 * mN + 1) * (mN + 1) / 2 + 1))
    ).shiftRight(3);
  }
}
