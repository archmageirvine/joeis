package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399805 Starting with a(0)=0, the sequence continues with the smallest integer that cannot be formed by the sum of any tuple of consecutive digits taken from the terms already present.
 * @author Sean A. Irvine
 */
public class A399805 extends Sequence0 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = 0;

  private boolean is(final long n) {
    long s = 0;
    int k = 0;
    int j = 0;
    while (true) {
      while (s > n) {
        s -= mS.charAt(j++) - '0';
      }
      if (s == n) {
        return false;
      }
      if (k >= mS.length()) {
        return true;
      }
      s += mS.charAt(k++) - '0';
    }
  }

  @Override
  public Z next() {
    if (mS.length() == 0) {
      mS.append(0);
      return Z.ZERO;
    }
    while (true) {
      if (is(++mN)) {
        mS.append(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
