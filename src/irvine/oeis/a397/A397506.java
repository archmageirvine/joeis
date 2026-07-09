package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397506 Number of fully indecomposable n X n matrices with all entries 0 or 1.
 * @author Sean A. Irvine
 */
public class A397506 extends Sequence1 {

  // After Daniyal Kadirbekov

  private int mN = 0;
  private List<Integer> mProper;
  private int[][] mSupersets;
  private int[] mCnt;
  private Z mTotal;

  private void search(final int start, final int rem, final Z invProd) {
    mTotal = mTotal.add(Functions.FACTORIAL.z(mN).divide(invProd.multiply(Functions.FACTORIAL.z(rem))));
    for (int j = start; j < mProper.size(); ++j) {
      final int s = mProper.get(j);
      int applied = 0;
      for (int mult = 1; mult <= rem; ++mult) {
        boolean bad = false;
        for (final int t : mSupersets[s]) {
          if (++mCnt[t] > Integer.bitCount(t) - 1) {
            bad = true;
          }
        }
        applied = mult;
        if (bad) {
          for (final int t : mSupersets[s]) {
            --mCnt[t];
          }
          applied = mult - 1;
          break;
        }
        search(j + 1, rem - mult, invProd.multiply(Functions.FACTORIAL.z(mult)));
      }
      while (applied-- > 0) {
        for (final int t : mSupersets[s]) {
          --mCnt[t];
        }
      }
    }
  }

  private Z compute(final int n) {
    if (n < 2) {
      return Z.ONE;
    }
    final int full = 1 << n;
    mProper = new ArrayList<>();
    for (int s = 0; s < full; ++s) {
      if (Integer.bitCount(s) >= 2 && Integer.bitCount(s) <= n - 1) {
        mProper.add(s);
      }
    }
    mProper.sort(Comparator.comparingInt(Integer::bitCount));

    mSupersets = new int[full][];
    for (final int s : mProper) {
      final List<Integer> list = new ArrayList<>();
      for (int t = 0; t < full; ++t) {
        if (t != full - 1 && (t & s) == s) {
          list.add(t);
        }
      }
      final int[] a = new int[list.size()];
      for (int k = 0; k < a.length; ++k) {
        a[k] = list.get(k);
      }
      mSupersets[s] = a;
    }

    mCnt = new int[full];
    mTotal = Z.ZERO;
    search(0, n, Z.ONE);
    return mTotal;
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
