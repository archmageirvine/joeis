package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a397.A397366;

/**
 * A396825 Positive integers that don't occur in A397366.
 * @author Sean A. Irvine
 */
public class A396825 extends A397366 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.divide2().add(12).pow(3);
      while (mK.compareTo(m) <= 0) {
        mA.add(super.next());
        mK = mK.add(10);
      }
      if (!mA.remove(mN)) {
        return mN;
      }
    }
  }
}
