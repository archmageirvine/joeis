package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397255 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A397255 extends Sequence0 {

  // After M. F. Hasler

  private static final class Poset {
    final int[] mRows;
    Poset(final int[] rows) {
      mRows = rows;
    }
  }

  private int mN = -1;
  private int mM = 0;
  private ArrayList<Z> mRow = new ArrayList<>();
  private final HashMap<Integer, ArrayList<Poset>> mCache = new HashMap<>();

  private ArrayList<Poset> posets(final int n) {
    ArrayList<Poset> res = mCache.get(n);
    if (res != null) {
      return res;
    }

    res = new ArrayList<>();
    if (n == 0) {
      res.add(new Poset(new int[0]));
    } else if (n == 1) {
      res.add(new Poset(new int[] {1}));
    } else {
      final int nn = n - 1;
      final int bitN = 1 << nn;
      for (final Poset p : posets(nn)) {
        final int[] rows = p.mRows;

        final int[] preds = new int[nn];
        for (int i = 0; i < nn; ++i) {
          final int r = rows[i];
          for (int j = 0; j < nn; ++j) {
            if (((r >>> j) & 1) != 0) {
              preds[j] |= 1 << i;
            }
          }
        }

        final int[] a = new int[nn];
        search(res, rows, preds, a, 0, bitN);
      }
    }

    mCache.put(n, res);
    return res;
  }

  private void search(final ArrayList<Poset> out, final int[] rows, final int[] preds, final int[] a, final int k, final int bitN) {
    if (k == a.length) {
      int dMask = 0;
      int uMask = 0;
      for (int i = 0; i < a.length; ++i) {
        if (a[i] == 1) {
          dMask |= 1 << i;
        } else if (a[i] == 2) {
          uMask |= 1 << i;
        }
      }

      for (int i = 0; i < a.length; ++i) {
        if (a[i] == 1) {
          if ((preds[i] & ~dMask) != 0 || (uMask & ~rows[i]) != 0) {
            return;
          }
        } else if (a[i] == 2) {
          if ((rows[i] & ~uMask) != 0) {
            return;
          }
        }
      }

      final int[] pNew = Arrays.copyOf(rows, rows.length + 1);
      for (int i = 0; i < rows.length; ++i) {
        if (a[i] == 1) {
          pNew[i] |= bitN;
        }
      }
      pNew[rows.length] = bitN | uMask;
      out.add(new Poset(pNew));
      return;
    }

    for (int t = 0; t < 3; ++t) {
      a[k] = t;
      search(out, rows, preds, a, k + 1, bitN);
    }
  }

  private Z topology(final int[] r) {
    Z t = Z.ONE;
    final int n = r.length;
    final int[] ol = new int[1 << n];
    for (int i = 0; i < n; ++i) {
      final int bit = 1 << i;
      for (int s = 0; s < bit; ++s) {
        ol[s | bit] = ol[s] | r[i];
        t = t.setBit(ol[s | bit]);
      }
    }
    return t;
  }

  private ArrayList<Z> compute(final int n) {
    final ArrayList<Z> row = new ArrayList<>();
    for (final Poset p : posets(n)) {
      row.add(topology(p.mRows));
    }
    Collections.sort(row);
    return row;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.size()) {
      mRow = compute(++mN);
      mM = 0;
    }
    return mRow.get(mM);
  }
}
