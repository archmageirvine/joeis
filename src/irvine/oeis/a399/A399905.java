package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A399905 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A399905 extends Sequence1 {

  // We use element 0 of each row to store the sum of the row

  private int mN = -1;
  private final List<DynamicLongArray> mA = new ArrayList<>();

  private boolean isStarter(final long n, final long maxRow) {
    int row = -1;
    while (++row <= maxRow && t(row, 1) <= n) {
      int col = 0;
      long s = 0;
      while (s < n) {
        s += t(row, ++col);
      }
      if (s == n) {
        return false;
      }
    }
    return true;
  }

  private boolean isUnused(final DynamicLongArray r, final long k) {
    for (int j = 1; j < r.length(); ++j) {
      if (r.get(j) == k) {
        return false;
      }
    }
    return true;
  }

  private boolean isSafe(final int row, final long sk) {
    for (int r = 0; r < row; ++r) {
      final DynamicLongArray ra = mA.get(r);
      long rs = 0;
      int j = 1;
      while (rs <= sk) {
        if (rs == sk) {
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
    if (s == 0) {
      // we are starting a new row
      long start = 0;
      while (!isStarter(++start, n - 1)) {
        // do nothing
      }
      r.set(0, start);
      r.set(1, start);
      return;
    }
    long k = 0;
    while (true) {
      if (isUnused(r, ++k)) {
        if (isSafe(n, s + k)) {
          final int pos = Math.max(1, r.length());
          r.set(pos, k);
          if (r.add(0, k) < 0) {
            // Detected an overflow
            throw new UnsupportedOperationException();
          }
          return;
        } else {
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
    return Z.valueOf(t(++mN, 1));
  }
}
