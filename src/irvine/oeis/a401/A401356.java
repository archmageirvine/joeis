package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401356 Least number congruent to 17 modulo 24 that is a quadratic residue modulo the first n-1 primes greater than 3.
 * @author Sean A. Irvine
 */
public class A401356 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      long cnt = 0;
      for (long x = 1; 2 * x <= mM; ++x) {
        if (Functions.SIGMA1.z(x).equals(Functions.SIGMA1.z(mM - x))) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
