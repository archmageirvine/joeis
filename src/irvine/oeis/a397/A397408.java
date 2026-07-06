package irvine.oeis.a397;

import java.util.HashMap;
import java.util.Map;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a131.A131988;
import irvine.util.Pair;

/**
 * A397408 allocated for Witold Tatkiewicz.
 * @author Sean A. Irvine
 */
public class A397408 extends Sequence0 {

  // It appears that mK never decreases which means we could avoid storing all previous points
  // As an interim measure we discard anything with +ve x-coordinate

  private static final CR THETA = new A131988().getCR();
  private long mK = 0;
  private long mM = 1;
  private CR mX = CR.ZERO;
  private CR mY = CR.ZERO;
  private long mN = 0;
  private final Map<Long, Pair<CR, CR>> mPoints = new HashMap<>();

  private Pair<CR, CR> pt(final long k) {
    final CR z = CR.valueOf(k);
    final CR tz = THETA.multiply(z);
    return new Pair<>(tz.cos().multiply(z), tz.sin().multiply(z));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      while (mM < 3 * (mK + 1)) { // generous heuristic
        final Pair<CR, CR> pt = pt(mM);
        mPoints.put(mM, pt);
        ++mM;
      }
      CR dist = null;
      long best = -1;
      for (final Map.Entry<Long, Pair<CR, CR>> e : mPoints.entrySet()) {
        final Pair<CR, CR> pt = e.getValue();
        final CR d = mX.subtract(pt.left()).square().add(mY.subtract(pt.right()).square());
        if (dist == null || d.compareTo(dist) < 0) {
          dist = d;
          best = e.getKey();
        }
      }
      if (best < 0) {
        throw new RuntimeException();
      }
      final Pair<CR, CR> res = mPoints.remove(best);
      mX = res.left();
      mY = res.right();
      mK = best;
    }
    return Z.valueOf(mK);
  }
}
