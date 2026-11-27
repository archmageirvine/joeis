package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402384 a(n) is the smallest positive n-digit number from which no earlier term can be obtained by deleting digits and rearranging the rest.
 * @author Sean A. Irvine
 */
public class A402384 extends Sequence1 {

  // After Alper Ferudun

  private static final int DIGITS = 10;
  private static final int BOUND = 500;

  private static final class Box {
    private final int[] mLo;
    private final int[] mHi;
    private final int mD;

    private Box(final int[] lo, final int[] hi, final int d) {
      mLo = lo;
      mHi = hi;
      mD = d;
    }

    private int sumLo() {
      return Functions.SUM.i(mLo);
    }

    private int sumHi() {
      return Functions.SUM.i(mHi);
    }
  }

  private static class Candidate {
    private final int[] mV;
    private final int mD;
    private final int[] mKey;

    Candidate(final int[] v, final int d) {
      mV = v;
      mD = d;
      mKey = new int[2 + DIGITS - d];
      mKey[0] = -d;
      mKey[1] = v[0];
      System.arraycopy(v, d, mKey, 2, DIGITS - d);
    }
  }

  private List<Box> mBoxes;
  private int mN;

  public A402384() {
    mBoxes = new ArrayList<>();
    mN = 0;

    // Initial boxes.
    for (int d = 1; d < DIGITS; ++d) {
      final int[] lo = new int[DIGITS];
      lo[d] = 1;
      final int[] hi = new int[DIGITS];
      hi[0] = BOUND;
      for (int i = d; i < DIGITS; ++i) {
        hi[i] = BOUND;
      }
      mBoxes.add(new Box(lo, hi, d));
    }
  }

  /*
   * Compare candidates in the same order as Python tuple comparison: (key, v, d).
   */
  private static int compare(final Candidate a, final Candidate b) {
    for (int i = 0; i < Math.min(a.mKey.length, b.mKey.length); ++i) {
      if (a.mKey[i] != b.mKey[i]) {
        return Integer.compare(a.mKey[i], b.mKey[i]);
      }
    }
    if (a.mKey.length != b.mKey.length) {
      return Integer.compare(a.mKey.length, b.mKey.length);
    }
    for (int i = 0; i < DIGITS; ++i) {
      if (a.mV[i] != b.mV[i]) {
        return Integer.compare(a.mV[i], b.mV[i]);
      }
    }
    return Integer.compare(a.mD, b.mD);
  }

  /*
   * Construct the candidate vector for a box.
   */
  private static Candidate makeCandidate(final Box box, final int n) {
    final int[] v = box.mLo.clone();
    int left = n - Functions.SUM.i(v);
    final int d = box.mD;
    for (int i = 0; i < DIGITS; ++i) {
      if (i != 0 && i < d) {
        continue;
      }
      final int t = Math.min(left, box.mHi[i] - v[i]);
      v[i] += t;
      left -= t;
    }
    return new Candidate(v, d);
  }

  /*
   * Return the decimal numeral represented by the selected vector.
   */
  private static Z makeTerm(final Candidate candidate) {
    final int[] v = candidate.mV;
    final int d = candidate.mD;
    final StringBuilder sb = new StringBuilder();
    sb.append(d);
    appendRepeated(sb, '0', v[0]);
    appendRepeated(sb, (char) ('0' + d), v[d] - 1);
    for (int i = d + 1; i < DIGITS; ++i) {
      appendRepeated(sb, (char) ('0' + i), v[i]);
    }
    return new Z(sb.toString());
  }

  private static void appendRepeated(final StringBuilder sb, final char digit, final int count) {
    sb.append(String.valueOf(digit).repeat(count));
  }

  /*
   * Partition the boxes after selecting vector v.
   */
  private List<Box> updateBoxes(final int[] v, final int n) {
    final List<Box> next = new ArrayList<>();
    for (final Box box : mBoxes) {
      boolean impossible = false;
      for (int i = 0; i < DIGITS; ++i) {
        if (box.mHi[i] < v[i]) {
          impossible = true;
          break;
        }
      }
      if (impossible) {
        next.add(box);
        continue;
      }
      final int[] lo = box.mLo.clone();
      for (int i = 0; i < DIGITS; ++i) {
        if (lo[i] < v[i]) {
          final int[] hi = box.mHi.clone();
          hi[i] = v[i] - 1;
          next.add(new Box(lo.clone(), hi, box.mD));
          lo[i] = v[i];
        }
      }
    }

    final List<Box> filtered = new ArrayList<>();
    for (final Box box : next) {
      if (box.sumHi() > n) {
        filtered.add(box);
      }
    }
    return filtered;
  }

  @Override
  public Z next() {
    ++mN;
    Candidate best = null;
    for (final Box box : mBoxes) {
      if (box.sumLo() <= mN && mN <= box.sumHi()) {
        final Candidate candidate = makeCandidate(box, mN);
        if (best == null || compare(candidate, best) > 0) {
          best = candidate;
        }
      }
    }
    if (best == null) {
      return null;
    }
    final Z result = makeTerm(best);
    mBoxes = updateBoxes(best.mV, mN);
    return result;
  }
}

