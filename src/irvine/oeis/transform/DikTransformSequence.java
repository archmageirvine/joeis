package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A sequence comprising the bracelet, indistinct, unlabeled transform.
 * @author Sean A. Irvine
 */
public class DikTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mSeq;
  private final CycleTransformSequence mCycle;
  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = -1;

  private static final class MySequence extends Sequence0 {

    private final ArrayList<Z> mA;
    private MySequence(final ArrayList<Z> a) {
      mA = a;
    }
    @Override
    public Z next() {
      return mA.get(mA.size() - 1);
    }
  }

  /**
   * Creates a new bracelet, indistinct, unlabeled transform.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public DikTransformSequence(final int offset, final Sequence seq, final int skip) {
    super(offset);
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mCycle = new CycleTransformSequence(offset, new MySequence(mA), 0);
  }

  /**
   * Creates a new bracelet, indistinct, unlabeled transform.
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public DikTransformSequence(final Sequence seq, final int skip) {
    this(DEFOFF, seq, skip);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Z.ZERO);
      mCycle.next();
      return Z.ONE;
    }
    final Z y = mSeq.next();
    if (y == null) {
      return null;
    }
    mA.add(y);
    final Polynomial<Z> b0 = RING.create(mA);
    final Polynomial<Z> b2 = b0.substitutePower(2, mN);
    final Polynomial<Z> num = RING.add(RING.add(RING.multiply(b0, Z.TWO), RING.pow(b0, 2, mN)), b2);
    final Polynomial<Z> den = RING.multiply(RING.subtract(RING.one(), b2), Z.TWO);
    final Polynomial<Z> b = RING.add(RING.series(num, den, mN), RING.one());
    return b.coeff(mN).add(mCycle.next()).divide2();
  }
}
