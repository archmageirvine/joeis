package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396052 allocated for Paul Steendijk.
 * @author Sean A. Irvine
 */
public class A396052 extends Sequence1 {

  // After Paul Steendijk

  private long mN = -3;

  private static long spiralVal(final long x, final long y) {
    if (x == 0 && y == 0) {
      return 1;
    }
    if (-x < y && y <= x) {
      return 1 + 8 * x * x - 6 * x + 2 * y;
    }
    if (-y <= x && x < y) {
      return 1 + 8 * y * y - 2 * y - 2 * x;
    }
    if (x <= y && y < -x) {
      return 1 + 8 * x * x - 2 * x - 2 * y;
    }
    return 1 + 8 * y * y - 6 * y + 2 * x;
  }

  /*
   * Return coordinates [x,y] for spiral position k.
   */
  private static long[] spiralCoords(final long k) {
    if (k == 1) {
      return new long[] {0, 0};
    }

    final long i = (k + 1) / 2;
    long s = (Functions.SQRT.l(i - 1) + 1) / 2;
    if ((2 * s - 1) * (2 * s - 1) + 1 > i) {
      --s;
    }

    final long o = i - (2 * s - 1) * (2 * s - 1) - 1;

    if (o < 2 * s) {
      return new long[] {s, o - s + 1};
    }
    if (o < 4 * s) {
      return new long[] {3 * s - 1 - o, s};
    }
    if (o < 6 * s) {
      return new long[] {-s, 5 * s - 1 - o};
    }
    return new long[] {o - 7 * s + 1, -s};
  }

  private static boolean isIsland(final long k) {
    final long[] xy = spiralCoords(k);
    final long x = xy[0];
    final long y = xy[1];

    return Z.valueOf(spiralVal(x + 1, y)).isProbablePrime()
      && Z.valueOf(spiralVal(x - 1, y)).isProbablePrime()
      && Z.valueOf(spiralVal(x, y + 1)).isProbablePrime()
      && Z.valueOf(spiralVal(x, y - 1)).isProbablePrime();
  }

  @Override
  public Z next() {
    while (true) {
      mN += 6;
      if (!Z.valueOf(mN).isProbablePrime()
        && Z.valueOf(mN - 2).isProbablePrime()
        && Z.valueOf(mN + 2).isProbablePrime()
        && isIsland(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
