package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A sequence comprising the Stirling numbers of the first kind transform of
 * another sequence.
 * @author Sean A. Irvine
 */
public class Stirling1TransformSequence extends Sequence1 {

  /**
   * Apply the Stirling numbers of the first kind transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @param n term limit
   * @return the next term in the transformed sequence
   */
  public static Z stirling1(final List<Z> seq, final int n) {
    return Integers.SINGLETON.sum(1, n, k -> Stirling.firstKind(n, k).multiply(seq.get(k)));
  }

  /**
   * Apply the Stirling numbers of the first kind transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @return the next term in the transformed sequence
   */
  public static Z stirling1(final List<Z> seq) {
    return stirling1(seq, seq.size() - 1);
  }

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();

  /**
   * Creates a new Stirling transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip (or insert)
   */
  public Stirling1TransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = skip; k < 0; ++k) {
      mTerms.add(Z.ZERO);
    }
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  @Override
  public Z next() {
    final Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    mTerms.add(t);
    return stirling1(mTerms);
  }

  /**
   * Apply the Stirling transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Stirling1TransformSequence seq = new Stirling1TransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
