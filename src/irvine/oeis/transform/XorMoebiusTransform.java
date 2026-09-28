package irvine.oeis.transform;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A sequence comprising the XOR-Moebius transform of another sequence (as defined in A295901.
 * @author Georg Fischer
 */
public class XorMoebiusTransform extends AbstractSequence implements DirectSequence {

  private long mN;
  private final DirectSequence mSeq;

  /**
   * Creates a new XOR-Moebius transform sequence of the given sequence.
   * @param offset first index
   * @param seq underlying sequence
   */
  public XorMoebiusTransform(final int offset, final DirectSequence seq) {
    super(offset);
    mSeq = seq;
    mN = offset - 1;
  }

  /**
   * Compute the XOR-Moebius transform of the underlying sequence.
   * @param n the integer to be transformed
   * @return <code>SumXOR_{d divides n and n/d is squarefree} d^2</code>
   */
  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (Predicates.SQUARE_FREE.is(n.divide(dd))) {
        sum = sum.xor(mSeq.a(dd));
      }
    }
    return sum;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
