package irvine.oeis.transform;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Exponential reversion of another sequence.
 * @author Sean A. Irvine
 */
public class ExponentialRevertTransformSequence implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mPoly = RING.empty();
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private final Sequence mSeq;

  {
    mPoly.add(Q.ZERO);
  }

  protected ExponentialRevertTransformSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    mPoly.add(new Q(mSeq.next(), mF.factorial(++mN)));
    return RING.reversion(mPoly, mN).coeff(mN).multiply(mF.factorial(mN)).toZ();
  }
}
