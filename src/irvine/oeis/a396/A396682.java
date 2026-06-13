package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396682 a(n) is twice the area of the convex hull of the cumulative prime-exponent coordinates of integers from 1 to n + 1.
 * @author Sean A. Irvine
 */
public class A396682 extends Sequence0 {

  private long mN = 0;
  private final List<A396647.Point> mPoints = new ArrayList<>();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      mPoints.add(new A396647.Point(p.longValue(), fs.getExponent(p)));
    }
    if (mN < 3) {
      return Z.ZERO;
    }
    return Z.valueOf(A396647.twiceArea(A396647.convexHull(mPoints)));
  }
}
