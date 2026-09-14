package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399623 allocated for Eric Fox.
 * @author Sean A. Irvine
 */
public class A399623 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  @Override
  public Z next() {
    ++mN;
    if (mN == 5) {
      return Z.ZERO; // Conjectured!
    }
    while (mA.get(mN) == 0) {
      ++mM;
      long k = 0;
      while (true) {
        ++k;
        if (mA.get(k) == 0 && mA.get(k + mM) == 0 && mA.get(k + 2 * mM) == 0) {
          mA.set(k, mM);
          mA.set(k + mM, mM);
          mA.set(k + 2 * mM, mM);
          break;
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
