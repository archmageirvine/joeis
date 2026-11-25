package irvine.oeis.a402;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402374 allocated for Patryk Majda.
 * @author Sean A. Irvine
 */
public class A402374 extends Sequence1 {

  private static final DefaultMatrix<Z> M = new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.ONE}, {Z.ONE, Z.ZERO}}, Z.ZERO);
  private long mLim = 1;
  private long mM = 1;
  private long mCount = 0;

  private boolean is(final long m) {
    if (m < 2 || Functions.GCD.l(m, 10) > 1 || Predicates.PRIME.is(m)) {
      return false;
    }
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(m));
    final Matrix<Z> mat = ring.pow(M, m);
    final long k = Functions.KRONECKER.l(5, m);
    return (k == 1 && mat.get(1, 1).isZero() && mat.get(0, 1).isOne())
      || (k != 1 && mat.get(1, 1).isOne() && mat.get(0, 1).equals(Z.valueOf(m - 1)));
  }

  @Override
  public Z next() {
    mLim *= 10;
    while (mM < mLim) {
      if (is(mM)) {
        ++mCount;
      }
      ++mM;
    }
    return Z.valueOf(mCount);
  }
}
