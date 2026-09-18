package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399147 allocated for Eddie Lin Rui.
 * @author Sean A. Irvine
 */
public class A399147 extends Sequence0 {

  // After Eddie Lin Rui

  /**
   * A line a*x + b*y = c.
   */
  private static final class Line {
    private final CR mA;
    private final CR mB;
    private final CR mC;

    private Line(final CR a, final CR b, final CR c) {
      mA = a;
      mB = b;
      mC = c;
    }
  }

  /**
   * Cached side equations.
   */
  private final Map<Long, Line> mLines = new HashMap<>();

  /**
   * Current polygon size.
   */
  private int mN = 2;

  /**
   * Accumulated number of crossings.
   */
  private Z mTotal = Z.ZERO;

  /**
   * Return the key for a pair (n,j).
   */
  private static long key(final int n, final int j) {
    return ((long) n << 32) | (j & 0xffffffffL);
  }

  /**
   * Equation of side j of P_n.
   *
   * The equation is
   *
   *   a*x + b*y = c
   *
   * where
   *
   *   a = cos(pi*(2*j+2)/n)
   *   b = sin(pi*(2*j+2)/n)
   *   c = cos(pi/n).
   */
  private Line line(final int n, final int j) {
    final long key = key(n, j);
    Line line = mLines.get(key);
    if (line == null) {
      final CR angle = CR.PI.multiply(2L * (j + 1)).divide(n);
      final CR a = angle.cos();
      final CR b = angle.sin();
      final CR c = CR.PI.divide(n).cos();
      line = new Line(a, b, c);
      mLines.put(key, line);
    }
    return line;
  }

  /**
   * Invoke the integer part of crossing_sides(k,j).
   *
   * For side j of P_k, find every earlier polygon P_m having a vertex
   * strictly inside the angular arc belonging to this side.  The two
   * sides incident with that vertex are precisely the two sides crossing
   * the new side.
   *
   * @param k polygon size
   * @param j side number
   * @param result destination for pairs (m,i)
   */
  private static void crossingSides(final int k, final int j, final List<long[]> result) {
    for (int m = 3; m < k; ++m) {
      final int h = Math.floorDiv(m * (2 * j + 1) - k, 2 * k) + 1;
      if ((long) k * (2L * h + 1) >= (long) m * (2L * j + 3)) {
        continue;
      }
      result.add(new long[] {m, Math.floorMod(h - 1, m)});
      result.add(new long[] {m, Math.floorMod(h, m)});
    }
  }

  private static int compare(final CR x, final CR y, final int bits) {
    return x.compareTo(y, -bits);
  }

  /**
   * Count the crossings on one side.
   * @return crossing count, or -1 if the comparison could not be certified
   */
  private int sideCount(final int k, final int j) {
    final Line g = line(k, j);
    final List<CR> positions = new ArrayList<>();
    final List<long[]> crossings = new ArrayList<>();
    crossingSides(k, j, crossings);

    for (final long[] crossing : crossings) {
      final int m = (int) crossing[0];
      final int i = (int) crossing[1];
      final Line q = line(m, i);
      /*
       * Intersection with the new side.
       * Parameterization:
       *   (x,y) = (r*g - t*q, r*q + t*g)
       * where r=c and (g,q) are the cosine/sine coefficients of the new side.
       */
      final CR den = q.mB.multiply(g.mA).subtract(q.mA.multiply(g.mB));
      /*
       * If den is zero, the lines are parallel.  Such a case cannot
       * represent a crossing.  Use the same finite-precision
       * certification strategy as the Python implementation.
       */
      boolean denominatorResolved = false;
      for (final int bits : new int[] {128, 256, 512, 1024}) {
        if (compare(den, CR.ZERO, bits) != 0) {
          denominatorResolved = true;
          break;
        }
      }
      if (!denominatorResolved) {
        return -1;
      }

      final CR t = q.mC.subtract(g.mC.multiply(q.mA.multiply(g.mA).add(q.mB.multiply(g.mB)))).divide(den);
      positions.add(t);
    }

    positions.sort(Comparator.comparingDouble(CR::doubleValue));

    /*
     * Every consecutive pair must be strictly separated.
     * If a comparison remains unresolved at 1024 bits, abandon this
     * side just as the Python version does.
     */
    for (int i = 1; i < positions.size(); ++i) {
      boolean separated = false;
      for (final int bits : new int[] {128, 256, 512, 1024}) {
        final int cmp = compare(positions.get(i - 1), positions.get(i), bits);
        if (cmp < 0) {
          separated = true;
          break;
        }
        if (cmp > 0) {
          // The double ordering was wrong; this side is not certified.
          return -1;
        }
      }
      if (!separated) {
        return -1;
      }
    }

    return positions.size();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 3) {
      return Z.ZERO;
    }

    Z increment = Z.ZERO;
    for (int j = 0; j < mN; ++j) {
      final int count = sideCount(mN, j);
      if (count < 0) {
        throw new ArithmeticException("Unresolved crossings on side (" + mN + "," + j + ")");
      }
      increment = increment.add(count);
    }

    mTotal = mTotal.add(increment);
    return mTotal;
  }
}

