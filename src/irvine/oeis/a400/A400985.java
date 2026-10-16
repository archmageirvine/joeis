package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;

/**
 * A400985 allocated for Omar Said.
 * @author Sean A. Irvine
 */
public class A400985 extends Sequence1 {

  private final Sequence mA = new A006577();
  private int mN = 0;
  private long mRecord = 0;
  private Z mC = mA.next();
  private long mM = 1;
  private long mLen = 1;

  @Override
  public Z next() {
    final long lim = 1L << ++mN;
    while (mM < lim) {
      final Z t = mC;
      mC = mA.next();
      ++mM;
      if (!t.equals(mC)) {
        if (mLen > mRecord) {
          mRecord = mLen;
        }
        mLen = 1;
      } else {
        ++mLen;
      }
    }
    return Z.valueOf(mRecord);
  }
}
