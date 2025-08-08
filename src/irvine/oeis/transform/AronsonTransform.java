package irvine.oeis.transform;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A sequence comprising the Aronson transform of another sequence.
 * @author Sean A. Irvine
 */
public class AronsonTransform extends Sequence1 {

  private final Sequence mB;
  private final TreeSet<Z> mBSet = new TreeSet<>();
  private final HashSet<Long> mASet = new HashSet<>();
  private long mCandidate = 0;
  private long mN = 0;

  /**
   * Construct the Aronson transform of another sequence.
   * @param b underlying sequence
   */
  public AronsonTransform(final Sequence b) {
    mB = b;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mCandidate;
      final Z c = Z.valueOf(mCandidate);
      while (mBSet.isEmpty() || mBSet.last().compareTo(c) < 0) {
        mBSet.add(mB.next());
      }
      if ((mASet.contains(mN) || c.equals(mN)) == mBSet.contains(c)) {
        mASet.add(c.longValueExact());
        return c;
      }
    }
  }
}
