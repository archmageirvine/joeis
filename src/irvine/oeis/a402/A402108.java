package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402108 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A402108 extends Sequence0 {

  // After Felix Huber

  private final Map<Integer, Z> mValues = new HashMap<>();
  private long mK = 1;
  private int mN = 0;

  /**
   * Compute c(k).
   * @param k positive integer
   * @return c(k)
   */
  static int c(final long k) {
    // Each pair is {weighted sum, total number of selected factors}.
    List<long[]> l = new ArrayList<>();
    l.add(new long[] {0, 0});
    long rem = k;
    for (long p = 2; p <= rem / p; ++p) {
      if (rem % p == 0) {
        int e = 0;
        do {
          rem /= p;
          ++e;
        } while (rem % p == 0);

        final List<long[]> next = new ArrayList<>();
        for (final long[] x : l) {
          for (int j = 0; j <= e; ++j) {
            next.add(new long[] {x[0] + j * p, x[1] + j});
          }
        }
        l = next;
      }
    }

    if (rem > 1) {
      final List<long[]> next = new ArrayList<>();
      for (final long[] x : l) {
        next.add(x.clone());
        next.add(new long[] {x[0] + rem, x[1] + 1});
      }
      l = next;
    }

    int count = 0;
    final Set<Long> distinct = new HashSet<>();
    for (final long[] x : l) {
      if (x[1] > 1) {
        ++count;
        distinct.add(x[0]);
      }
    }

    return count - distinct.size();
  }

  @Override
  public Z next() {
    while (!mValues.containsKey(mN)) {
      final int j = c(mK);
      if (j >= 0 && !mValues.containsKey(j)) {
        mValues.put(j, Z.valueOf(mK));
      }
      ++mK;
    }
    return mValues.get(mN++);
  }
}
