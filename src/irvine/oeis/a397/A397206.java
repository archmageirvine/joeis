package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397206 Number of words of length n over an infinite alphabet such that all prefixes satisfy c(i) &gt;= c(j) if f(i) &lt; f(j) where c(i) is the number of occurrences of the letter i and f(i) = floor(sqrt(2*i) + 1/2).
 * @author Sean A. Irvine
 */
public class A397206 extends Sequence0 {

  // After John Tyler Rascoe

  private int mN = -1;

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
    final byte[] t = new byte[a[0].length + 1];
    System.arraycopy(a[0], 0, t, 0, a[0].length);
    t[a[0].length] = 1;
    a[0] = t;
    return a;
  }

  // Creates a safe modifiable version of a given row in the copy
  private static byte[] writable(final byte[][] p, final boolean[] copied, final int row) {
    if (!copied[row]) {
      p[row] = p[row].clone();
      copied[row] = true;
    }
    return p[row];
  }

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

  private static boolean usable(final byte[] row) {
    for (final byte x : row) {
      if (x <= 0) {
        return false;
      }
    }
    return true;
  }

  private Z compute(final int nMax) {
    final byte[][] p = pots(nMax + 1);
    List<byte[][]> states = new ArrayList<>();
    states.add(p);
    for (int n = 0; n < nMax; ++n) {
      final List<byte[][]> next = new ArrayList<>();
      for (final byte[][] state : states) {
        for (int j = 1; j <= p.length; ++j) {
          if (!usable(state[j - 1])) {
            continue;
          }
          next.add(npot(j, state));
        }
      }
      states = next;
    }
    return Z.valueOf(states.size());
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
