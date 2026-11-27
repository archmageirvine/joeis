package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401162 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A401162 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z d = Functions.SIGMA0.z(++mN);
    return d.multiply(Functions.SIGMA0.z(mN * mN).subtract(d.multiply2()).add(1)).divide(8);
  }
}
