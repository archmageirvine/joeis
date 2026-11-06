package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401648
 * @author Sean A. Irvine
 */
public class A401648 extends Sequence0 {

  private long mM = 3;
  private long mP = 4;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;

  /** Construct the sequence. */
  public A401648() {
    mA.set(0, 1);
    mA.set(1, 2);
    mA.set(2, 2);
    mA.set(3, 2);
  }

  @Override
  public Z next() {
    if (mN >= mP) {
      final long len = mA.get(mM) - (mM >= 5 ? mA.get(mM - 5) : 0);
      final long end = mP + len;
      for (long q = mP; q < end; ++q) {
        mA.set(q, mM);
      }
      mP = end;
      ++mM;
    }
    return Z.valueOf(mA.get(mN++));
  }
}
