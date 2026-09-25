package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399862 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399862 extends Sequence1 {

  // todo definition is not correct?

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Functions.TRIANGULAR.z(n).subtract(n > m ? Functions.TRIANGULAR.z(n - m) : Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
// T(n,k) = binomial(n,2) - [n>k] * binomial(n-k,2), k=1..n, where brackets are Iverson.
// nn = 12; f[i_, j_] := Binomial[i, 2] - If[i > j, Binomial[i - j, 2], 0]; Table[f[n - k + 1, k], {n, nn}, {k, n}] // Flatten
