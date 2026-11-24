package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A399689 allocated for Ben Adelstein.
 * @author Sean A. Irvine
 */
public class A399689 extends Sequence1 {

  private static final long[] DELTA_X = {1, 0, -1, 0, 1, 1, -1, -1};
  private static final long[] DELTA_Y = {0, 1, 0, -1, 1, -1, 1, -1};
  private final LongDynamicBooleanArray mForbidden = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] coords = ZUtils.ulamCoords(Z.valueOf(++mN));
      boolean safe = true;
      for (int k = 0; k < DELTA_X.length; ++k) {
        final long pt = ZUtils.ulamValue(coords[0].add(DELTA_X[k]), coords[1].add(DELTA_Y[k])).longValueExact();
        if (mForbidden.isSet(pt)) {
          safe = false;
          break;
        }
      }
      if (safe) {
        for (int k = 0; k < DELTA_X.length; ++k) {
          final long pt = ZUtils.ulamValue(coords[0].add(DELTA_X[k]), coords[1].add(DELTA_Y[k])).longValueExact();
          mForbidden.set(pt);
        }
        return Z.valueOf(mN);
      }
    }
  }
}
