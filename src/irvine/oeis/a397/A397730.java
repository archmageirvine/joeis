package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397730 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A397730 extends Sequence1 {

  // Conjectured g.f. z^2*(1+z^7-10*z^5-z^6+28*z^4+52*z^2+42*z^3+7*z)/(z^2+z+1)/(1-z)^7

  private static final int[] FORBIDDEN_X = {1, -1, -2, 2, 1, -1};
  private static final int[] FORBIDDEN_Y = {1, -1, 1, -1, -2, 2};

  private int mN = 0;

  private boolean forbidden(final int x0, final int y0, final int x1, final int y1) {
    for (int d = 0; d < FORBIDDEN_X.length; ++d) {
      if (x0 + FORBIDDEN_X[d] == x1 && y0 + FORBIDDEN_Y[d] == y1) {
        return true;
      }
    }
    return false;
  }

//  private long pack(final int x, final int y) {
//    return ((long) x << 32) + y;
//  }
//
//  private boolean isSymmetric(final int ax, final int ay, final int bx, final int by, final int cx, final int cy) {
//    final HashSet<Long> s = new HashSet<>();
//    s.add(pack(ax, ay));
//    s.add(pack(bx, by));
//    s.add(pack(cx, cy));
//    s.remove(pack(3 * mN - ax - ay, ax));
//    s.remove(pack(3 * mN - bx - by, bx));
//    s.remove(pack(3 * mN - cx - cy, cx));
//    return s.isEmpty();
//  }

  // Fater non-object rotational symmetry checking
  private boolean isSymmetric(final int ax, final int ay, final int bx, final int by, final int cx, final int cy) {
    final int rax = 3 * mN - ax - ay;
    final int ray = ax;
    final int rbx = 3 * mN - bx - by;
    final int rby = bx;
    final int rcx = 3 * mN - cx - cy;
    final int rcy = cx;

    return
      (rax == ax && ray == ay && rbx == bx && rby == by && rcx == cx && rcy == cy)
        || (rax == ax && ray == ay && rbx == cx && rby == cy && rcx == bx && rcy == by)
        || (rax == bx && ray == by && rbx == ax && rby == ay && rcx == cx && rcy == cy)
        || (rax == bx && ray == by && rbx == cx && rby == cy && rcx == ax && rcy == ay)
        || (rax == cx && ray == cy && rbx == ax && rby == ay && rcx == bx && rcy == by)
        || (rax == cx && ray == cy && rbx == bx && rby == by && rcx == ax && rcy == ay);
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
        if (forbidden(ax, ay, bx, by)) {
          continue;
        }
        for (int k = j + 1; k < xs.length; ++k) {
          final int cx = xs[k];
          final int cy = ys[k];
          if (forbidden(bx, by, cx, cy) || forbidden(ax, ay, cx, cy)) {
            continue;
          }
          cnt += isSymmetric(ax, ay, bx, by, cx, cy) ? 3 : 1;
        }
      }
    }
    assert cnt % 3 == 0;
    return Z.valueOf(cnt / 3);
  }
}

