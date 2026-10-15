package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400795 Strongly nontriangular numbers, defined as the complement of the generalized triangular numbers in the reference below. Generalized triangular numbers include 1 and those in the range of the function P(i,j) = (i*j+i+j-gcd(i,j))/2 for integers i, j &gt; 1.
 * @author Sean A. Irvine
 */
public class A400795 extends Sequence1 {

  // After Kyle Petersen

  private int mN = 1;
  private List<Z> mTerms = new ArrayList<>();
  private int mOffset = 0;

  private long p(final long a, final long b) {
    return (a * b + a + b - Functions.GCD.l(a, b)) / 2;
  }

  private List<Z> psieve(final int n) {
    final long maxVal = (long) n * (n + 1) / 2;
    final List<Long> sbig = new ArrayList<>();
    for (long i = 2; i <= maxVal; ++i) {
      sbig.add(i);
    }
    final List<Z> s = new ArrayList<>();

    for (int b = 2; b <= n; ++b) {
      final long base = (long) b * (b + 1) / 2;
      int i = 0;
      while (i < sbig.size() && sbig.get(i) < base) {
        i++;
      }

      // Accumulate elements smaller than base
      for (int idx = 0; idx < i; ++idx) {
        s.add(Z.valueOf(sbig.get(idx)));
      }

      // Keep remaining big numbers
      final List<Long> nextSbig = new ArrayList<>();
      for (int idx = i; idx < sbig.size(); ++idx) {
        nextSbig.add(sbig.get(idx));
      }
      sbig.clear();
      sbig.addAll(nextSbig);

      if (sbig.isEmpty()) {
        return s;
      }

      // Filter out multiply realized values (equivalent to set minus)
      for (int r = 0; r < b; ++r) {
        final long k = p(b + r, b) % base;
        sbig.removeIf(val -> val % base == k);
      }
    }
    return s;
  }

  @Override
  public Z next() {
    while (mOffset >= mTerms.size()) {
      mTerms = psieve(++mN);
    }
    return mTerms.get(mOffset++);
  }
}
