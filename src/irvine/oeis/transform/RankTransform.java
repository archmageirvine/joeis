package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * This class computes the rank transform of a sequence a(n) as described by Clark Kimberling in A187224.
 * <pre>
 * (1)  initial values: r(1)=1, h(1)=a(1);
 * (2)  counting function: h(n)= # r(i) in the half-open
        interval [a(n-1),a(n));
 * (3)  recurrence:  r(n)=r(n-1)+h(n)+1. * </pre>
 * @author Georg Fischer
 */
public class RankTransform extends AbstractSequence {

  private static final int DEFOFF = 1;

  private final Sequence mSeqA; // underlying sequence
  private Z mA1; // a(n-1)
  private Z mA; // a(n)
  private long mH; // counting function
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
    mH = mA.intValue();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return mR.get(mN);
    }
    mA1 = mA;
    mA = mSeqA.next();
    mH = 0;
//**System.err.print("# mN=" + mN + ", search in [" + mA1 + ".." + mA + "):");
    for (int i = 1; i < mN; ++i) {
      final Z ri = mR.get(i);
//**  System.err.print(" " + ri);
      if (mA1.compareTo(ri) <= 0 && ri.compareTo(mA) < 0) {
        ++mH;
      }
    }
//**System.err.println(", h=" + mH);
    final Z result = mR.get(mN - 1).add(mH + 1);
    mR.add(result);
    return result;
  }

}
