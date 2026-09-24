package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A399897 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A399897 extends Sequence1 {

  // We use element 0 of each row to store the sum of the row

  private int mN = -1;
  private final List<DynamicLongArray> mA = new ArrayList<>();

  private boolean isUnused(final DynamicLongArray r, final long k) {
    for (int j = 1; j < r.length(); ++j) {
      if (r.get(j) == k) {
        return false;
      }
    }
    return true;
  }

  private boolean isSafe(final int row, final long sk, final long skk) {
    for (int r = 0; r < row; ++r) {
      final DynamicLongArray ra = mA.get(r);
      long rs = 0;
      int j = 1;
      while (rs <= skk) {
        if (rs == sk || rs == skk) {
          return false;
        }
        if (ra.get(j) == 0) {
          t(r, j); // trigger computation of a currently unknown value
        }
        assert ra.get(j) > 0;
        rs += ra.get(j);
        ++j;
      }
    }
    return true;
  }

  private void compute(final int n) {
    final DynamicLongArray r = mA.get(n);
    final long s = r.get(0); // sum of the row
    long k = 0;
    while (true) {
      if (isUnused(r, ++k)) {
        long kPrime = 0;
        while (true) {
          if (++kPrime != k && isUnused(r, kPrime) && isSafe(n, s + kPrime, s + k + kPrime)) {
            final int pos = Math.max(1, r.length());
            r.set(pos, kPrime);
            r.set(pos + 1, k);
            if (r.add(0, k + kPrime) < 0) {
              // Detected an overflow
              throw new UnsupportedOperationException();
            }
            return;
          }
        }
      }
    }
  }

  protected long t(final int n, final int m) {
    while (n >= mA.size()) {
      mA.add(new DynamicLongArray());
    }
    final DynamicLongArray r = mA.get(n);
    while (r.get(m) == 0) {
      compute(n);
    }
    return r.get(m);
  }

  @Override
  public Z next() {
    // Neil wanted to see the following
//    for (int k = 0; k < 10; ++k) {
//      final StringBuilder sb = new StringBuilder("Row " + (k + 1) + ": ");
//      for (int j = 1; j <= 100; ++j) {
//        sb.append(t(k, j)).append(", ");
//      }
//      sb.append("...");
//      System.out.println(sb);
//    }
    return Z.valueOf(t(++mN, 1));
  }
}
