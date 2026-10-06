package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397650 allocated for David Radcliffe.
 * @author Sean A. Irvine
 */
public class A397650 extends Sequence1 {

  // After David Radcliffe

  private int mN = 0;
  private final List<Integer> mB = new ArrayList<>();

  private static final class Suffix {
    private final Z mN;
    private final int mJ;

    private Suffix(final Z n, final int j) {
      mN = n;
      mJ = j;
    }
  }

  private static final class Tail {
    private final Z mN;
    private final int mFirstPos;

    private Tail(final Z n, final int firstPos) {
      mN = n;
      mFirstPos = firstPos;
    }
  }

  private List<Suffix> getSuffixes(final int m) {
    final List<Suffix> result = new ArrayList<>();
    if (m == 1) {
      for (int d = 2; d <= 8; d += 2) {
        result.add(new Suffix(Z.valueOf(d), 0));
      }
    } else {
      final List<Suffix> prevSuffixes = getSuffixes(m - 1);
      for (final Suffix s : prevSuffixes) {
        final int t = Functions.VALUATION.i(s.mN, 2);
        for (int k = s.mJ + 1; k <= t; ++k) {
          final int startD = (k == t) ? 1 : 2;
          final Z pow10 = Z.TEN.pow(k);
          for (int d = startD; d < 10; d += 2) {
            final Z nextN = s.mN.add(Z.valueOf(d).multiply(pow10));
            result.add(new Suffix(nextN, k));
          }
        }
      }
    }
    return result;
  }

  private void generateCombinations(final int start, final int n, final int k, final List<Integer> current, final List<List<Integer>> result) {
    if (current.size() == k) {
      result.add(new ArrayList<>(current));
      return;
    }
    for (int i = start; i <= n; ++i) {
      current.add(i);
      generateCombinations(i + 1, n, k, current, result);
      current.remove(current.size() - 1);
    }
  }

  private void generateProduct(final int depth, final int length, final List<Integer> current, final List<List<Integer>> result) {
    if (depth == length) {
      result.add(new ArrayList<>(current));
      return;
    }
    for (int d = 1; d <= 9; ++d) {
      current.add(d);
      generateProduct(depth + 1, length, current, result);
      current.remove(current.size() - 1);
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      int maxVal = 0;
      for (long i = 1; i < 10; ++i) {
        maxVal = Math.max(maxVal, Functions.VALUATION.i(i, 2));
      }
      mB.add(maxVal);
      return Z.valueOf(maxVal);
    }

    final int lastB = mB.get(mB.size() - 1);
    final int q = Math.min(2, mN - 1);
    final Z modulus = Z.ONE.shiftLeft(lastB + 1);

    // Generate positions combinations
    final List<List<Integer>> posCombos = new ArrayList<>();
    generateCombinations(1, lastB, q, new ArrayList<>(), posCombos);

    // Generate digit products
    final List<List<Integer>> digitProds = new ArrayList<>();
    generateProduct(0, q, new ArrayList<>(), digitProds);
    final Map<Z, List<Tail>> tails = new HashMap<>();
    for (final List<Integer> positions : posCombos) {
      for (final List<Integer> digits : digitProds) {
        Z sum = Z.ZERO;
        for (int i = 0; i < q; ++i) {
          final int d = digits.get(i);
          final int k = positions.get(i);
          sum = sum.add(Z.valueOf(d).multiply(Z.TEN.pow(k)));
        }
        final Z rem = sum.mod(modulus);
        tails.computeIfAbsent(rem, k -> new ArrayList<>()).add(new Tail(sum, positions.get(0)));
      }
    }

    int best = lastB;
    final List<Suffix> suffs = getSuffixes(mN - q);
    for (final Suffix suff : suffs) {
      final Z targetRem = suff.mN.negate().mod(modulus);
      final List<Tail> tailList = tails.get(targetRem);
      if (tailList != null) {
        for (final Tail tail : tailList) {
          if (tail.mFirstPos > suff.mJ) {
            final Z total = suff.mN.add(tail.mN);
            best = Math.max(best, Functions.VALUATION.i(total, 2));
          }
        }
      }
    }

    mB.add(best);
    return Z.valueOf(best);
  }
}

