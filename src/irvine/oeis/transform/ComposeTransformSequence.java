package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Composition of sequences (COMPOSE transform).
 * @author Sean A. Irvine
 */
public class ComposeTransformSequence extends AbstractSequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private final Polynomial<Z> mTermsA;
  private final ArrayList<Z> mTermsB;

  /**
   * Self-convolution of a sequence.
   * @param offset offset for sequence
   * @param seq sequence to convolve
   */
  public ComposeTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeqA = seq;
    mSeqB = null;
    mTermsA = new Polynomial<>("x", Z.ZERO, Z.ONE);
    mTermsB = mTermsA;
  }

  /**
   * Convolution of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public ComposeTransformSequence(final int offset, final Sequence a, final Sequence b) {
    super(offset);
    mSeqA = a;
    mSeqB = b;
    mTermsA = new Polynomial<>("x", Z.ZERO, Z.ONE);
    mTermsB = new ArrayList<>();
  }

  @Override
  public Z next() {
    mTermsA.add(mSeqA.next());
    if (mSeqB != null) {
      mTermsB.add(mSeqB.next());
    }
    Z s = Z.ZERO;
    final int n = mTermsA.degree();
    for (int k = 0; k <= n; ++k) {
      s = s.add(RING.pow(mTermsA, k, n + 1).coeff(n).multiply(mTermsB.get(k)));
    }
    return s;
  }
}
