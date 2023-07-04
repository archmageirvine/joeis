package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the inverse binomial transform of another sequence.
 * @author Sean A. Irvine
 */
public class InverseBinomialTransformSequence extends AbstractSequence {

  private final static int DEFOFF = 0;
  private final Sequence mSeq;
  protected final ArrayList<Z> mTerms = new ArrayList<>();

  /**
   * Apply the binomial transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @param n number of terms to consider
   * @return the next term in the transformed sequence
   */
  public static Z inverseBinomial(final List<Z> seq, final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      final Z t = Binomial.binomial(n - 1, k).multiply(seq.get(k));
      sum = sum.signedAdd(((n - 1 - k) & 1) == 0, t);
    }
    return sum;
  }

  /**
   * Creates a new inverse binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public InverseBinomialTransformSequence(final Sequence seq, final int skip) {
    this(DEFOFF, seq, skip);
  }

  /**
   * Creates a new inverse binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public InverseBinomialTransformSequence(final int offset, final Sequence seq, final int skip) {
    super(offset);
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  @Override
  public Z next() {
    mTerms.add(mSeq.next());
    return inverseBinomial(mTerms, mTerms.size());
  }

  /**
   * Apply the inverse binomial transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new InverseBinomialTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
