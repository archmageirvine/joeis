package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402396 allocated for Pietro Tiaraju Giavarina dos Santos.
 * @author Sean A. Irvine
 */
public class A402396 extends Sequence0 {

  private static final int[][][] SOMA = {
    {{0, 0, 0}, {1, 0, 0}, {0, 1, 0}},
    {{0, 0, 0}, {1, 0, 0}, {2, 0, 0}, {0, 1, 0}},
    {{0, 0, 0}, {1, 0, 0}, {2, 0, 0}, {1, 1, 0}},
    {{0, 0, 0}, {1, 0, 0}, {1, 1, 0}, {2, 1, 0}},
    {{0, 0, 0}, {1, 0, 0}, {0, 1, 0}, {1, 0, 1}},
    {{0, 0, 0}, {1, 0, 0}, {0, 1, 0}, {0, 1, 1}},
    {{0, 0, 0}, {1, 0, 0}, {0, 1, 0}, {0, 0, 1}}
  };
  private static final int[][] PERMUTATIONS = {
    {0, 1, 2}, {0, 2, 1},
    {1, 0, 2}, {1, 2, 0},
    {2, 0, 1}, {2, 1, 0}
  };

  /*
   * Each placement mask uses bit dx + 3*dy + 9*dz.
   * The occupancy mask is shifted right one bit after each cell.
   */
  private final List<Integer>[] mMoves;

  // DP state: occupancy mask -> number of partial tilings.
  private Map<Integer, Z> mDp = new HashMap<>();

  private int mN = -1;

  /** Construct the sequence. */
  @SuppressWarnings("unchecked")
  public A402396() {
    mMoves = new List[9];
    for (int i = 0; i < 9; ++i) {
      mMoves[i] = new ArrayList<>();
    }

    final Map<String, int[][]> shapes = new HashMap<>();
    // Generate all signed coordinate permutations.
    for (final int[] p : PERMUTATIONS) {
      for (int signs = 0; signs < 8; ++signs) {
        for (final int[][] piece : SOMA) {
          final int[][] image = new int[piece.length][3];

          for (int j = 0; j < piece.length; ++j) {
            for (int i = 0; i < 3; ++i) {
              final int sign = (signs & (1 << i)) == 0 ? 1 : -1;
              image[j][i] = sign * piece[j][p[i]];
            }
          }

          Arrays.sort(image, Comparator
            .comparingInt((int[] c) -> c[2])
            .thenComparingInt(c -> c[1])
            .thenComparingInt(c -> c[0]));

          final int[][] shape = new int[image.length][3];
          for (int j = 0; j < image.length; ++j) {
            for (int i = 0; i < 3; ++i) {
              shape[j][i] = image[j][i] - image[0][i];
            }
          }
          shapes.put(Arrays.deepToString(shape), shape);
        }
      }
    }

    // Build the legal placements for each cell of a 3 x 3 layer.
    for (int y = 0; y < 3; ++y) {
      for (int x = 0; x < 3; ++x) {
        final int cell = x + 3 * y;
        for (final int[][] shape : shapes.values()) {
          boolean fits = true;
          int mask = 0;
          for (final int[] c : shape) {
            final int dx = c[0];
            final int dy = c[1];
            final int dz = c[2];
            if (x + dx < 0 || x + dx >= 3 || y + dy < 0 || y + dy >= 3) {
              fits = false;
              break;
            }
            mask |= 1 << (dx + 3 * dy + 9 * dz);
          }
          if (fits) {
            mMoves[cell].add(mask);
          }
        }
      }
    }
    mDp.put(0, Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }

    // Process the next 3 x 3 layer.
    for (int cell = 0; cell < 9; ++cell) {
      final Map<Integer, Z> next = new HashMap<>();
      for (final Map.Entry<Integer, Z> entry : mDp.entrySet()) {
        final int mask = entry.getKey();
        final Z count = entry.getValue();
        if ((mask & 1) != 0) {
          // This cell is already occupied.
          next.merge(mask >> 1, count, Z::add);
        } else {
          // Place a piece covering this cell.
          for (final int piece : mMoves[cell]) {
            if ((piece & mask) == 0) {
              next.merge((mask | piece) >> 1, count, Z::add);
            }
          }
        }
      }
      mDp = next;
    }
    // After processing the layer, mask 0 means the box is fully tiled.
    return mDp.getOrDefault(0, Z.ZERO);
  }
}
