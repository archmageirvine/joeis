package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399049 allocated for Hoang Xuan Thanh.
 * @author Sean A. Irvine
 */
public class A399049 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final Z[] mA;
  private final HashSet<Z> mForbidden = new HashSet<>();

  protected A399049(final int delta) {
    mA = new Z[delta];
  }

  /** Construct the sequence. */
  public A399049() {
    this(4);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mForbidden.remove(mN)) {
        if (mA[0] != null) {
          mForbidden.add(mN.add(mA[0]));
        }
        System.arraycopy(mA, 1, mA, 0, mA.length - 1);
        mA[mA.length - 1] = mN;
        return mN;
      }
    }
  }
}
