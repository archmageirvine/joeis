package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the logarithmic (inverse exponential) transform of another sequence.
 * This is useful for going from labelled unconnected graphs to connected cases.
 * @author Sean A. Irvine
 */
public class LogarithmicTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Sequence mSeq;
  protected final ArrayList<Q> mTerms = new ArrayList<>();
  private Z mF = Z.ONE;
  private int mN = 0;

  /**
   * Creates a new transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public LogarithmicTransformSequence(final Sequence seq, final int skip) {
    super(DEFOFF);
    mSeq = seq;
    mTerms.add(Q.ZERO);
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mTerms.add(new Q(mSeq.next(), mF));
    final Polynomial<Q> log = RING.log1p(RING.create(mTerms), mN);
    return log.coeff(mN).multiply(mF).toZ();
  }

  /**
   * Apply the transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final LogarithmicTransformSequence seq = new LogarithmicTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
