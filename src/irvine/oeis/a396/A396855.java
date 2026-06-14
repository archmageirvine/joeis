package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396855 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A396855 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; 2 * k < mN; ++k) {
      if ((Functions.SYNDROME.i(k) & Functions.SYNDROME.i(mN - k)) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
