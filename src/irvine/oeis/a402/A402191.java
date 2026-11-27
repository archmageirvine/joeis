package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A402191 Number of distinct hyperplanes through the center of the (n-1)-dimensional permutohedron that are spanned by its ridges (faces of codimension 2).
 * @author Sean A. Irvine
 */
public class A402191 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long a = 1; 2 * a < mN; ++a) {
      for (long b = 1; 2 * a + b < mN; ++b) {
        final long c = mN - a - b;
        sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(a)).divide(Functions.FACTORIAL.z(b)).divide(Functions.FACTORIAL.z(c)));
      }
    }
    return sum.add(Z.ONE.shiftLeft(mN - ((mN & 1) == 1 ? 1 : 2))).subtract(1);
  }
}
