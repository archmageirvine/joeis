package irvine.oeis.a402;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402495 Board sizes k &gt;= 5 for which Warnsdorff's knight's tour heuristic with the specified half-up variant of Roth's tie-breaking fails.
 * @author Sean A. Irvine
 */
public class A402495 extends Sequence1 {

  // After Jwalin Bhatt

  private static final int[] DX = {2, 1, -1, -2, -2, -1, 1, 2};
  private static final int[] DY = {-1, -2, -2, -1, 1, 2, 2, 1};

  private int mN = 427;

  private int visited(final int n) {
    final int[][] degree = new int[n + 4][n + 4];
    for (int x = 0; x < n + 4; ++x) {
      Arrays.fill(degree[x], -1);
    }
    for (int x = 2; x < n + 2; ++x) {
      Arrays.fill(degree[x], 2, n + 2, 0);
    }
    for (int x = 2; x < n + 2; ++x) {
      for (int y = 2; y < n + 2; ++y) {
        for (int k = 0; k < 8; ++k) {
          if (degree[x + DX[k]][y + DY[k]] >= 0) {
            ++degree[x][y];
          }
        }
      }
    }
    final int target = 2 * ((n + 1) / 2) + 1;
    int x = 2;
    int y = 2;
    int visits = 0;
    while (true) {
      degree[x][y] = -1;
      ++visits;
      int best = 9;
      int bestDistance = 0;
      int nextX = -1;
      int nextY = -1;
      for (int k = 0; k < 8; ++k) {
        final int u = x + DX[k];
        final int v = y + DY[k];
        if (degree[u][v] >= 0) {
          --degree[u][v];
          final int ax = 2 * u - target;
          final int ay = 2 * v - target;
          final int distance = ax * ax + ay * ay;
          // Lexicographically minimize (degree, -distance).
          if (degree[u][v] < best || (degree[u][v] == best && distance > bestDistance)) {
            best = degree[u][v];
            bestDistance = distance;
            nextX = u;
            nextY = v;
          }
        }
      }
      if (nextX < 0) {
        return visits;
      }
      x = nextX;
      y = nextY;
    }
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (visited(mN) < mN * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
