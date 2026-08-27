package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a033.A033676;

/**
 * A399192 allocated for Eric Fodge.
 * @author Sean A. Irvine
 */
public class A399192 extends A033676 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    final Z d = super.next();
    if (d.pow(4).compareTo(++mN) < 0) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

