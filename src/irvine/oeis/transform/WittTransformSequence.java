package irvine.oeis.transform;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the Witt transform of another sequence.
 * @author Sean A. Irvine
 */
public class WittTransformSequence implements Sequence {

  private final Sequence mSeq;
  protected final ArrayList<Z> mTerms = new ArrayList<>();
  {
    mTerms.add(null);
  }
  private int mN = -1;

  /**
   * Creates a new Witt transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public WittTransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  /**
   * Creates a new Witt transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   */
  public WittTransformSequence(final Sequence seq) {
    this(seq, 0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mTerms.add(mSeq.next());
    final ArrayList<Z> a = new ArrayList<>(mTerms);
    final Z[] c = new Z[a.size()];
    Arrays.fill(c, Z.ZERO);
    for (int i = 1; i <= a.size() / 2; ++i) {
      for (int j = i; j < a.size(); j += i) {
        c[j] = Z.ZERO;
      }
      Z v = a.get(i);
      int k = 1;
      for (int j = i; j < a.size(); j += i) {
        c[j] = c[j].add(v);
        if (k > 1) {
          a.set(j, a.get(j).subtract(c[j].divide(k)));
        }
        for (int m = j + j; m < a.size(); m += j) {
          c[m] = c[m].subtract(c[j]);
        }
        ++k;
        v = v.multiply(a.get(i));
      }
    }
    //System.out.println(mTerms + " -> " + Arrays.toString(c));
    return a.get(a.size() - 1);
  }
}
