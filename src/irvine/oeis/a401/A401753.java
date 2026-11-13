
package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401753.
 * @author Sean A. Irvine
 */
public class A401753 extends Sequence1 {

  private static final int THREADS = Math.max(1, Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors()))));
  private static final ForkJoinPool POOL = new ForkJoinPool(THREADS);

  private static final int UNVISITED = 0;
  private static final int BLACK = 1;
  private static final int WHITE = 2;
  private static final int[] DX = {0, 1, 0, -1};
  private static final int[] DY = {-1, 0, 1, 0};

  private int mN = 0;
  private int mM = 0;

  private void search(final int[][] grid, final int x, final int y, int d, final int steps, final int[] max) {
    if (x < 0 || y < 0 || x >= mM || y >= mN) {
      if (steps > max[0]) {
        max[0] = steps;
      }
      return;
    }
    switch (grid[x][y]) {
      case UNVISITED:
        // We have not been in this cell before
        // Recurse with each of the two possible colors
        grid[x][y] = BLACK;
        search(grid, x, y, d, steps, max);
        grid[x][y] = WHITE;
        search(grid, x, y, d, steps, max);
        grid[x][y] = UNVISITED;
        break;
      case BLACK:
        d = ++d & 3;
        grid[x][y] = WHITE;
        search(grid, x + DX[d], y + DY[d], d, steps + 1, max);
        grid[x][y] = BLACK;
        break;
      case WHITE:
        d = --d & 3;
        grid[x][y] = BLACK;
        search(grid, x + DX[d], y + DY[d], d, steps + 1, max);
        grid[x][y] = WHITE;
        break;
      default:
        throw new RuntimeException(); // impossible
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }

    final List<Future<Integer>> futures = new ArrayList<>();
    for (int x = 0; 2 * x < mM; ++x) {
      final int fx = x;
      for (int y = 0; 2 * y < mN; ++y) {
        final int fy = y;
        futures.add(POOL.submit(() -> {
          final int[][] grid = new int[mM][mN];
          final int[] max = {0};
          for (int d = 0; d < 4; ++d) {
            search(grid, fx, fy, d, 0, max);
          }
          return max[0];
        }));
      }
    }

    int max = 0;
    try {
      for (final Future<Integer> future : futures) {
        max = Math.max(max, future.get());
      }
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (final ExecutionException e) {
      throw new RuntimeException(e.getCause());
    }
    return Z.valueOf(max);
  }
}
