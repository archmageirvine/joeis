package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397362 Triangle read by rows: T(n,k) is the number of words of length n over an infinite alphabet with with c(1) = k, such that all prefixes satisfy c(i) &gt;= c(j) if f(i) &lt; f(j) where c(i) is the number of occurrences of the letter i and f(i) = floor(sqrt(2*i) + 1/2).
 * @author Sean A. Irvine
 */
public class A397362 extends Sequence0 {

  // Cf. A397206

  private int mN = 0;
  private Z[] mRow = {Z.ONE};
  private int mPos = 0;

  private static int group(final int i) {
    return 1 + ((int) Math.sqrt(8L * (i - 1) + 1) - 1) / 2;
  }

  private static int rank(final int i) {
    final int g = group(i);
    return g - (Functions.TRIANGULAR.i(g) - i);
  }

  private static byte[][] pots(final int nMax) {
    final int size = Functions.TRIANGULAR.i(group(nMax));
    final byte[][] a = new byte[size][];

    for (int i = 1; i <= size; ++i) {
      a[i - 1] = new byte[group(i) - 1];
    }

    // Python: a[0].append(1)
    a[0] = Arrays.copyOf(a[0], a[0].length + 1);
    a[0][a[0].length - 1] = 1;

    return a;
  }

  /**
   * Make a state in which rows are initially shared with the parent.
   */
  private static byte[][] npot(final int j, final byte[][] f) {
    final byte[][] p = f.clone();
    final boolean[] copied = new boolean[p.length];

    if (j == 1) {
      ++writable(p, copied, 1)[0];
      ++writable(p, copied, 2)[0];
    } else {
      final int g = group(j);
      final int t = Functions.TRIANGULAR.i(g);
      final int r = t + g + 2;

      if (r <= p.length + 1) {
        final int col = rank(j) - 1;
        for (int u = t + 1; u < r; ++u) {
          ++writable(p, copied, u - 1)[col];
        }
      }

      final byte[] row = writable(p, copied, j - 1);
      for (int u = 0; u < row.length; ++u) {
        --row[u];
      }
    }

    return p;
  }

  private static byte[] writable(final byte[][] p, final boolean[] copied, final int row) {
    if (!copied[row]) {
      p[row] = p[row].clone();
      copied[row] = true;
    }
    return p[row];
  }

  private static boolean usable(final byte[] row) {
    for (final byte x : row) {
      if (x <= 0) {
        return false;
      }
    }
    return true;
  }

  private static final class State {
    private final byte[][] mP;
    private final int mOnes;

    private State(final byte[][] p, final int ones) {
      mP = p;
      mOnes = ones;
    }
  }

  private static Z[] compute(final int nMax) {
    final byte[][] p = pots(Math.max(3, nMax));
    List<State> states = new ArrayList<>();
    states.add(new State(p, 0));
    for (int n = 0; n < nMax; ++n) {
      final List<State> next = new ArrayList<>();
      for (final State state : states) {
        for (int j = 1; j <= state.mP.length; ++j) {
          if (usable(state.mP[j - 1])) {
            next.add(new State(npot(j, state.mP), state.mOnes + (j == 1 ? 1 : 0)));
          }
        }
      }
      states = next;
    }

    final Z[] row = new Z[nMax + 1];
    Arrays.fill(row, Z.ZERO);
    for (final State state : states) {
      row[state.mOnes] = row[state.mOnes].add(Z.ONE);
    }
    return row;
  }

  @Override
  public Z next() {
    if (mPos >= mRow.length) {
      mRow = compute(++mN);
      mPos = 0;
    }
    return mRow[mPos++];
  }
}
