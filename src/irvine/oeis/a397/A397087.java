package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397087 Number of nonempty subsets S of [n] such that sum(S) == 0 (mod n) and product(S) == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A397087 extends Sequence1 {

  private int mN = 0;
  private long[][] mDp;

  @Override
  public Z next() {
    ++mN;
    final long[][] old = new long[mN][mN];
    old[0][1 % mN] = 1;
    for (int x = 1; x <= mN; ++x) {
      if (Functions.GCD.l(x, mN) != 1) {
        continue;
      }
      final long[][] ndp = new long[mN][mN];
      for (int s = 0; s < mN; ++s) {
        System.arraycopy(old[s], 0, ndp[s], 0, mN);
      }
      for (int s = 0; s < mN; ++s) {
        for (int p = 0; p < mN; ++p) {
          if (old[s][p] != 0) {
            final int ns = (s + x) % mN;
            final int np = (p * x) % mN;
            ndp[ns][np] += old[s][p];
          }
        }
      }
      mDp = ndp;
      for (int s = 0; s < mN; ++s) {
        System.arraycopy(ndp[s], 0, old[s], 0, mN);
      }
    }
    return Z.valueOf(mDp[0][1 % mN] - 1);
  }
}
