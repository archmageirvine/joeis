package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;
import irvine.oeis.UnimplementedException;

/**
 * A sequence comprising the Gilbreath transform of another sequence.
 * @author Sean A. Irvine
 */
public class GilbreathTransformSequence extends AbstractSequence {

  private final Sequence mSeq;
  private final ArrayList<Z> mA = new ArrayList<>();

  /**
   * Creates a new transform.
   * @param offset sequence offset
   * @param seq underlying sequence
   */
  public GilbreathTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  @Override
  public Z next() {
    Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    for (int k = 0; k < mA.size(); ++k) {
      final Z d = mA.get(k).subtract(t).abs();
      mA.set(k, t);
      t = d;
    }
    mA.add(t);
    return t;
  }

  /**
   * Apply the transform to the sequence supplied on standard input.
   * @param args sequence number of <code>-</code> for standard input
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException, UnimplementedException {
    if ("-".equals(args[0])) {
      try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
        final GilbreathTransformSequence seq = new GilbreathTransformSequence(1, new ReaderSequence(r));
        Z a;
        while ((a = seq.next()) != null) {
          System.out.println(a);
        }
      }
    } else {
      final GilbreathTransformSequence seq = new GilbreathTransformSequence(1, SequenceFactory.sequence(args[0]));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
