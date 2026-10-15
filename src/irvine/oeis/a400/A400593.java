package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A400593 Squares visited by a chess king moving on the square spiral, always moving to an adjacent unvisited square whose number has the greatest prime factor; ties are resolved by choosing the lowest number.
 * @author Sean A. Irvine
 */
public class A400593 extends Sequence1 {

  private static final int[] DELTA_Y = {-1, -1, -1, 0, 0, 1, 1, 1};
  private static final int[] DELTA_X = {-1, 0, 1, -1, 1, -1, 0, 1};
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
      return Z.ONE;
    }
    final Z[] xy = ZUtils.ulamCoords(mA);
    final Z x = xy[0];
    final Z y = xy[1];
    Z gpf = Z.ZERO;
    mA = null;
    for (int k = 0; k < DELTA_X.length; ++k) {
      final Z t = ZUtils.ulamValue(x.add(DELTA_X[k]), y.add(DELTA_Y[k]));
      if (!mSeen.contains(t)) {
        final Z g = Functions.GPF.z(t);
        if (g.compareTo(gpf) > 0 || (g.equals(gpf) && t.compareTo(mA) < 0)) {
          gpf = g;
          mA = t;
        }
      }
    }
    mSeen.add(mA);
    return mA;
  }
}
