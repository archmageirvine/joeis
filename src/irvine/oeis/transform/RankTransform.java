package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * This class computes the rank transform of a sequence a(n) as described by Clark Kimberling in A187224.
 * <pre>
 * (1)  initial values: r(1)=1, h(1)=a(1);
 * (2)  counting function: h(n)= # r(i) in the half-open interval [a(n-1),a(n));
 * (3)  recurrence:  r(n)=r(n-1)+h(n)+1.
 * </pre>
 * @author Georg Fischer
 */
public class RankTransform extends AbstractSequence {

  private static final int DEFOFF = 1;

  private final Sequence mSeqA; // underlying sequence
  private Z mA; // a(n)
  private int mN; // current index n
  private final ArrayList<Z> mR; // current rank

  /**
   * Construct an instance from two sequences f and g.
   * @param seq underlying sequence
   */
  public RankTransform(final Sequence seq) {
    this(DEFOFF, seq);
  }

  /**
   * Construct an instance from two sequences f and g.
   * @param offset first index
   * @param seq underlying sequence
   */
  public RankTransform(final int offset, final Sequence seq) {
    super(offset);
    mN = 0;
    mSeqA = seq;
    mR = new ArrayList<>(128);
    mR.add(Z.ZERO); // [0] is not used
    mR.add(Z.ONE);
    mA = mSeqA.next();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return mR.get(mN);
    }
    // a(n-1)
    final Z a1 = mA;
    mA = mSeqA.next();
    long h = 0;
    for (int i = 1; i < mN; ++i) {
      final Z ri = mR.get(i);
      if (a1.compareTo(ri) <= 0 && ri.compareTo(mA) < 0) {
        ++h;
      }
    }
    final Z result = mR.get(mN - 1).add(h + 1);
    mR.add(result);
    return result;
  }
}
