package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396513 allocated for Banri Ogawa.
 * @author Sean A. Irvine
 */
public class A396513 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long k = 0;
    while (true) {
      if (Functions.RAD.l(++k) == Functions.RAD.l(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

