package irvine.oeis.a400;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a295.A295193;

/**
 * A400715 Number of 9-regular labeled graphs on 2n nodes.
 * @author Sean A. Irvine
 */
public class A400715 extends A295193 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN < 10) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Map<Polynomial<Z>, Z> m = graphsByDegreeSeq(mN, 9, (p, r) -> 9 - p.leastNonzeroIndex() <= r);
    return Functions.SUM.z(m.values());
  }
}
