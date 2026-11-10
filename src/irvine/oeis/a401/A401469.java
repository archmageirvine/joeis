package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A401469 Number of subsets S of {1, 2, ..., n} such that no two elements in S sum to a square-free hypotenuse leg pair, or equivalent subset restriction defined by Pythagorean triples.
 * @author Sean A. Irvine
 */
public class A401469 extends Sequence0 {

  // After Yinon Werner

  private int mN = -1;

  private static final class Triple {
    private final int mX;
    private final int mY;
    private final int mZ;

    private Triple(final int x, final int y, final int z) {
      mX = x;
      mY = y;
      mZ = z;
    }
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }

    // Find all Pythagorean triples x < y < z <= n
    final List<Triple> tList = new ArrayList<>();
    for (int x = 1; x <= mN; ++x) {
      final long x2 = (long) x * x;
      for (int y = x + 1; y <= mN; ++y) {
        final long sum = x2 + (long) y * y;
        final int z = Functions.SQRT.i(sum);
        if ((long) z * z == sum && z <= mN) {
          tList.add(new Triple(x, y, z));
        }
      }
    }

    // Determine the last (largest) z for each number v
    final Map<Integer, Integer> last = new HashMap<>();
    for (final Triple t : tList) {
      last.put(t.mX, Math.max(last.getOrDefault(t.mX, 0), t.mZ));
      last.put(t.mY, Math.max(last.getOrDefault(t.mY, 0), t.mZ));
      last.put(t.mZ, Math.max(last.getOrDefault(t.mZ, 0), t.mZ));
    }

    // Map hypotenuse z to its legs (x, y)
    final Map<Integer, List<Point>> pairs = new HashMap<>();
    for (final Triple t : tList) {
      pairs.computeIfAbsent(t.mZ, k -> new ArrayList<>()).add(new Point(t.mX, t.mY));
    }

    // Dynamic programming over state masks
    Map<Long, Z> states = new HashMap<>();
    states.put(0L, Z.ONE);

    for (int z = 1; z <= mN; ++z) {
      final Map<Long, Z> newStates = new HashMap<>();
      final List<Point> zPoints = pairs.get(z);

      for (final Map.Entry<Long, Z> entry : states.entrySet()) {
        final long m = entry.getKey();
        final Z c = entry.getValue();
        // z is not chosen
        newStates.merge(m, c, Z::add);
        // z is chosen (check if any pair {x, y} already exists in mask m)
        boolean valid = true;
        if (zPoints != null) {
          for (final Point p : zPoints) {
            if (((m >> p.left()) & 1L) == 1L && ((m >> p.right()) & 1L) == 1L) {
              valid = false;
              break;
            }
          }
        }
        if (valid) {
          final long m2 = m | (1L << z);
          newStates.merge(m2, c, Z::add);
        }
      }

      // Forget values of v that are no longer referenced by future triples
      states = new HashMap<>();
      for (final Map.Entry<Long, Z> entry : newStates.entrySet()) {
        long m = entry.getKey();
        final Z c = entry.getValue();
        for (int v = 1; v <= z; ++v) {
          if (((m >> v) & 1L) == 1L && last.getOrDefault(v, 0) <= z) {
            m &= ~(1L << v);
          }
        }
        states.merge(m, c, Z::add);
      }
    }

    Z sum = Z.ZERO;
    for (final Z count : states.values()) {
      sum = sum.add(count);
    }
    return sum;
  }
}
