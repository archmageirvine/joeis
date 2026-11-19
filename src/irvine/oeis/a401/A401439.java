package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a057.A057273;

/**
 * A401439 Number of labeled strongly connected digraphs with n arcs.
 * @author Gregory Morse
 */
public class A401439 extends A057273 {
  {
    setOffset(0);
  }

  private static final Polynomial<Q> E = RING_Y.onePlusXToTheN(1);
  private int mArcs = -1;

  @Override
  public Z next() {
    if (++mArcs == 0) {
      return Z.ONE;
    }
    // At least one outgoing arc per vertex, except for the singleton.
    final Polynomial<Polynomial<Q>> table = strongD(mArcs, mArcs, E);
    Z sum = Z.ZERO;
    for (int k = 2; k <= mArcs; ++k) {
      sum = sum.add(table.coeff(k).coeff(mArcs).multiply(Functions.FACTORIAL.z(k)).toZ());
    }
    return sum;
  }
}
