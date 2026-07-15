package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397215 a(n) is the number of distinct triplets of triangles chosen from n^2 unit triangles of a triangular grid with their centers collinear up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A397215 extends Sequence1 {

  private int mN = 0;

  private static boolean isCollinear(final int ax, final int ay, final int bx, final int by, final int cx, final int cy) {
    return (long) (ay - by) * (bx - cx) == (long) (ax - bx) * (by - cy);
  }

  // (x,y) <---> (y,x) is one reflection axis
  private boolean isReflectionFixed(final int ax, final int ay, final int bx, final int by, final int cx, final int cy) {
    if (ax == ay && bx == by && cx == cy) {
      return true;
    }
    if (ax == ay && bx == cy && by == cx) {
      return true;
    }
    if (bx == by && ax == cy && ay == cx) {
      return true;
    }
    if (cx == cy && ax == by && ay == bx) {
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;

    final int[] xs = new int[mN * mN];
    final int[] ys = new int[mN * mN];
    int p = 0;
    for (int a = 0; a < mN; ++a) {
      for (int b = 0; b < mN - a; ++b) {
        xs[p] = 3 * a + 1;
        ys[p] = 3 * b + 1;
        ++p;
      }
    }
    for (int a = 0; a < mN - 1; ++a) {
      for (int b = 0; b < mN - 1 - a; ++b) {
        xs[p] = 3 * a + 2;
        ys[p] = 3 * b + 2;
        ++p;
      }
    }

    long cnt = 0;
    for (int i = 0; i < xs.length; ++i) {
      final int ax = xs[i];
      final int ay = ys[i];
      for (int j = i + 1; j < xs.length; ++j) {
        final int bx = xs[j];
        final int by = ys[j];
        for (int k = j + 1; k < xs.length; ++k) {
          final int cx = xs[k];
          final int cy = ys[k];
          if (isCollinear(ax, ay, bx, by, cx, cy)) {
            ++cnt;
            if (isReflectionFixed(ax, ay, bx, by, cx, cy)) {
              cnt += 3;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt / 6);
  }
}
