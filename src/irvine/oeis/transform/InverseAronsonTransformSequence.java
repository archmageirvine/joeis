package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the inverse Aronson transform of another sequence.
 * @author Sean A. Irvine
 */
public class InverseAronsonTransformSequence extends AbstractSequence {

  private final Sequence mSeq;
  private final Set<Z> mSet = new HashSet<>();
  private final LinkedList<Z> mList = new LinkedList<>();
  private Z mMax = Z.ZERO;
  private long mN;

  /**
   * Creates a new inverse Aronson sequence of the given sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public InverseAronsonTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mN = offset - 1;
  }

  @Override
  public Z next() {
    while (mList.isEmpty()) {
      ++mN;
      final Z an = mSeq.next();
      mSet.add(an);
      if (mSet.contains(Z.valueOf(mN))) {
        mList.add(an);
      } else if (!mMax.equals(Z.valueOf(mN - 1))) {
        for (Z t = mMax.add(1); t.compareTo(an) < 0; t = t.add(1)) {
          mList.add(t);
        }
      }
      mMax = an;
    }
    return mList.pollFirst();
  }

  /**
   * Apply the inverse Aronson transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new InverseAronsonTransformSequence(1, new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
