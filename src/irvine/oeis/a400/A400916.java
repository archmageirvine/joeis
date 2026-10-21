package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400916 Array A(n,k) read by antidiagonals: number of unit n-cubes added in the k-th shell by expanding an n-cube by one unit in every coordinate direction per step.
 * @author Sean
 */
public class A400916 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(2 * m + 1).pow(n).subtract(Z.valueOf(2 * m - 1).pow(n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}

