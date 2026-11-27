package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402383 a(n) is the largest n-digit number from which no earlier term can be obtained by deleting digits and rearranging the rest.
 * @author Sean A. Irvine
 */
public class A402383 extends Sequence1 {

  // After Alper Ferudun

  private static final int DIGITS = 10;
  private static final int LIMIT = 500;

  private static class Box {
    private final int[] mLo;
    private final int[] mHi;

    Box(final int[] lo, final int[] hi) {
      mLo = lo;
      mHi = hi;
    }

    int sumLo() {
      int s = 0;
      for (final int x : mLo) {
        s += x;
      }
      return s;
    }

    int sumHi() {
      int s = 0;
      for (final int x : mHi) {
        s += x;
      }
      return s;
    }
  }

  private final List<Box> mBoxes = new ArrayList<>();
  private int mN = 0;

  /** Construct the sequence. */
  public A402383() {
    // Initial boxes:
    // lo = [0,...,0,1,0,...,0]
    // hi = [0,...,0,500,500,...,500]
    for (int j = 0; j < 9; ++j) {
      final int[] lo = new int[DIGITS];
      final int[] hi = new int[DIGITS];
      lo[j] = 1;
      for (int i = j; i < DIGITS; ++i) {
        hi[i] = LIMIT;
      }
      mBoxes.add(new Box(lo, hi));
    }
  }

  /**
   * Construct the greedy candidate for a box.
   * Counts are in descending digit order, 9 down to 0.
   */
  private int[] candidate(final Box box, final int n) {
    final int[] v = box.mLo.clone();
    int left = n - box.sumLo();
    for (int i = 0; i < DIGITS && left > 0; ++i) {
      final int t = Math.min(left, box.mHi[i] - v[i]);
      v[i] += t;
      left -= t;
    }
    return v;
  }

  /**
   * Lexicographic comparison of digit-count vectors.
   */
  private int compare(final int[] a, final int[] b) {
    for (int i = 0; i < DIGITS; ++i) {
      if (a[i] != b[i]) {
        return Integer.compare(a[i], b[i]);
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    int[] best = null;
    for (final Box box : mBoxes) {
      if (box.sumLo() <= mN && mN <= box.sumHi()) {
        final int[] v = candidate(box, mN);
        if (best == null || compare(v, best) > 0) {
          best = v;
        }
      }
    }

    if (best == null) {
      return null;
    }

    // Convert the digit-count vector to the decimal number.
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < DIGITS; ++i) {
      sb.append(String.valueOf(9 - i).repeat(best[i]));
    }

    final Z result = new Z(sb);

    // Split each box to exclude vectors componentwise >= best.
    final List<Box> nextBoxes = new ArrayList<>();

    for (final Box box : mBoxes) {
      boolean disjoint = false;
      for (int i = 0; i < DIGITS; ++i) {
        if (box.mHi[i] < best[i]) {
          disjoint = true;
          break;
        }
      }

      if (disjoint) {
        nextBoxes.add(box);
        continue;
      }

      final int[] lo = box.mLo.clone();
      for (int i = 0; i < DIGITS; ++i) {
        if (lo[i] < best[i]) {
          final int[] hi = box.mHi.clone();
          hi[i] = best[i] - 1;
          nextBoxes.add(new Box(lo.clone(), hi));
          lo[i] = best[i];
        }
      }
    }

    mBoxes.clear();
    for (final Box box : nextBoxes) {
      if (box.sumHi() > mN) {
        mBoxes.add(box);
      }
    }
    return result;
  }
}
