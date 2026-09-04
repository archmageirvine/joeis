package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398781 If k appears, 6*k does not.
 * @author Sean A. Irvine
 */
public class A398781 extends Sequence1 {

  private final HashSet<Z> mForbidden = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mForbidden.remove(mN)) {
        mForbidden.add(mN.multiply(6));
        return mN;
      }
    }
  }
}
