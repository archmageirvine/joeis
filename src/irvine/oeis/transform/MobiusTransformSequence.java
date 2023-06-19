package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the Mobius transform of another sequence.
 * @author Sean A. Irvine
 */
public class MobiusTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final MemorySequence mSeq;
  private final int mOffset;
  private final Z mInitialTerm;
  private int mN = -1;

  /**
   * Get the next term from the Mobius transform of the given sequence.
   * @param seq sequence of terms
   * @return transform value
   */
  public static Z mobiusTransform(final List<Z> seq) {
    final int n = seq.size() - 1;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      final int m = Mobius.mobius(n / d);
      if (m != 0) {
        sum = sum.signedAdd(m == 1, seq.get(d));
      }
    }
    return sum;
  }

  /**
   * Creates a new Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param offset first index
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public MobiusTransformSequence(final int offset, final Sequence seq, final int skip, final Z initialTerm) {
    super(offset);
    mSeq = MemorySequence.cachedSequence(seq);
    mOffset = skip - 1;
    mInitialTerm = initialTerm;
  }

  /**
   * Creates a new Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public MobiusTransformSequence(final Sequence seq, final int skip, final Z initialTerm) {
    this(DEFOFF, seq, skip, initialTerm);
  }

  /**
   * Creates a new Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param offset first index
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public MobiusTransformSequence(final int offset, final Sequence seq, final int skip) {
    this(offset, seq, skip, Z.ZERO);
  }

  /**
   * Creates a new Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public MobiusTransformSequence(final Sequence seq, final int skip) {
    this(DEFOFF, seq, skip, Z.ZERO);
  }

  private Z mobiusTransform(final int n) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      final int m = Mobius.mobius(n / d);
      if (m != 0) {
        final Z t = mSeq.a(mOffset + d);
        if (t == null) {
          return null; // Handle finite sequences
        }
        sum = sum.signedAdd(m == 1, t);
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return ++mN == 0 ? mInitialTerm : mobiusTransform(mN);
  }

  /**
   * Apply the Mobius transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new MobiusTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
