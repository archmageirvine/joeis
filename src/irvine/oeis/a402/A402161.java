package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A402161 a(n) is the least k &gt;= 1 such that the n consecutive integers k, k+1, ..., k+n-1 cannot be cut into an initial block and a final block, both nonempty, with coprime sums; a(n) = 0 if there is no such k.
 * @author Sean A. Irvine
 */
public class A402161 extends Sequence2 {

  // After Alper Ferudun

  private long mN = 1;

  @Override
  public Z next() {
    final long m = ++mN / 2;
    if (mN <= 4 || mN == 18 || ((mN & 1) == 0 && m >= 3 && ((m - 1) & (m - 2)) == 0 && Predicates.PRIME.is(m))) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    long k = 0;
    while (true) {
      ++k;
      final Z total = n.multiply(2 * k + mN - 1).divide2();
      boolean ok = true;
      for (long q = 1; q < mN; ++q) {
        if (Functions.GCD.l(total, Z.valueOf(q).multiply(2 * k + q - 1).divide2()) == 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(k);
      }
    }
  }
}
