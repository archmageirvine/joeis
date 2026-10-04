package irvine.oeis.a399;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399060 a(n) is the maximum size of a subset of the distinct entries in row n of Pascal's triangle such that no selected entry divides another.
 * @author Sean
 */
public class A399060 extends Sequence0 {

  private int mN = -1;

  private static Z[] binomialRow(final int n, final int len) {
    final Z[] row = new Z[len];
    row[0] = Z.ONE;
    for (int i = 1; i < len; ++i) {
      row[i] = row[i - 1].multiply(n - i + 1).divide(i);
    }
    return row;
  }

  private boolean augment(final int u, final int[][] adj, final int[] match, final boolean[] seen) {
    for (final int v : adj[u]) {
      if (!seen[v]) {
        seen[v] = true;
        if (match[v] == -1 || augment(match[v], adj, match, seen)) {
          match[v] = u;
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final int m = mN / 2 + 1;
    final Z[] b = binomialRow(mN, m);
    final int[][] adj = new int[m][];
    for (int i = 0; i < m; ++i) {
      int count = 0;
      for (int j = i + 1; j < m; ++j) {
        if (b[j].mod(b[i]).isZero()) {
          ++count;
        }
      }
      adj[i] = new int[count];
      int k = 0;
      for (int j = i + 1; j < m; ++j) {
        if (b[j].mod(b[i]).isZero()) {
          adj[i][k++] = j;
        }
      }
    }
    final int[] match = new int[m];
    Arrays.fill(match, -1);
    int matching = 0;
    for (int i = 0; i < m; ++i) {
      if (augment(i, adj, match, new boolean[m])) {
        ++matching;
      }
    }
    return Z.valueOf(m - matching);
  }
}

