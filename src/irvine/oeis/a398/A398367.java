package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A398367 Values written by the walker in the trampled carousel process.
 * @author Sean A. Irvine
 */
public class A398367 extends Sequence0 {

  private final DynamicIntArray mA = new DynamicIntArray();
  private int mP = 0;
  {
    mA.set(0, 1);
  }

  @Override
  public Z next() {
    mA.set(mA.length(), 1);
    final int v = mA.increment(mP);
    mP = (mP + 1 - v) % mA.length();
    if (mP < 0) {
      mP += mA.length();
    }
    return Z.valueOf(v - 1);
  }
}
