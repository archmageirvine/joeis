package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A401821 Least m such that Sum_{k=1..m} sin(1/k) &gt; n (angles in radians).
 * @author Sean A. Irvine
 */
public class A401821 extends Sequence1 implements Conjectural {

  // Straight-forward exact implementation (not Conjectural), only good for a few terms
//  private long mN = 0;
//  private CR mSum = CR.ZERO;
//  private long mM = 0;
//
//  @Override
//  public Z next() {
//    final CR n = CR.valueOf(++mN);
//    while (mSum.compareTo(n) <= 0) {
//      mSum = mSum.add(CR.valueOf(++mM).inverse().sin());
//    }
//    return Z.valueOf(mM);
//  }

  // Fixed precision version (avoid iterative deepening of the sin calculations)
  private static final int PRECISION = -150;
  private long mN = 0;
  private Z mSum = Z.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    final Z n = CR.valueOf(++mN).getApprox(PRECISION);
    while (mSum.compareTo(n) <= 0) {
      mSum = mSum.add(CR.valueOf(++mM).inverse().sin().getApprox(PRECISION));
    }
    return Z.valueOf(mM);
  }
}
