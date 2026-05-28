package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395944 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A395944 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z g = Functions.GCD.z(Z.valueOf(++k).pow(3 * mN).subtract(1), Functions.FACTORIAL.z(k).subtract(1));
      if (!g.isOne()) {
        return g;
      }
    }
  }
}
