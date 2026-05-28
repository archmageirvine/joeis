package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396333 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A396333 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long z = 0; z < mN; ++z) {
      for (long y = 0; y <= z && y * y + z * z < mN * mN; ++y) {
        final long r = mN * mN - y * y - z * z;
        cnt += Math.min(y + 1, Functions.CEIL_SQRT.l(r));
      }
    }
    return Z.valueOf(cnt);
  }
}
