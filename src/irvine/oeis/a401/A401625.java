package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401625 allocated for David Cleaver.
 * @author Sean A. Irvine
 */
public class A401625 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mM = 1;
  private long mN = -1;
  {
    mA.set(1, 2L);
    mA.set(3, 2L);
  }

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      final long t = mA.get(mM);
      mA.set(mA.length(), 3 * t);
      mA.set(mA.length(), 3 * t + 2);
      mA.set(mA.length(), 3 * t);
      mA.set(mA.length(), 3 * t + 2);
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}

