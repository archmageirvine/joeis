package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A401254: Anti-abundant numbers with no anti-abundant antidivisors.
 * @author Sean A. Irvine
 */
public class A401254 extends Sequence1 {

  private final List<Z> mTerms = new ArrayList<>();
  private final LongDynamicBooleanArray mAntiAbundant = new LongDynamicBooleanArray();
  private long mM = 1; // 0, 1 are false
  private int mN = -1;

  private boolean isAntiAbundant(final long n) {
    long s = 0;
    // Divisors m for which n/m is odd contribute 2*m
    for (int m = 1; m <= n / 3; ++m) {
      if (n % m == 0 && (n / m) % 2 == 1) {
        s += 2L * m;
      }
    }
    // Proper odd divisors of 2*n-1 and 2*n+1
    for (final long val : new long[] {2L * n - 1, 2L * n + 1}) {
      for (long d = 3; d * d <= val; d += 2) {
        if (val % d == 0) {
          if (d < n) {
            s += d;
          }
          final long q = val / d;
          if (q != d && q < n) {
            s += q;
          }
        }
      }
    }
    return s > n;
  }

  @Override
  public Z next() {
    ++mN;
    while (mN >= mTerms.size()) {
      if (isAntiAbundant(++mM)) {
        mAntiAbundant.set(mM);
      }
      if (isAntiAbundant(mM)) {
        boolean ok = true;
        for (final long d : FactorUtils.antidivisors(mM)) {
          if (d < mM && mAntiAbundant.isSet(d)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          mTerms.add(Z.valueOf(mM));
        }
      }
    }
    return mTerms.get(mN);
  }
}
