package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A399704 allocated for Markus Sigg.
 * @author Sean A. Irvine
 */
public class A399704 extends Sequence3 {

  private long mN = 2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z s = Functions.TRIANGULAR.z(mN);
    mF = mF.multiply(mN++);
    long k = mN;
    while (!mF.modMultiply(k, s.add(k)).isZero()) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
