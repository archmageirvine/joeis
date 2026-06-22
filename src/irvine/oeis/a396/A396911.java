package irvine.oeis.a396;

import java.util.HashMap;
import java.util.Map;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a131.A131988;
import irvine.util.Pair;

/**
 * A396911 allocated for Witold Tatkiewicz.
 * @author Sean A. Irvine
 */
public class A396911 extends Sequence0 {

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
    final CR sqrt = z.sqrt();
    final CR tz = THETA.multiply(z);
    return new Pair<>(tz.cos().multiply(sqrt), tz.sin().multiply(sqrt));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      // Empirical a(n) <= phi * n^2
      while (mM < CR.PHI.multiply(mN * mN).toZ().longValue()) {
        final Pair<CR, CR> pt = pt(mM);
        //System.out.println(mM + " " + pt);
        if (pt.left().signum() < 0) {
          mPoints.put(mM, pt);
        }
        ++mM;
      }
      CR dist = CR.TEN;
      long best = 0;
      for (final Map.Entry<Long, Pair<CR, CR>> e : mPoints.entrySet()) {
        final Pair<CR, CR> pt = e.getValue();
        final CR d = mX.subtract(pt.left()).square().add(mY.subtract(pt.right()).square());
        if (d.compareTo(dist) < 0) {
          dist = d;
          best = e.getKey();
        }
      }
      if (best == 0) {
        throw new RuntimeException();
      }
      final Pair<CR, CR> res = mPoints.remove(best);
      mX = res.left();
      mY = res.right();
      if (best < mK) {
        System.out.println("Bingo: reduction in point number, please report this");
      }
      mK = best;
    }
    return Z.valueOf(mK);
  }
}
