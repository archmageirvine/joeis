package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;

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
   */
  public static void main(final String[] args) {
    SequenceFactory.generate(GilbreathTransformSequence.class, args[0]);
  }
}
