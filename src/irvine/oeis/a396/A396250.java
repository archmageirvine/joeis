package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396250 a(n) is the number of ternary sequences of length n with characteristic value 0, as is defined in comments.
 * @author Sean A. Irvine
 */
public class A396250 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.THREE.pow(1L << Long.bitCount(mN));
    return Z.THREE.pow(++mN)
      .multiply(t.add(1))
      .divide(t)
      .divide2()
      .subtract(Z.ONE.shiftLeft(mN - 1));
  }
}
