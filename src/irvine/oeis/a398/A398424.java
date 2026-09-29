package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398424 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A398424 extends Sequence0 {

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
        break;
      }
      s += mS.charAt(k++) - '0';
    }
    // We have passed the sum test, now try concatenation
    final String sn = String.valueOf(n);
    if (mS.indexOf(sn) >= 0) {
      return false;
    }
    final String rev = new StringBuilder(sn).reverse().toString();
    if (mS.indexOf(rev) >= 0) {
      return false;
    }
    return true;
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
