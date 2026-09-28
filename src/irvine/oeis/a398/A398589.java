package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicIntArray;

/**
 * A398589 allocated for Joshua B. Weinstein.
 * @author Sean A. Irvine
 */
public class A398589 extends Sequence0 {

  private LongDynamicIntArray mRow = new LongDynamicIntArray();
  private int mN = -1;
  private long mM = 0;

  private String getState(final long pos, final int value, final DynamicLongArray counters) {
    // Encode state as value and deltas for banned values
    final StringBuilder sb = new StringBuilder();
    sb.append(value);
    for (int k = 0; k < counters.length(); ++k) {
      final long delta = counters.get(k) - pos;
      if (delta > 0) {
        sb.append(',').append(k).append('=').append(delta);
      }
    }
    //System.out.println("New state: " + sb);
    return sb.toString();
  }

  private void computeRow(final int n) {
    //System.out.println("Starting row " + n);
    mRow = new LongDynamicIntArray();
    final HashSet<String> seen = new HashSet<>();
    final DynamicLongArray counters = new DynamicLongArray();
    mRow.set(0, n);
    counters.set(n, n);
    long m = 0;
    while (seen.add(getState(m, mRow.get(m), counters))) {
      ++m;
      int k = n;
      while (counters.get(k) >= m) {
        ++k; // k is still banned
      }
      counters.set(k, m + k);
      mRow.set(m, k);
    }
    // Truncate back to the period
    mRow.truncate(mRow.length() - counters.length() + 1);
  }

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    if (++mM >= mRow.length()) {
      mM = 0;
      computeRow(++mN);
    }
    return Z.valueOf(mRow.get(mM));
  }
}
