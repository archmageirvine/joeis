package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401738 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A401738 extends Sequence0 {

  // After Alper Ferudun

  private int mN = -1;

  /**
   * Shared computation of periods and preperiods.
   */
  public static class Periods {

    private final List<List<Integer>> mRows = new ArrayList<>();
    private final List<Integer> mPeriods = new ArrayList<>();
    private final List<Integer> mPreperiods = new ArrayList<>();

    private int mQ = 1;
    private int mS = 0;

    /**
     * Extend row y to length L.
     * @param y row number
     * @param l required length
     */
    private void grow(final int y, final int l) {
      final List<Integer> r = mRows.get(y);
      for (int x = r.size(); x < l; ++x) {
        for (int z = 0; z < y; ++z) {
          final List<Integer> rz = mRows.get(z);
          while (rz.size() <= x) {
            rz.add(rz.get(rz.size() - mPeriods.get(z)));
          }
        }

        final Set<Integer> s = new HashSet<>();
        for (int d = 1; d <= Math.min(x, y); ++d) {
          if (r.get(x - d).equals(mRows.get(y - d).get(x))
            && r.get(x - d).equals(mRows.get(y - d).get(x - d))) {
            s.add(r.get(x - d));
          }
        }

        // Minimum excluded value (mex).
        int mex = 0;
        while (s.contains(mex)) {
          ++mex;
        }
        r.add(mex);
      }
    }

    /**
     * Compute rows up to and including y.
     * @param y required row
     */
    private void compute(final int y) {
      while (mRows.size() <= y) {
        final int row = mRows.size();
        mRows.add(new ArrayList<>());

        final List<Integer> r = mRows.get(row);
        int x = mS + row;
        int m = 0;

        // Find the least multiple of Q which gives a repeated block.
        while (m == 0) {
          ++x;
          grow(row, x);

          for (int k = mQ; k < x - row - mS + 1; k += mQ) {
            boolean equal = true;
            for (int j = 0; j < row; ++j) {
              if (!r.get(x - row - k + j).equals(r.get(x - row + j))) {
                equal = false;
                break;
              }
            }
            if (equal) {
              m = k;
              break;
            }
          }
        }

        final int u = x - row - m;
        grow(row, u + 2 * m);

        // Find the least period dividing M.
        int p = m;
        for (int q = 1; q <= m; ++q) {
          if (m % q != 0) {
            continue;
          }
          boolean equal = true;
          for (int j = 0; j < m; ++j) {
            if (!r.get(u + q + j).equals(r.get(u + j))) {
              equal = false;
              break;
            }
          }
          if (equal) {
            p = q;
            break;
          }
        }

        mPeriods.add(p);

        // Find the least preperiod.
        int preperiod = 0;
        for (int i = 0; i < u; ++i) {
          if (!r.get(i).equals(r.get(i + p))) {
            preperiod = i + 1;
          }
        }
        mPreperiods.add(preperiod);

        // Update the common period and starting column.
        mQ = lcm(mQ, p);
        mS = Math.max(mS, preperiod);
      }
    }

    private int lcm(final int a, final int b) {
      return a / gcd(a, b) * b;
    }

    private int gcd(int a, int b) {
      while (b != 0) {
        final int t = a % b;
        a = b;
        b = t;
      }
      return a;
    }

    /**
     * Get the eventual period of row n.
     * @param n row number
     * @return eventual period
     */
    public int getPeriod(final int n) {
      compute(n);
      return mPeriods.get(n);
    }

    /**
     * Get the preperiod of row n.
     * @param n row number
     * @return preperiod
     */
    public int getPreperiod(final int n) {
      compute(n);
      return mPreperiods.get(n);
    }
  }

  private final Periods mData = new Periods();

  @Override
  public Z next() {
    return Z.valueOf(mData.getPreperiod(++mN));
  }
}
