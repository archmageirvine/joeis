package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399862 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399862 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Functions.TRIANGULAR.z(n - m).subtract(n + 1 > 2 * m ? Functions.TRIANGULAR.z(n - 2 * m) : Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
