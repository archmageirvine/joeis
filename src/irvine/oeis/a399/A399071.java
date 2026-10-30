package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399071 Smallest positive integers k that minimize the Euclidean distance from point P_i to P_(i+k), where P_i = (i*cos(i), i*sin(i)), for integers i &gt;= 1, after removing consecutive duplicates.
 * @author Sean A. Irvine
 */
public class A399071 extends Sequence1 {

  // After Eddie Lin Rui

  private static final CR COS1 = CR.ONE.cos();

  private static final class Record {
    private final Z mStride;
    private final Z mStart;

    private Record(final Z stride, final Z start) {
      mStride = stride;
      mStart = start;
    }
  }

  private final Map<Z, CR> mAngular = new HashMap<>();
  private final List<Record> mHull = new ArrayList<>();
  private CR mX = CR.TAU;
  private Z mP0 = Z.ZERO;
  private Z mP1 = Z.ONE;
  private int mN = 0;
  private boolean mInitialized = false;

  private CR angular(final Z q) {
    return mAngular.computeIfAbsent(q, v -> {
      final CR half = CR.valueOf(v).multiply(CR.HALF);
      final CR s = half.sin();
      return s.multiply(s).multiply(CR.TWO);
    });
  }

  /**
   * Squared distance, with the common term k^2 removed.
   * The omitted term does not affect comparisons between strides.
   */
  private CR distance(final Z k, final Z q) {
    final CR kc = CR.valueOf(k);
    final CR qc = CR.valueOf(q);
    return qc.multiply(qc).add(kc.multiply(kc.add(qc)).multiply(angular(q)).multiply(CR.TWO));
  }

  /**
   * First integer k at which stride q beats stride p.
   */
  private Z crossing(final Z p, final Z q) {
    Z lo = Z.ZERO;
    Z hi = Z.ONE;
    while (distance(hi, q).subtract(distance(hi, p)).signum() > 0) {
      hi = hi.multiply(Z.TWO);
    }
    while (hi.subtract(lo).compareTo(Z.ONE) > 0) {
      final Z mid = lo.add(hi).divide(Z.TWO);
      if (distance(mid, q).subtract(distance(mid, p)).signum() < 0) {
        hi = mid;
      } else {
        lo = mid;
      }
    }
    return hi;
  }

  private void extend() {
    final Z a = mX.floor();
    final Z p = a.multiply(mP1).add(mP0);
    mP0 = mP1;
    mP1 = p;
    angular(p);
    Z start = Z.ONE;
    while (!mHull.isEmpty()) {
      final Record last = mHull.get(mHull.size() - 1);
      start = crossing(last.mStride, p);
      if (start.compareTo(last.mStart) > 0) {
        break;
      }
      mHull.remove(mHull.size() - 1);
    }

    mHull.add(new Record(p, start));

    mX = mX.subtract(CR.valueOf(a)).inverse();
  }

  private void initialize() {
    if (mInitialized) {
      return;
    }
    mInitialized = true;
    mAngular.put(Z.ONE, CR.ONE.subtract(COS1));
    mHull.add(new Record(Z.ONE, Z.ONE));
  }

  @Override
  public Z next() {
    initialize();
    while (mHull.size() <= mN) {
      extend();
    }
    // The hull contains the winning stride and its first integer k.
    // Continue generating records until the stopping bound proves
    // that the requested onset has been reached.
    while (true) {
      while (mHull.size() <= mN) {
        extend();
      }
      final Record target = mHull.get(mN);
      final Z q = mP1;
      if (CR.valueOf(q.multiply(q)).subtract(
        distance(target.mStart, target.mStride)).signum() > 0) {
        ++mN;
        return target.mStride;
      }
      extend();
    }
  }
}
