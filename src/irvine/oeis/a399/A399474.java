package irvine.oeis.a399;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a295.A295193;

/**
 * A399474 Number of labeled 8-regular graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A399474 extends A295193 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 9) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Map<Polynomial<Z>, Z> m = graphsByDegreeSeq(mN, 8, (p, r) -> 8 - p.leastNonzeroIndex() <= r);
    return Functions.SUM.z(m.values());
  }
}
