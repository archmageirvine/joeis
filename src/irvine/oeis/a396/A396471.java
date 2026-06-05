package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396471 Irregular triangle read by rows: row n lists the coefficients of Product_{k=0..n-1} (1 + x^Fibonacci(k+2)).
 * @author Sean A. Irvine
 */
public class A396471 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mRow = RING.one();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mN > 1) {
        mRow = RING.multiply(mRow, RING.onePlusXToTheN(Functions.FIBONACCI.i(mN)));
      }
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
