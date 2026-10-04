package irvine.oeis.a399;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399069 a(n) is the least positive integer divisible by at least n distinct entries of a single row of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A399069 extends Sequence0 {

  private final HashMap<Integer, Z[]> mBinomialRows = new HashMap<>();
  private int mN = -1;
  private Z mMin = null;

  private Z[] row(final int row) {
    final Z[] r = mBinomialRows.get(row);
    if (r != null) {
      return r;
    }
    final Z[] res = new Z[row / 2 + 1];
    for (int k = 0; k < res.length; ++k) {
      res[k] = Binomial.binomial(row, k);
    }
    mBinomialRows.put(row, res);
    return res;
  }

  private void search(final Z[] row, final int pos, final Z lcm, final int remaining) {
    if (pos + remaining > row.length) {
      return;
    }
    if (lcm.compareTo(mMin) >= 0) {
      return;
    }
    if (remaining == 0) {
      mMin = lcm;
      return;
    }
    if (row[pos + remaining - 1].compareTo(mMin) < 0) {
      search(row, pos + 1, lcm.lcm(row[pos]), remaining - 1);
    }
    if (pos + remaining < row.length && row[pos + remaining].compareTo(mMin) < 0) {
      search(row, pos + 1, lcm, remaining);
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    int r = 2 * mN - 2;
    // Remove rows we will never consult again
    mBinomialRows.remove(r - 1);
    mBinomialRows.remove(r - 2);
    // Get a lower bound from row r
    mMin = Functions.LCM.z(row(r));
    // Try larger rows r to find better solutions
    while (true) {
      final Z[] row = row(++r);
      if (row[mN - 1].compareTo(mMin) >= 0) {
        break;
      }
      // WLOG may as well take row[0] = 1
      search(row, 1, Z.ONE, mN - 1);
    }
    return mMin;
  }
}
