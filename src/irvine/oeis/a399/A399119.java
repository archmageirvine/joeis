package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a382.A382397;

/**
 * A399119 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399119 extends A382397 {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] v = f(++mN);
    return Z.valueOf(v[1] - v[0] + 1);
  }
}
