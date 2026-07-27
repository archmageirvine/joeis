package irvine.oeis.a398;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398094 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398094 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;
  private int mM = 0;
  protected Z[] mRow = {};

  private int[] mA;
  private int[] mB;
  private int[][] mC;
  private Map<Z, Integer> mD;

  protected void computeRow() {
    if (++mN <= 2) {
      mRow = new Z[] {Z.ONE};
      return;
    }
    mA = new int[mN];
    Arrays.fill(mA, 2);
    mB = new int[mN];
    for (int k = 0; k < mN; ++k) {
      mB[k] = k;
    }
    mC = new int[mN][2];
    mD = new HashMap<>();
    search(mN - 1);
    final Map<Integer, Integer> hist = new HashMap<>();
    int max = 0;
    for (final int v : mD.values()) {
      hist.merge(v, 1, Integer::sum);
      if (v > max) {
        max = v;
      }
    }

    mRow = new Z[max];
    for (int k = 1; k <= max; ++k) {
      mRow[k - 1] = Z.valueOf(hist.getOrDefault(k, 0));
    }
  }

  private void record() {
    final int[] first = new int[mN];
    final int[] second = new int[mN];
    final int[] deg = new int[mN];
    Arrays.fill(first, -1);
    Arrays.fill(second, -1);
    for (int i = 1; i < mN; ++i) {
      final int u = mC[i][0];
      final int v = mC[i][1];
      if (deg[u] == 0) {
        first[u] = v;
      } else {
        second[u] = v;
      }
      ++deg[u];
      if (deg[v] == 0) {
        first[v] = u;
      } else {
        second[v] = u;
      }
      ++deg[v];
    }

    int start = -1;
    for (int k = 0; k < mN; ++k) {
      if (deg[k] == 1) {
        start = k;
        break;
      }
    }
    final int[] p = new int[mN];
    int prev = -1;
    int cur = start;
    for (int i = 0; i < mN; ++i) {
      p[i] = cur;
      if (i + 1 < mN) {
        final int nxt = first[cur] != prev ? first[cur] : second[cur];
        prev = cur;
        cur = nxt;
      }
    }
    Z fwd = Z.ZERO;
    for (int i = 0; i < mN - 1; ++i) {
      fwd = fwd.multiply(32).add(Math.abs(p[i + 1] - p[i]));
    }
    Z rev = Z.ZERO;
    for (int i = mN - 2; i >= 0; --i) {
      rev = rev.multiply(32).add(Math.abs(p[i + 1] - p[i]));
    }
    mD.merge(fwd, 1, Integer::sum);
    mD.merge(rev, 1, Integer::sum);
  }

  private void search(final int e) {
    if (e == 0) {
      record();
      return;
    }

    if (e == mN - 1) {
      final int h = 0;
      final int i = mN - 1;
      if (mA[h] > 0 && mA[i] > 0 && mB[h] != i) {
        final int j = mB[h];
        final int k = mB[i];
        final int l = mB[j];
        final int m = mB[k];
        mB[j] = k;
        mB[k] = j;
        --mA[h];
        --mA[i];
        mC[e][0] = h;
        mC[e][1] = i;
        search(e - 1);
        ++mA[h];
        ++mA[i];
        mB[j] = l;
        mB[k] = m;
      }
      return;
    }

    if (e == mN - 2) {
      final int h = 0;
      final int i = mN - 2;
      if (mA[h] > 0 && mA[i] > 0 && mB[h] != i) {
        final int j = mB[h];
        final int k = mB[i];
        final int l = mB[j];
        final int m = mB[k];
        mB[j] = k;
        mB[k] = j;
        --mA[h];
        --mA[i];
        mC[e][0] = h;
        mC[e][1] = i;
        search(e - 1);
        ++mA[h];
        ++mA[i];
        mB[j] = l;
        mB[k] = m;
      }
      return;
    }

    for (int h = 0; h <= mN - 1 - e; ++h) {
      final int i = h + e;
      if (mA[h] > 0 && mA[i] > 0 && mB[h] != i) {
        final int j = mB[h];
        final int k = mB[i];
        final int l = mB[j];
        final int m = mB[k];
        mB[j] = k;
        mB[k] = j;
        --mA[h];
        --mA[i];
        mC[e][0] = h;
        mC[e][1] = i;
        search(e - 1);
        ++mA[h];
        ++mA[i];
        mB[j] = l;
        mB[k] = m;
      }
    }
  }

  @Override
  public Z next() {
    if (mM >= mRow.length) {
      computeRow();
      mM = 0;
    }
    return mRow[mM++];
  }
}
